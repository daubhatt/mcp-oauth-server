package com.viom.tech.mcpoauthserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        var user1 = User.withUsername("Aman")
                .password(passwordEncoder.encode("password"))
                .roles("USER")
                .build();
       var user2 = User.withUsername("Sarah")
                .password(passwordEncoder.encode("password"))
                .roles("USER")
                .build();
        var user3 = User.withUsername("Ahmed")
                .password(passwordEncoder.encode("password"))
                .roles("USER")
                .build();
        var user4 = User.withUsername("Fatima")
                .password(passwordEncoder.encode("password"))
                .roles("USER")
                .build();
        var user5 = User.withUsername("Omar")
                .password(passwordEncoder.encode("password"))
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user1, user2, user3, user4, user5);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
