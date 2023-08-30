package com.user.location.proj.services;

import com.user.location.proj.models.Users;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UsersService {
    List<Users> users = new ArrayList<>();

    public void userService(){
        users.add(new Users(UUID.randomUUID().toString(), "admin", "admin", "ADMIN"));
        users.add(new Users(UUID.randomUUID().toString(), "customer", "customer", "CUSTOMER"));
    }

    public List<Users> getUsers(){
        return this.users;
    }
}
