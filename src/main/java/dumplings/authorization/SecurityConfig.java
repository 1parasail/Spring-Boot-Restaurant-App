package dumplings.authorization;

import dumplings.data.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecuirFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(authorize ->
                        authorize.anyRequest().authenticated()
                )
                .formLogin(form ->
                        form.loginPage("/login").permitAll()
                )
                .build();
    }

    @Bean
    UserDetailsService userDetailsService(UserRepository userRepository) {
        return username -> userRepository.findByUsername(username);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
