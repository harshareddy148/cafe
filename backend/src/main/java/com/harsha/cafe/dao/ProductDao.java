package com.harsha.cafe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import com.harsha.cafe.pojo.Product;
import com.harsha.cafe.wrapper.ProductWrapper;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {
    List<ProductWrapper> getAllProducts();
    @Modifying
    @Transactional
    Integer updateProductStatus(@Param("status") String status,@Param("id") int id);

    List<ProductWrapper> getProductByCategory(@Param("id") Integer id);

    ProductWrapper getProductById(@Param("id") Integer id);
}
