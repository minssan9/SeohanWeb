package com.seohan.config;

public class AuthConfig {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AccountService accountService;

    @Autowired
    TokenStore tokenStore;


    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.passwordEncoder(passwordEncoder);
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("id")
                .secret(this.passwordEncoder.encode("secret"))
                .authorizedGrantTypes("password", "refresh_token")
                .scopes("read", "write")
                .accessTokenValiditySeconds(60 * 10 * 60)
                .refreshTokenValiditySeconds(60 * 10 * 6);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager)
                .userDetailsService(accountService)
                .tokenStore(tokenStore);
    }
}
