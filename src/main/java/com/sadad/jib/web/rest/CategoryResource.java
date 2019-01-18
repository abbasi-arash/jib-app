package com.sadad.jib.web.rest;

import com.sadad.jib.domain.Category;
import com.sadad.jib.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jib")
public class CategoryResource {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/v1/categories")
    public List<Category> findAllCategory(){
        return categoryService.findAllCategory();
    }
}
