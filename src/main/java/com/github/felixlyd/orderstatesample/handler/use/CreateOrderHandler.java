package com.github.felixlyd.orderstatesample.handler.use;

import com.alibaba.cola.statemachine.Action;
import com.alibaba.cola.statemachine.Condition;
import com.github.felixlyd.orderstatesample.handler.OrderHandler;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;
import com.github.felixlyd.orderstatesample.handler.CreateOrderTemplate;
import org.springframework.stereotype.Component;

/**
 * class CreateOrderHandler: 生成订单
 *
 * @author : liuyaodong
 * @date 2023/4/26
 */
@Component
public class CreateOrderHandler extends CreateOrderTemplate implements OrderHandler {
    @Override
    public Condition<OrderContext> check() {
        return null;
    }

    @Override
    public Action<OrderStatusEnum, EventsEnum, OrderContext> action() {
        return null;
    }
}
