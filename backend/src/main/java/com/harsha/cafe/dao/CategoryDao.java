package com.harsha.cafe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.cafe.pojo.Category;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Integer> {
    List<Category> getAllCategory();
}
