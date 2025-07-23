package com.zwj.entity;

import lombok.Data;

/**
 * @Author 郑文俊
 * @ProjectName
 * @Date
 * @WeChat：
 * @QQ：
 * @apiNote
 */
@Data
public class Car {
    private Integer cid;
    private String cname;
    private Double price;
    private Integer tid;
    private String tname;
    private int state;
    private String imgurl;
    private Integer bid;
    private String bname;
}
