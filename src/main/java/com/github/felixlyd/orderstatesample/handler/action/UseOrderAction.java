package com.github.felixlyd.orderstatesample.handler.action;

import com.alibaba.cola.statemachine.Action;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * class UseOrderAction: do something
 *
 * @author : liuyaodong
 * @date 2023/4/26
 */
@Service
@Slf4j
public class UseOrderAction implements Action<OrderStatusEnum, EventsEnum, OrderContext> {
    @Override
    public void execute(OrderStatusEnum from, OrderStatusEnum to, EventsEnum event, OrderContext context) {
        log.info("用策略模式添加不同的XXXXX场景");
        log.info("开始处理订单！");
    }
}
