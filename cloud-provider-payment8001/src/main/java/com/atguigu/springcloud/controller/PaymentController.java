package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult get(@PathVariable("id") Long  id ){
        log.info("id-{}",id);
        Payment paymentById = paymentService.getPaymentById(id);
        return new CommonResult(200,"查询成功",paymentById);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public CommonResult save(@RequestBody Payment payment){
        log.info("payment-{}",payment.getSerial());
        int count = paymentService.save(payment);
        if(count == 0){
            return new CommonResult(500,"插入失败",count);
        }
        return new CommonResult(200,"插入成功",count);

    }
}
