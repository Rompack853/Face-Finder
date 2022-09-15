/*package com.facefinderserver.misc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.facefinderserver.repository.AccountRepository;
import com.model.UserAccount;

@Service
public class CustomUserDetailService implements UserDetailsService {
    
    @Autowired
    private AccountRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        final UserAccount basicAccount = customerRepository.findByUsername(username);
        if (basicAccount == null) {
            throw new UsernameNotFoundException(username);
        }
        UserDetails user = User.withUsername(basicAccount.getUsername()).password(basicAccount.getSecret()).authorities("USER").build();
        return user;
    }
}*/