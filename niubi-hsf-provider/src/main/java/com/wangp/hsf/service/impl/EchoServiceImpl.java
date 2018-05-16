package com.wangp.hsf.service.impl;

import com.wangp.hsf.service.EchoService;
import org.springframework.stereotype.Service;

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
@Service("echoService")
public class EchoServiceImpl implements EchoService{
    @Override
    public String echo(String s) {
        return s;
    }
}
