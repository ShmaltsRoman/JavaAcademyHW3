package com.shmalts.javaacademyhw3.service;

import com.shmalts.javaacademyhw3.annotation.LogRequest;
import com.shmalts.javaacademyhw3.entity.Order;
import com.shmalts.javaacademyhw3.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}
