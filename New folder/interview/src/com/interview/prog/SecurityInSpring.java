package com.interview.prog;
//security is a process of authentication and athorization.
//Authenciation - process of verifying the identity of a user, based on provided credentials,like Who are you?
//Authentication is the process of verifying the identity of a user or system to ensure that they are who they claim to be. 
//It typically involves verifying credentials, such as usernames and passwords, but can also include other 
//methods such as biometric verification (fingerprints, facial recognition), security tokens, or multi-factor authentication (MFA), 
//where multiple forms of verification are used.
//In software systems, authentication ensures that only authorized users can access certain resources, systems, or data.

//Authorization - process of determining if a user has proper permission to perform a particular action, assuming that
//the user is successfully authenticated.

//1. add required dependency in pom.xml like spring security, otauth2, jwt
/*
	<dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.security.oauth.boot</groupId>
        <artifactId>spring-security-oauth2-autoconfigure</artifactId>
        <version>2.1.0.RELEASE</version>
    </dependency>
*/
//2.Configure OAuth2 Authorization Server:
//Configure Spring Security to act as an OAuth2 authorization server by creating a configuration class annotated
//with @EnableAuthorizationServer.

/*
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("client-id")
                .secret("client-secret")
                .authorizedGrantTypes("password", "refresh_token")
                .scopes("read", "write")
                .accessTokenValiditySeconds(3600) // 1 hour
                .refreshTokenValiditySeconds(86400); // 24 hours
    }
}
*/
//3.Configure Resource Server: In order to match client access
//	Configure Spring Security to act as a resource server by creating a configuration class annotated with @EnableResourceServer.
 	
/*
 @Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/api/**").authenticated();
    }
}

//4. Configure Spring Security
//The @EnableGlobalMethodSecurity permits to specify security on the method level. 
//Its attribute proxyTargetClass is set in order to have this working for RestController’s methods,
// because controllers are usually classes, not implementing any interfaces.
// we can use these annotations ,prePostEnabled = true to access control at the method level based on custom security.

  
 /* @Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
public class ServerSecurityConfig extends WebSecurityConfigurerAdapter {

   private final CustomAuthenticationEntryPoint customAuthenticationEntryPoint;

   private final UserDetailsService userDetailsService;

   public ServerSecurityConfig(CustomAuthenticationEntryPoint customAuthenticationEntryPoint, @Qualifier("userService")
           UserDetailsService userDetailsService) {
       this.customAuthenticationEntryPoint = customAuthenticationEntryPoint;
       this.userDetailsService = userDetailsService;
   }

   @Bean
   public DaoAuthenticationProvider authenticationProvider() {
       DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
       provider.setPasswordEncoder(passwordEncoder());
       provider.setUserDetailsService(userDetailsService);
       return provider;
   }

   @Bean
   public PasswordEncoder passwordEncoder() {
       return new BCryptPasswordEncoder();
   }

   @Bean
   @Override
   public AuthenticationManager authenticationManagerBean() throws Exception {
       return super.authenticationManagerBean();
   }

   @Override
   protected void configure(HttpSecurity http) throws Exception {
       http
               .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
               .and()
               .authorizeRequests()
               .antMatchers("/api/signin/**").permitAll()
               .antMatchers("/api/glee/**").hasAnyAuthority("ADMIN", "USER")
               .antMatchers("/api/users/**").hasAuthority("ADMIN")
               .antMatchers("/api/**").authenticated()
               .anyRequest().authenticated()
               .and().exceptionHandling().authenticationEntryPoint(customAuthenticationEntryPoint)
               .accessDeniedHandler(new CustomAccessDeniedHandler());
   }



}
 */
 
//5.Implement UserDetailsService:
// Implement a UserDetailsService to provide user details for authentication.
/*
 * @Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Implement user retrieval logic from database or any other source
        // Return UserDetails object based on retrieved user details
         
   private final UserRepository repository;

   public UserService(UserRepository repository) {
       this.repository = repository;
   }

   @Override
   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user = repository.findByEmail(username).orElseThrow(() -> new RuntimeException("User not found: " + username));
       GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole().name());
       return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), Arrays.asList(authority));
   }
    }
}
 */
//6.Configure JWT Token Store:
//Configure JWT token store to generate and validate JWT tokens.
/*
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableAuthorizationServer
public class SecurityConfig {

    private final UserDetailsService userDetailsService;

    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public TokenStore tokenStore() {
        return new JwtTokenStore(accessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey("jwt-secret-key");
        return converter;
    }

    // Other configurations...
}
 */
//7 Implement REST Controller:
//Implement a REST controller to handle protected API endpoints.
/*
 * @RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    // Other API endpoints...
}
 */
//7 Testing:
//Test the secured endpoints using an OAuth2 client (such as Postman)
//by obtaining an access token from the authorization server and including it in the request headers.

;





