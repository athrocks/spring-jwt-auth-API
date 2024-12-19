package com.telusko.SecurityEx01.service;

import com.telusko.SecurityEx01.model.UserModel;
import com.telusko.SecurityEx01.model.UserPrincipal;
import com.telusko.SecurityEx01.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println("Searching for user: " + username);
        UserModel user = userRepo.findByUsername(username);

        if(user == null) {
            System.out.println("User Not Found");
            throw new UsernameNotFoundException("User Not Found");
        }

        System.out.println("User Found");
        return new UserPrincipal(user);
    }
}
