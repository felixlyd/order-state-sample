package com.github.felixlyd.orderstatesample.service.impl;

import com.alibaba.cola.statemachine.Action;
import com.alibaba.cola.statemachine.Condition;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;
import com.github.felixlyd.orderstatesample.service.OrderService;
import com.github.felixlyd.orderstatesample.service.ThirdPartyOrderService;

/**
 * class UseOrderWithThirdPartyServiceImpl: 外呼第三方使用订单方法
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
public class UseOrderWithThirdPartyServiceImpl implements OrderService, ThirdPartyOrderService {
    @Override
    public Condition<OrderContext> check() {
        return null;
    }

    @Override
    public Action<OrderStatusEnum, EventsEnum, OrderContext> action() {
        return null;
    }

    @Override
    public String query() {
        return null;
    }

    @Override
    public String use() {
        return null;
    }

    @Override
    public boolean isSupportRevoke() {
        return false;
    }

    @Override
    public String revoke() {
        return null;
    }
}
