package com.ijse.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.ijse.demo.dto.OrderDTO;
import com.ijse.demo.entity.Order;

@Service
public interface OrderService {
    
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order createOrder(OrderDTO orderDTO);
}
