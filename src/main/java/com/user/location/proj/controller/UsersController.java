package com.user.location.proj.controller;

import com.user.location.proj.models.Users;
import com.user.location.proj.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/userDetails")
    public List<Users> getUser(){
        return this.usersService.getUsers();
    }
}
