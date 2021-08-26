package com.byh.biyesheji.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Review {
    private Integer id;

    private String content;

    private Integer cstid;

    private Integer pid;

    private Date createtime;

    private Customer customer;

    private Product product;
}