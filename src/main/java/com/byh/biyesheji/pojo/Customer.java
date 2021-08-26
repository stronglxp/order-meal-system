package com.byh.biyesheji.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Customer {
    private Integer id;

    private String name;

    private String password;

    private String address;

    private String phone;

    private Integer status;

}