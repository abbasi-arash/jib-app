package com.sadad.jib.repository;

import com.sadad.jib.domain.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {

}
