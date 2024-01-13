package com.fantasy.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Integer id;

    private Integer userId;

    private String name;

    private Double price;

    private Integer num;

    private User user;

}
