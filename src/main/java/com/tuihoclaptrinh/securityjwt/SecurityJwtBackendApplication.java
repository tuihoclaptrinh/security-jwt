package com.tuihoclaptrinh.securityjwt;

import com.tuihoclaptrinh.securityjwt.domain.Role;
import com.tuihoclaptrinh.securityjwt.domain.User;
import com.tuihoclaptrinh.securityjwt.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SecurityJwtBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityJwtBackendApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "Hoàng Tuấn Anh", "tuananh", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Nguyễn Hoàng Tuấn Khoa", "tuankhoa", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Nguyễn Thị Tỉnh", "tinhnguyen", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Nguyễn Lê Hoài Thương", "thuongnguyen", "1234", new ArrayList<>()));

            userService.addRoleToUser("tuananh", "ROLE_USER");
            userService.addRoleToUser("tuananh", "ROLE_MANAGER");
            userService.addRoleToUser("thuongnguyen", "ROLE_MANAGER");
            userService.addRoleToUser("thuongnguyen", "ROLE_ADMIN");
            userService.addRoleToUser("thuongnguyen", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("tinhnguyen", "ROLE_MANAGER");
            userService.addRoleToUser("tuankhoa", "ROLE_USER");

        };
    }

}
