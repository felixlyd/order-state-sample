package com.github.felixlyd.orderstatesample.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class OrderController: do something
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
@RestController
public class OrderController {
    @PostMapping("/use")
    public String useOrder(){
        return "使用订单成功！";
    }
}
