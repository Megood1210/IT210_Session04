package com.restaurant.session4.respository;


import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class OrderRepository {
    public String getAllOrders() {
        return "Danh sach toan bo don hang";
    }

    public String getOrderById(Long id) {
        return "Thong tin don hang voi ID: " + id;
    }
}