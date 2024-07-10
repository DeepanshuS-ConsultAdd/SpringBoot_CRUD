package com.example.website.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.website.JwtAuthenticationFilter;
import com.example.website.model.MyUserDetailService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    private MyUserDetailService userDetailService;

    @Autowired
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception
    {
        return httpSecurity
        .csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable())
        .authorizeHttpRequests(registry-> {
            registry.requestMatchers("/register/**","/home","/authenticate").permitAll();
            registry.requestMatchers("/admin/**").hasRole("ADMIN");
            registry.requestMatchers("/user/**").hasRole("USER");
            registry.anyRequest().authenticated();
        })
        .formLogin(formLogin -> formLogin.permitAll())
        .addFilterBefore(jwtAuthenticationFilter,UsernamePasswordAuthenticationFilter.class)
        .build();
    }

    // @Bean
    // public UserDetailsService userDetailsService()
    // {
    //     UserDetails normalUser = User.builder()
    //                               .username("gc")
    //                               .password("$2a$12$bxgLbfCgARM6nqxx91YNHehdbcwDj0q3xb/cWaxRB8dU7QzW8UYFq")//1234
    //                               .roles("USER")
    //                               .build();
    //     UserDetails adminUser =  User.builder()
    //                               .username("admin")
    //                               .password("$2a$12$B1CwqLPFSf30u1NNvQvFw.3IlAF5atHcveQ1oL.Rexc6NdRPQqTKa")//987
    //                               .roles("ADMIN","USER")
    //                               .build();

    //     return new InMemoryUserDetailsManager(normalUser,adminUser);
    // }

    public UserDetailsService userDetailsService()
    {
        return userDetailService;
    }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    @Bean
    public AuthenticationManager authenticationManager(){

        return new ProviderManager(authenticationProvider());
    }

    // @Bean
    // public AuthenticationManager authenticationManagerBean() throws Exception {
    //     return super.authenticationManagerBean();
    // }

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

}
