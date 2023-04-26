package com.github.felixlyd.orderstatesample.controller;

import com.github.felixlyd.orderstatesample.service.use.UseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UseOrderService useOrderService;

    @PostMapping("/use")
    public String useOrder(){
        useOrderService.use();
        return "使用订单成功！";
    }
}
