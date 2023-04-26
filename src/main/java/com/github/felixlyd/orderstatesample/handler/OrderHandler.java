package com.github.felixlyd.orderstatesample.handler;

import com.alibaba.cola.statemachine.Action;
import com.alibaba.cola.statemachine.Condition;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;


/**
 * interface OrderHandler: 订单通用处理接口
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
public interface OrderHandler {
    /**
     * 检查
     * @return 订单上下文
     */
    Condition<OrderContext> check();

    /**
     * 处理
     * @return 订单上下文
     */
    Action<OrderStatusEnum, EventsEnum, OrderContext> action();
}
