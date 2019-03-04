package com.qtu404.sirius.controller;

import com.qtu404.sirius.model.User;
import com.qtu404.sirius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("say/hi")
    public String sayHi(@RequestParam String name) {
        return userService.sayHi(name);
    }

    @GetMapping("find/by/id")
    public User findById(@RequestParam Long id){
        return userService.findById(id);
    }

    @PostMapping("create")
    public Long createUser(@RequestBody User user){
        return userService.create(user);
    }
}
