package com.github.felixlyd.orderstatesample.service.impl;

import com.alibaba.cola.statemachine.Action;
import com.alibaba.cola.statemachine.Condition;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;
import com.github.felixlyd.orderstatesample.service.OrderService;

/**
 * class RevokeOrderServiceImpl: 撤销订单
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
public class RevokeOrderServiceImpl implements OrderService {
    @Override
    public Condition<OrderContext> check() {
        return null;
    }

    @Override
    public Action<OrderStatusEnum, EventsEnum, OrderContext> action() {
        return null;
    }
}
