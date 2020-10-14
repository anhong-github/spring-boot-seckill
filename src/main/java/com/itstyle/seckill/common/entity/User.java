package com.itstyle.seckill.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author anhong
 * @title 用户实体
 * @date 2020/10/14
 * @since ${SINCE}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1581184604900326464L;
    private String name; //姓名
    private Integer age; //年龄
    private String sex; //性别
}
