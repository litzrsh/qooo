package me.litzrsh.qooo.web.security.config;

import lombok.RequiredArgsConstructor;
import me.litzrsh.qooo.web.security.core.service.QoooJdbcUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class QoooWebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final QoooJdbcUserDetailsService userDetailsService;

    private final PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Disable CSRF Token
        http.csrf().disable();

        // Disable Session management
        http.sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.NEVER)
                .disable();

        // Http Request authorization
        http
                .authorizeRequests()
                .anyRequest().permitAll();

        // Disable default login/logout methods
        http
                .formLogin().disable()
                .logout().disable()
                .rememberMe().disable();
    }
}
