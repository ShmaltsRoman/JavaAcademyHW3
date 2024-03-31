package com.shmalts.javaacademyhw3.contoller;

import com.shmalts.javaacademyhw3.annotation.LogRequest;
import com.shmalts.javaacademyhw3.dto.OrderDto;
import com.shmalts.javaacademyhw3.dto.UserDto;
import com.shmalts.javaacademyhw3.entity.Order;
import com.shmalts.javaacademyhw3.entity.User;
import com.shmalts.javaacademyhw3.mapper.OrderMapper;
import com.shmalts.javaacademyhw3.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final OrderMapper orderMapper;

    public OrderController(OrderService orderService, OrderMapper orderMapper) {
        this.orderService = orderService;
        this.orderMapper = orderMapper;
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    @LogRequest
    public OrderDto createOrder(@RequestBody OrderDto orderDto) {
        Order order = orderMapper.toModel(orderDto);

        return orderMapper.toDto(orderService.createOrder(order));
    }
}
