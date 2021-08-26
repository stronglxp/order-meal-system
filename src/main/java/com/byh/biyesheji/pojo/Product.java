package com.byh.biyesheji.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
    private Integer id;

    private String name;

    private Float price;

    private Integer zan;

    private Integer number;

    private Integer status;

    private String imageurl;

    private String miaoshu;

    private Integer cid;

    private Long bid;

    private Category category;
    private User user;


}