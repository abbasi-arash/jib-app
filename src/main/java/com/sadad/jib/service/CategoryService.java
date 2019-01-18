package com.sadad.jib.service;

import com.sadad.jib.domain.Category;
import com.sadad.jib.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllcategory(){
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }
}
