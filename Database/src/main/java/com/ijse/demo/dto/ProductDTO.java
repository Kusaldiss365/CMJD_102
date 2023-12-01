package com.ijse.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private String name;
    private Double price;
    private Integer qty;
    private Long categoryId;

    
}
