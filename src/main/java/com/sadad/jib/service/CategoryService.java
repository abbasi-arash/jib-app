package com.sadad.jib.service;

import com.sadad.jib.domain.Category;
import com.sadad.jib.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.action.PutAllAction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategory() {
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }

    public Map<Integer, String> findAllCategoryName() {
        Map<Integer, String> result = new HashMap<>();
        List<Category> categories = categoryRepository.findAll();
        for (Category item : categories) {
            result.put(item.getTerminal(), item.getCategoryName());
        }
        return result;
    }
}
