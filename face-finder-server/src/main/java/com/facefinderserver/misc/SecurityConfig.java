package com.facefinderserver.misc;


import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
/*
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Resource
    private UserDetailsService userDetailsService = new CustomUserDetailService();
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Bean
    public UserDetailsService userDetailsService(){
        return new CustomUserDetailService();
    }

    @Bean
    public UserDetailsService userDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder) {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user")
        .password(bCryptPasswordEncoder.encode("userPass"))
        .roles("USER")
        .build());
        manager.createUser(User.withUsername("admin")
        .password(bCryptPasswordEncoder.encode("adminPass"))
        .roles("USER", "ADMIN")
        .build());
        return manager;
    }

    @Bean
    public AuthenticationManager authManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, CustomUserDetailService userDetailService) 
      throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
          .userDetailsService(userDetailsService)
          .passwordEncoder(bCryptPasswordEncoder)
          .and()
          .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return passwordEncoder;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf()
        .disable()
        .authorizeRequests()
        .antMatchers(HttpMethod.DELETE)
        .hasRole("ADMIN")
        .antMatchers("/admin/**")
        .hasAnyRole("ADMIN")
        .antMatchers("/user/**")
        .hasAnyRole("USER", "ADMIN")
        .antMatchers("/login/**")
        .anonymous()
        .anyRequest()
        .authenticated()
        .and()
        .httpBasic()
        .and()
        .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        return http.build();
    }
 
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("/images/**", "/js/**", "/webjars/**");
    }
    
    
    =================================================================000
    

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Bean
    private PasswordEncoder passwordEncoder(){
        return passwordEncoder;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

        auth.inMemoryAuthentication()
        .passwordEncoder(passwordEncoder());
        .withUsername("person1")
        .password(passwordEncoder().encode("psswrd1"));
        .roles("USER")
        .and()
        .withUser("person2")
        .password(passwordEncoder().encode("psswrd2"));
    

    }

}*/