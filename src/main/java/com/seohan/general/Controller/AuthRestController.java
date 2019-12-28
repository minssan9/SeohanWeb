package com.seohan.general.Controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seohan.general.Domain.User;
import com.seohan.general.Mapper.UserRepository;

import lombok.extern.slf4j.Slf4j; 

@RequestMapping("/auth")
@Slf4j 
@RestController
class AuthRestController {  
//	@Autowired
//	private UserDetailsService userService;
	@Autowired
	private UserRepository userRepository;
 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	 
	@GetMapping("")
	public @ResponseBody List<User> getAllList(@RequestParam String companyCode) throws Exception {		
		return userRepository.findByCompanyCode(companyCode); 
	}

	@GetMapping("/userinfo")
	public @ResponseBody User getOneUser(@RequestParam String id) throws Exception { 
		return userRepository.findByAsabn(id);
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
	@PostMapping("/signin")
	public ResponseEntity<User> updateUser(@RequestBody User user ) throws Exception { 		
		User userSignin = userRepository.findByAsabn(user.getAsabn());
		if (userSignin.getPass().equals(user.getPass())) {
			
		}
		return new ResponseEntity<User>(userSignin, HttpStatus.OK);
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
