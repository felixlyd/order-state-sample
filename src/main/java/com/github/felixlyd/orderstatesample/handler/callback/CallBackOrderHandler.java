package com.github.felixlyd.orderstatesample.handler.callback;

import com.alibaba.cola.statemachine.Action;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;
import com.github.felixlyd.orderstatesample.handler.OrderHandler;

/**
 * interface CallBackOrderHandler: 回调
 *
 * @author : liuyaodong
 * @date 2023/4/26
 */
public interface CallBackOrderHandler extends OrderHandler {

    /**
     * 回调成功处理
     * @return 订单上下文
     */
    Action<OrderStatusEnum, EventsEnum, OrderContext> actionOk();

    /**
     * 回调失败处理
     * @return 订单上下文
     */
    Action<OrderStatusEnum, EventsEnum, OrderContext> actionFail();

    default Action<OrderStatusEnum, EventsEnum, OrderContext> action(boolean success){
        if(success){
            return actionOk();
        }else {
            return actionFail();
        }
    }
}
