package com.shmalts.javaacademyhw3.dto;

import com.shmalts.javaacademyhw3.entity.OrderStatus;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class OrderDto {

    private Integer id;
    private String description;
    private OrderStatus status;

    public OrderDto(Integer id, String description, OrderStatus status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
