package com.sadad.jib.repository;

import com.sadad.jib.domain.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoryRepository extends MongoRepository<Category, String> {

    List<Category> findAll();

}