package com.github.felixlyd.orderstatesample.service;

import com.alibaba.cola.statemachine.Action;
import com.alibaba.cola.statemachine.Condition;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;


/**
 * interface OrderService: do something
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
public interface OrderService {
    Condition<OrderContext> check();

    Action<OrderStatusEnum, EventsEnum, OrderContext> action();
}