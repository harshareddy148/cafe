package com.harsha.cafe.service;

import org.springframework.http.ResponseEntity;

import com.harsha.cafe.pojo.Category;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    public ResponseEntity<String> addCategory(Map<String, String> requestMap);

    public ResponseEntity<List<Category>> getCategories(String filterValue);
    public ResponseEntity<String> updateCategory(Map<String, String> requestMap);
}
