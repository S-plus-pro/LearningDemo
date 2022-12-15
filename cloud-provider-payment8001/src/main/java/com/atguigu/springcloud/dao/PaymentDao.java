package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

@Component //作为一个主键被发现
@MapperScan("com.atguigu.springcloud.dao")  //Mapper的扫描路径
public interface PaymentDao {

    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Integer id);

}
