package com.wangp.hsf.util;


import com.alibaba.boot.hsf.annotation.HSFConsumer;
import com.wangp.hsf.service.EchoService;
import org.springframework.context.annotation.Configuration;

/**
 * Program Name: niubi-hsf
 * <p>
 * 1. 通过配置类获取服务
 * <p>
 * Created by wangpei on 2018/5/16 0016
 *
 * @author wangpei
 * @version 1.0
 */
@Configuration
public class HSFConsumerUtil {
    @HSFConsumer(serviceVersion = "1.0.0",serviceGroup = "niubi-hsf",clientTimeout = 50000)
    private EchoService echoService;
}
