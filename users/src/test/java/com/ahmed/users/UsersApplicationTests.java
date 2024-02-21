package com.ahmed.users;

import com.ahmed.users.entities.Role;
import com.ahmed.users.repos.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class UsersApplicationTests {

    @Autowired
    RoleRepository roleRep;
    @Test
    void contextLoads() {
        Role r=roleRep.findByRole("USER");
        System.out.println(r);
        List<Role> roles=new ArrayList<>();
        roles.add(r);

        System.out.println(roles);
    }

}
