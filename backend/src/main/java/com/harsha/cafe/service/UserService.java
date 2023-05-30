package com.harsha.cafe.service;

import org.springframework.http.ResponseEntity;

import com.harsha.cafe.wrapper.UserWrapper;

import java.util.List;
import java.util.Map;

public interface UserService {
    public ResponseEntity<String> signup(Map<String, String> requestMap);

    public ResponseEntity<String> login(Map<String, String> requestMap);

    public ResponseEntity<List<UserWrapper>> getAllUsers();

    public ResponseEntity<String> update(Map<String, String> requestMap);

    public ResponseEntity<String> checkToken();

    public ResponseEntity<String> changePassword(Map<String, String> requestMap);

    public ResponseEntity<String> forgotPassword(Map<String, String> requestMap);
}
