package com.byh.biyesheji.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class ZiXun {
    private Integer id;

    private String content;

    private Integer cstid;

    private Integer status;

    private Date fabudate;

    private Customer customer;

}