package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//返回给前端的数据封装
@Data
@AllArgsConstructor //全参构造器
@NoArgsConstructor // 无参构造器
public class CommonResult<T> {

    //返回给前端的状态码
    private Integer code;

    private String message;

    private T data;

    //data为null的封装
    public CommonResult(Integer code , String message){
        this(code,message,null);
    }
}
