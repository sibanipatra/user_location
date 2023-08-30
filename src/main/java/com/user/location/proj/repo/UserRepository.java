package com.user.location.proj.repo;

import com.user.location.proj.models.Users;
import java.util.Optional;

public interface UserRepository{
    public Optional<Users> findByUsername(String userName);
}
