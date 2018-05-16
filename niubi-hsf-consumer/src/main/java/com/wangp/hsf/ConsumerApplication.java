package com.wangp.hsf;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Program Name: niubi-hsf
 * <p>
 *  1.使用配置类HSFConsumerUtil发现服务
 *  2.使用ImportResource注解引入配置发现服务
 * <p>
 * Created by wangpei on 2018/5/16 0016
 *
 * @author wangpei
 * @version 1.0
 */
@SpringBootApplication
/*@ImportResource({"classpath*:spring/spring*.xml"})*/
public class ConsumerApplication {
    public static void main (String[] args) {
        SpringApplication springApplication = new SpringApplication(ConsumerApplication.class);
       // 启动 Pandora Boot 用于加载 Pandora 容器
        PandoraBootstrap.run(args);
        springApplication.run(args);
        // 标记服务启动完成,并设置线程 wait。防止业务代码运行完毕退出后，导致容器退出。
        PandoraBootstrap.markStartupAndWait();

    }
}
