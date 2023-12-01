package com.ijse.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.demo.dto.OrderDTO;
import com.ijse.demo.entity.Order;
import com.ijse.demo.service.OrderService;

@RestController
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders(){
        return ResponseEntity.status(200).body(orderService.getAllOrders());
    } 

    @GetMapping("/orders/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id){
        return ResponseEntity.status(200).body(orderService.getOrderById(id));
    }

    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder(@RequestBody OrderDTO orderDTO){
        Order newOrder = orderService.createOrder(orderDTO);

        return ResponseEntity.status(201).body(newOrder);
    }
}
