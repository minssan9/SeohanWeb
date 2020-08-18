package com.seohan.auth.Controller;

import com.seohan.auth.Dto.Account;
import com.seohan.auth.Service.AccountAdapter;
import com.seohan.auth.Service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/auth")
@Slf4j 
@RestController
class AccountController {
	@Autowired
	private AccountService accountService;
//	@Autowired
//    private JwtService jwtService;


	@GetMapping
	@Description("로그인 사용자 정보가져오기")
	public ResponseEntity<Account> getAccount(@AuthenticationPrincipal AccountAdapter adapter) {

		if (adapter == null) {
			return new ResponseEntity(HttpStatus.UNAUTHORIZED);
		}

//		Optional<Account> optionalAccount = AccountRepository.findByAccountId(adapter.getAccount().getAccountId());
//		Account account = optionalAccount.get();

		Optional<Account> optionalAccount = accountService.findByAccountId(adapter.getAccount().getAccountId());
		Account account = optionalAccount.get();
		return ResponseEntity.ok().body(account);
	}
	@PostMapping
	@Description("회원가입")
	public ResponseEntity<Account> createAccount(@RequestBody Account account) {

		Optional<Account> byAccountId = accountService.findByAccountId(account.getAccountId());

		// 이미 존재하는 아이디
		if (byAccountId.isPresent()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

//		Account savedAccount = accountService.createAccount(account);

//		Chat chat1 = Chat.builder()
//				.account(savedAccount)
//				.build();
//
//		chatRepository.save(chat1);

		return new ResponseEntity<>(HttpStatus.OK);
	}





//	@PostMapping("/userinfo")
//	@ResponseBody
//	public ResponseEntity<Account> getOneMember(RequestEntity<Account> reqeustEntity) {
//		String accessToken = reqeustEntity.getHeaders().get("Authorization").toString();
//		Account account = reqeustEntity.getBody();
//
//		if (jwtService.isUsable(accessToken)) {
//			Account loadedAccount = accountService.findByAsabnAndCo_gb(account.getAccountId(), account.getCompanyCode()).get();
//
//			return new ResponseEntity<Account>(loadedAccount, HttpStatus.OK);
//		} else {
//			return new ResponseEntity<Account>(account, HttpStatus.UNAUTHORIZED);
//		}
//	}
//    @PostMapping("/signin")
//	@ResponseBody
//    public ResponseEntity<Account> signin(RequestEntity<Account> reqeustEntity){
//		Account account = reqeustEntity.getBody();
//        Account loginAccount = accountService.signin(account.getCompanyCode(), account.getAsabn(), account.getPass());
//        String token = jwtService.create("account", loginAccount, "account");
//		HttpHeaders responseHeaders = new HttpHeaders();
//		responseHeaders.set("Authorization", token);
//		return new ResponseEntity<Account>(loginAccount, responseHeaders, HttpStatus.OK);
////		responseHeaders.set("Authorization", jwtService.create("account", loginUser, "user"));
////		return new ResponseEntity<User>(loginUser, responseHeaders, HttpStatus.OK);
//    }

//	@PostMapping("save")
//	public ResponseEntity<Account> createMember(@RequestBody Account member)  throws Exception {
//		Account memberCreated= memberService.save(member );
//		
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+memberCreated.getRtime()	).buildAndExpand(memberCreated.getRtime()).toUri();
////		return   ResponseEntity.created(uri).build();
//		return new ResponseEntity<Account>(memberCreated, HttpStatus.OK);
//	}	 
}
