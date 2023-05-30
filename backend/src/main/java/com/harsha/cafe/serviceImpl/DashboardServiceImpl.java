package com.harsha.cafe.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.harsha.cafe.dao.BillDao;
import com.harsha.cafe.dao.CategoryDao;
import com.harsha.cafe.dao.ProductDao;
import com.harsha.cafe.service.DashboardService;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DashboardServiceImpl implements DashboardService {
    private final CategoryDao categoryDao;
    private final ProductDao productDao;
    private final BillDao billDao;
    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("category", categoryDao.count());
            map.put("product", productDao.count());
            map.put("bill", billDao.count());
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return new ResponseEntity<>(new HashMap<>(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
