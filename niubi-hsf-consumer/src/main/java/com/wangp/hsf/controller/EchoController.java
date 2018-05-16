package com.wangp.hsf.controller;

import com.wangp.hsf.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("/echo")
public class EchoController {
    @Autowired
    private EchoService echoService;

    @RequestMapping("/boom/{str}")
    public String echo(@PathVariable("str") String str) {
        return echoService.echo(str);
    }
}
