package com.byh.biyesheji.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderItem {
    private Integer id;

    private Integer pid;

    private Integer oid;

    private Integer cstid;

    private Integer number;//购买数量
    //新增
    private Product product;


}