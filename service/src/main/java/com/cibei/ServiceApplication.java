package com.cibei;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/26 16:28
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = {"com.cibei.provider.service.impl","com.cibei.consumer.controller"})
@DubboComponentScan(basePackages = {"com.cibei.provider.service.impl","com.cibei.consumer.controller"})
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class,args);
    }
}
