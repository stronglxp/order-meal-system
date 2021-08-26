package com.byh.biyesheji.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Order {

    private Integer id;

    private String code;//订单编号

    private String address;

    private Integer status;

    private Integer cstid;

    private List<OrderItem> orderItems;

    private Customer customer;

    private float total;  //总价

    private int totalNumber; //总数量

}