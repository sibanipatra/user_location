package com.user.location.proj.repo;

import com.user.location.proj.models.UsersLocation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersLocationRepository extends MongoRepository<UsersLocation, Integer> {
}
