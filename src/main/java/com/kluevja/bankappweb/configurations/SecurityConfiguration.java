package com.kluevja.bankappweb.configurations;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
import net.bytebuddy.implementation.bind.annotation.BindingPriority;
>>>>>>> 10e576b (We continue to work with authorization)
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
<<<<<<< HEAD
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
=======
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
>>>>>>> 10e576b (We continue to work with authorization)
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    private CustomAuthenticationProvider authProvider;

    @Bean
    public AuthenticationManager authManager(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.authenticationProvider(authProvider);
        return authenticationManagerBuilder.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
       return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
<<<<<<< HEAD
        http.cors().and().csrf().disable()
                .authorizeHttpRequests((requests) -> requests
                        .antMatchers("/", "/login/**", "/css/**", "/js/**").permitAll()
                        .antMatchers("/client", "/account").hasAuthority("OPER")
=======

        http.cors().and().csrf().disable()
                .authorizeHttpRequests((requests) -> requests
                        .antMatchers("/","/login").permitAll()//,"/client/**" попробовать зайти и создать пароль и дб
>>>>>>> 10e576b (We continue to work with authorization)
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .usernameParameter("email")
                        .passwordParameter("password")
                        .permitAll()
                )
                .logout(LogoutConfigurer::permitAll)
                .exceptionHandling().accessDeniedPage("/accessDenied");

        return http.build();
    }
}
