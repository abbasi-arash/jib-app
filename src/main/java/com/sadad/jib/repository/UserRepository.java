package com.sadad.jib.repository;

import com.sadad.jib.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByNationalNumber(String nationalNumber);
}
