package com.github.felixlyd.orderstatesample.handler.cancel;

import com.alibaba.cola.statemachine.Action;
import com.alibaba.cola.statemachine.Condition;
import com.github.felixlyd.orderstatesample.handler.OrderHandler;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;
import org.springframework.stereotype.Component;

/**
 * class ReturnOrderHandler: do something
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
@Component
public class ReturnOrderHandler implements OrderHandler {
    @Override
    public Condition<OrderContext> check() {
        return null;
    }

    @Override
    public Action<OrderStatusEnum, EventsEnum, OrderContext> action() {
        return null;
    }
}
