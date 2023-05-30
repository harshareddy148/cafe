package com.harsha.cafe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import com.harsha.cafe.pojo.User;
import com.harsha.cafe.wrapper.UserWrapper;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByEmailId(@Param("email") String email);
    List<UserWrapper> getAllUser();
    List<String> getAllAdmin();
    @Transactional
    @Modifying
    Integer updateStatus(@Param("status") String status, @Param("id") Integer id);
    User findByEmail(String email);
}
