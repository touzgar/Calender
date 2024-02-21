package com.ahmed.users;

import com.ahmed.users.entities.Role;
import com.ahmed.users.entities.User;
import com.ahmed.users.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsersApplication {
    @Autowired
    UserService userService;
    /*@PostConstruct
    void init_users() {
//ajouter les rôles
        userService.addRole(new Role(null,"ADMIN"));
        userService.addRole(new Role(null,"USER"));
//ajouter les users
        userService.saveUser(new User(null,"admin","1234",true,null));
        userService.saveUser(new User(null,"ahmed","1234",true,null));
        userService.saveUser(new User(null,"ghaith","1234",true,null));
//ajouter les rôles aux users
        userService.addRoleToUser("admin", "ADMIN");
        userService.addRoleToUser("admin", "USER");
        userService.addRoleToUser("ahmed", "USER");
        userService.addRoleToUser("ghaith", "USER");
    }*/
    @Bean
    BCryptPasswordEncoder getBCE() {
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class, args);
    }

}
