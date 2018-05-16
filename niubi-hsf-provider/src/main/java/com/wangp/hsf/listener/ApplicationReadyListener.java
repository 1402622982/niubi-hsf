package com.wangp.hsf.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * Program Name: niubi-hsf
 * <p>
 * Description:
 * <p>
 * Created by wangpei on 2018/5/16 0016
 *
 * @author wangpei
 * @version 1.0
 */
public class ApplicationReadyListener implements ApplicationListener<ApplicationReadyEvent> {
    Logger logger = LoggerFactory.getLogger(ApplicationReadyListener.class);
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        logger.info("niubi-hsf provider started");
    }
}
