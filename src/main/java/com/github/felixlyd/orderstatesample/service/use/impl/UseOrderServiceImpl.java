package com.github.felixlyd.orderstatesample.service.use.impl;

import com.alibaba.cola.statemachine.StateMachine;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;
import com.github.felixlyd.orderstatesample.service.use.UseOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * class UseOrderServiceImpl: do something
 *
 * @author : liuyaodong
 * @date 2023/4/26
 */
@Service
@Slf4j
public class UseOrderServiceImpl implements UseOrderService {
    @Autowired
    @Qualifier("orderProcessMachine")
    private StateMachine<OrderStatusEnum, EventsEnum, OrderContext> stateMachine;

    @Override
    public void use() {
        OrderContext orderContext = new OrderContext();
        stateMachine.fireEvent(OrderStatusEnum.NotUsed, EventsEnum.Use, orderContext);
        log.info("更新数据库！");
    }
}
