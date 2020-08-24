package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult get(){
        Payment paymentById = paymentService.getPaymentById(1);
        return new CommonResult(200,"查询成功",paymentById);
    }
}
