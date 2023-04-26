package com.github.felixlyd.orderstatesample.handler.callback;

import com.alibaba.cola.statemachine.Action;
import com.alibaba.cola.statemachine.Condition;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;

/**
 * class HQCallBackOrderHandler: 话费回调
 *
 * @author : liuyaodong
 * @date 2023/4/26
 */
public class SXCallBackOrderHandler implements CallBackOrderHandler {

    /**
     * 检查
     *
     * @return 订单上下文
     */
    @Override
    public Condition<OrderContext> check() {
        return null;
    }

    /**
     * 处理
     *
     * @return 订单上下文
     */
    @Override
    public Action<OrderStatusEnum, EventsEnum, OrderContext> action() {
        return null;
    }

    /**
     * 回调成功处理
     *
     * @return 订单上下文
     */
    @Override
    public Action<OrderStatusEnum, EventsEnum, OrderContext> actionOk() {
        return null;
    }

    /**
     * 回调失败处理
     *
     * @return 订单上下文
     */
    @Override
    public Action<OrderStatusEnum, EventsEnum, OrderContext> actionFail() {
        return null;
    }
}
