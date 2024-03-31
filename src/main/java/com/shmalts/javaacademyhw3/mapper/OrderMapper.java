package com.shmalts.javaacademyhw3.mapper;

import com.shmalts.javaacademyhw3.dto.OrderDto;
import com.shmalts.javaacademyhw3.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order toModel(OrderDto orderDto);

    OrderDto toDto(Order order);
}
