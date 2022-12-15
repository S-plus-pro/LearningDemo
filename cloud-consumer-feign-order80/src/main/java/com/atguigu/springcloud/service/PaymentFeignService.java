package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Administrator
 */
@Component //作为组件被发现
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")  //指定远程调用微服务名称
public interface PaymentFeignService {

    @GetMapping("/payment/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id);

    @GetMapping("/payment/fegin/timeout")
    public String PaymentFeginTimeout();
}
