package com.seohan.auth.Controller;

import com.seohan.auth.Domain.Member;
import com.seohan.auth.Mapper.MemberRepository;
import com.seohan.auth.Service.MemberService;
import com.seohan.common.Service.jwt.JwtService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Optional;

@RequestMapping("/auth")
@Slf4j 
@RestController
class AuthRestController {  
	@Autowired
	private MemberService memberService;
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
    private JwtService jwtService;
	
 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	 
	@PostMapping("/userinfo")
	@ResponseBody
	public ResponseEntity<Member> getOneMember(RequestEntity<Member> reqeustEntity) {
		String accessToken = reqeustEntity.getHeaders().get("Authorization").toString();
		Member member = reqeustEntity.getBody();

		if (jwtService.isUsable(accessToken)) {
			Member loadedMember = memberRepository.findByAsabnAndCo_gb(member.getAsabn(), member.getCompanyCode()).get();

			return new ResponseEntity<Member>(loadedMember, HttpStatus.OK);
		} else {
			return new ResponseEntity<Member>(member, HttpStatus.UNAUTHORIZED);
		}
	}

    @PostMapping("/signin")
	@ResponseBody
    public ResponseEntity<Member> signin(RequestEntity<Member> reqeustEntity){
		Member member = reqeustEntity.getBody();
        Member loginMember= memberService.signin(member.getCompanyCode(), member.getAsabn(), member.getPass());
        String token = jwtService.create("member", loginMember, "member");
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Authorization", token);
		return new ResponseEntity<Member>(loginMember, responseHeaders, HttpStatus.OK);
    }

//	@PostMapping("save")
//	public ResponseEntity<Member> createMember(@RequestBody Member member)  throws Exception {		
//		Member memberCreated= memberService.save(member );  
//		
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+memberCreated.getRtime()	).buildAndExpand(memberCreated.getRtime()).toUri();
////		return   ResponseEntity.created(uri).build();
//		return new ResponseEntity<Member>(memberCreated, HttpStatus.OK);
//	}	 
}
