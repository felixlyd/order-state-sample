package com.github.felixlyd.orderstatesample.config.order;

import com.alibaba.cola.statemachine.Action;
import com.alibaba.cola.statemachine.Condition;
import com.alibaba.cola.statemachine.StateMachine;
import com.alibaba.cola.statemachine.builder.StateMachineBuilder;
import com.alibaba.cola.statemachine.builder.StateMachineBuilderFactory;
import com.github.felixlyd.orderstatesample.handler.cancel.ReturnOrderHandler;
import com.github.felixlyd.orderstatesample.handler.cancel.RevokeOrderHandler;
import com.github.felixlyd.orderstatesample.handler.use.CreateAndUseOrderHandler;
import com.github.felixlyd.orderstatesample.handler.use.CreateOrderHandler;
import com.github.felixlyd.orderstatesample.handler.use.UseOrderHandler;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import com.github.felixlyd.orderstatesample.enums.EventsEnum;
import com.github.felixlyd.orderstatesample.enums.OrderStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderStateMachine {

    private static final String MACHINE_ID = "orderProcessMachine";

    @Autowired
    private UseOrderHandler useOrderAction;
    @Autowired
    private CreateOrderHandler createOrderAction;
    @Autowired
    private CreateAndUseOrderHandler createAndUseOrderAction;
    @Autowired
    private RevokeOrderHandler revokeOrderHandler;
    @Autowired
    private ReturnOrderHandler returnOrderHandler;

    @Bean("orderProcessMachine")
    public StateMachine<OrderStatusEnum, EventsEnum, OrderContext> getOrderProcessMachine(){
        StateMachineBuilder<OrderStatusEnum, EventsEnum, OrderContext> builder = StateMachineBuilderFactory.create();

        // 业务场景：部分洗车观影；部分第三方
        builder.externalTransition()
                .from(OrderStatusEnum.None)
                .to(OrderStatusEnum.Used)
                .on(EventsEnum.CreateAndUse)
                .when(createAndUseOrderAction.check())
                .perform(createAndUseOrderAction.action());

        // 业务场景：积分兑实物；部分第三方；
        builder.externalTransition()
                .from(OrderStatusEnum.None)
                .to(OrderStatusEnum.NotUsed)
                .on(EventsEnum.Create)
                .when(createOrderAction.check())
                .perform(createOrderAction.action());

        // 业务场景：积分兑实物；部分第三方
        builder.externalTransition()
                .from(OrderStatusEnum.NotUsed)
                .to(OrderStatusEnum.Used)
                .on(EventsEnum.Use)
                .when(useOrderAction.check())
                .perform(useOrderAction.action());

        // 业务场景：部分第三方
        builder.externalTransition()
                .from(OrderStatusEnum.NotUsed)
                .to(OrderStatusEnum.ReceivedUnused)
                .on(EventsEnum.Receive)
                .when(useOrderAction.check())
                .perform(useOrderAction.action());

        // 业务场景：部分第三方；
        builder.externalTransition()
                .from(OrderStatusEnum.None)
                .to(OrderStatusEnum.Purchasing)
                .on(EventsEnum.Purchase)
                .when(createOrderAction.check())
                .perform(createOrderAction.action());

        // 业务场景：所有撤销
        builder.externalTransitions()
                .fromAmong(OrderStatusEnum.NotUsed, OrderStatusEnum.Purchasing)
                .to(OrderStatusEnum.Revoked)
                .on(EventsEnum.Revoke)
                .when(revokeOrderHandler.check())
                .perform(revokeOrderHandler.action());

        // 业务场景：所有退回
        builder.externalTransition()
                .from(OrderStatusEnum.Used)
                .to(OrderStatusEnum.Returned)
                .on(EventsEnum.Return)
                .when(returnOrderHandler.check())
                .perform(revokeOrderHandler.action());

        // 批处理也可以建状态机, 例如过期
        builder.externalTransitions()
                .fromAmong(OrderStatusEnum.NotUsed, OrderStatusEnum.Purchasing, OrderStatusEnum.ReceivedUnused)
                .to(OrderStatusEnum.Expired)
                .on(EventsEnum.Expire)
                .when(check())
                .perform(action());

        // 以及新建、商品采购期刷新可领取


        return builder.build(MACHINE_ID);
    }


    public Condition<OrderContext> check() {
        return null;
    }

    public Action<OrderStatusEnum, EventsEnum, OrderContext> action() {
        return null;
    }
}
