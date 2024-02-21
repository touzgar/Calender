package com.ahmed.users.restControllers;
import com.ahmed.users.entities.Role;
import com.ahmed.users.entities.User;
import com.ahmed.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
//@CrossOrigin(origins = "http://localhost:4200")

public class UserRestController {
    @Autowired
    UserService userService;
    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping(path = "addUser", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @RequestMapping(path="deleteUser/{id}",method=RequestMethod.DELETE)
    public void deleteUserById(@PathVariable long id) {
        userService.deleteUser(id);
    }

    @RequestMapping(path="addRole/{id}",method=RequestMethod.POST)
    public User addRoleToUser(@PathVariable long id,@RequestBody Role r) {
        return userService.addRoleToUser(id, r);
    }

    @RequestMapping(path="getUser/{id}",method=RequestMethod.GET)
    public User findUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }

    @RequestMapping(path="allRoles",method=RequestMethod.GET)
    public List<Role> getAllRoles() {
        return userService.findAllRoles();
    }

    @RequestMapping(path="role/{id}",method=RequestMethod.GET)
    public Role findRoleById(@PathVariable Long id) {
        return userService.findRoleById(id);
    }
    @RequestMapping(path="removeRole/{id}",method=RequestMethod.POST)
    public User removeRole(@PathVariable long id,@RequestBody Role r)
    {
        return  userService.removeRoleFromUser(id,r);
    }


    @RequestMapping(path = "activateUser/{username}/{verificationCode}", method = RequestMethod.POST)
    public User activateUser(@PathVariable String username, @PathVariable String verificationCode) {
        System.out.println("user activated: " + verificationCode);
        return userService.activateUser(username, verificationCode);
    }

}