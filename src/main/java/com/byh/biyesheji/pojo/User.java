package com.byh.biyesheji.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class User {

    private Long id;

    private String name;

    private String password;

    private String salt;

    private Integer status;

    private String address;

    private String phone;

    private Date lasttime;

}