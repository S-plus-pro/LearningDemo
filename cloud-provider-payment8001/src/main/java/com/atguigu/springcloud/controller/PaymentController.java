package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.TimeUnit;

@RestController  //代表返回的是json格式的数据
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentServiceImpl;

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult<Payment> create(@RequestBody Payment payment) { //不加RequestBody的话，可以插入，但是数据库显示为空。
        int result = paymentServiceImpl.create(payment);
        log.info("*****插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功", result);
        }
        else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @RequestMapping("/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id) {
        Payment payment = paymentServiceImpl.getPaymentById(id);
        System.out.println("Port = " + port);
        log.info("*****查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功", payment);
        }
        else {
            return new CommonResult(444, "没有对应记录，查询id：" + id, null);
        }
    }

    @GetMapping("/zipkin")
    public String paymentZipkin() {
        return "Hi, I am zipkinserver!!!!!!!!!!!!!!!!!!!!!";
    }

    @RequestMapping("/fegin/timeout")
    public String PaymentFeginTimeout() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return port;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
