package com.restaurant.session4.Bai5.service;


import com.restaurant.session4.Bai5.respository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("OrderServiceB5")
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getOrderDetail(Long id) {
        return orderRepository.findOrder(id);
    }

    public String createNewOrder() {
        return orderRepository.saveOrder();
    }

    public String cancelOrder(Long id) {
        return orderRepository.deleteOrder(id);
    }
}