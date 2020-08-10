package com.seohan.auth.Controller;

import com.seohan.common.Service.Jwt.JwtService;
import com.seohan.erp.general.Domain.User;
import com.seohan.erp.general.Mapper.UserRepository;
import com.seohan.erp.general.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;

@RequestMapping("/auth")
@Slf4j 
@RestController
class AuthRestController {  
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;
	@Autowired
    private JwtService jwtService;
	
 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	 
	@PostMapping("/userinfo")
	public ResponseEntity<User> getOneUser(@RequestBody User user, HttpServletRequest request) throws Exception {
		String accessToken = request.getHeader("Authorization");
		if (jwtService.isUsable(accessToken)) {
			return new ResponseEntity<User>(userRepository.findByAsabnAndCo_gb(user.getAsabn(), user.getCompanyCode()), HttpStatus.OK);
		} else {
			return new ResponseEntity<User>(userRepository.findByAsabnAndCo_gb(user.getAsabn(), user.getCompanyCode()), HttpStatus.UNAUTHORIZED);
		}
	}
	
	@GetMapping("/login")
	public String login(Model model, String error, String logout) {
		if ( error != null ) {
			model.addAttribute("errorMsg", "Your username and password are invalid.");
		}
		if ( logout != null ) {
			model.addAttribute("msg", "You have been logged out successfully");
		}
		return "login.html";
	}
	
//	@PostMapping("/signin")
//	public ResponseEntity<User> updateUser(@RequestBody User user ) throws Exception { 		
//		User userSignin = userRepository.findByAsabn(user.getAsabn());
//		if (userSignin.getPass().equals(user.getPass())) {
//			
//		}
//		return new ResponseEntity<User>(userSignin, HttpStatus.OK);
//	}
	
    
    @PostMapping("/signin")
    public ResponseEntity<User> signin(@RequestBody User user){
        User loginUser= userService.signin(user.getCompanyCode(), user.getAsabn(), user.getPass());
        String token = jwtService.create("member", loginUser, "user");
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Authorization", token);
		return new ResponseEntity<User>(loginUser, responseHeaders, HttpStatus.OK);
    }

//	@PostMapping("save")
//	public ResponseEntity<User> createUser(@RequestBody User user)  throws Exception {		
//		User userCreated= userService.save(user );  
//		
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+userCreated.getRtime()	).buildAndExpand(userCreated.getRtime()).toUri();
////		return   ResponseEntity.created(uri).build();
//		return new ResponseEntity<User>(userCreated, HttpStatus.OK);
//	}	 
}
