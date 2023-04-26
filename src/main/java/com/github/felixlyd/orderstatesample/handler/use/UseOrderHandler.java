package com.github.felixlyd.orderstatesample.handler.use;

import com.alibaba.cola.statemachine.Action;
import com.alibaba.cola.statemachine.Condition;
import com.github.felixlyd.orderstatesample.handler.OrderHandler;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;
import com.github.felixlyd.orderstatesample.handler.UpdateOrderTemplate;
import com.github.felixlyd.orderstatesample.handler.action.UseOrderAction;
import com.github.felixlyd.orderstatesample.handler.condition.UseOrderCondition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * class UseOrderCondition: 使用订单方法
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
@Component
@Slf4j
public class UseOrderHandler extends UpdateOrderTemplate implements OrderHandler {

    @Autowired
    private UseOrderCondition useOrderCondition;
    @Autowired
    private UseOrderAction useOrderAction;

    @Override
    public Condition<OrderContext> check() {
        return useOrderCondition;
    }

    @Override
    public Action<OrderStatusEnum, EventsEnum, OrderContext> action() {
        return useOrderAction;
    }
}
