package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;
    //   “http://” 头不能缺少
    public static final  String PAYMENT_URL = "http://127.0.0.1:8001";

    //get方式
    @GetMapping("/consumer/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        //getForObject（接口路由,入参，返回实体.class）
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
    //post方式 @RequestBody 注解不要忘记
    @PostMapping("/consumer/save")
    public CommonResult<Payment> savePayment(@RequestBody Payment payment){
        //postForObject(接口路由，入参，返回实体类.class)
        return restTemplate.postForObject(PAYMENT_URL+"/payment/save",payment,CommonResult.class);
    }

}
