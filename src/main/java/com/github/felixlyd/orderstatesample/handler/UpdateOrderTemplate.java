package com.github.felixlyd.orderstatesample.handler;

import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;

/**
 * class UpdateOrderTemplate: 设置元数据，操作数据库，更新相关订单
 *
 * @author : liuyaodong
 * @date 2023/4/26
 */
public class UpdateOrderTemplate {
    /**
     * 处理订单
     * @param orderContext 订单上下文
     * @return 订单上下文
     */
    OrderContext processOrder(OrderContext orderContext){
        return null;
    }

    /**
     * 处理订单流水
     * @param orderContext 订单上下文
     * @return 订单上下文
     */
    OrderContext processOrderRecord(OrderContext orderContext){
        return null;
    }

    /**
     * 处理商品订单
     * @param orderContext 订单上下文
     * @return 订单上下文
     */
    OrderContext processItemsOrder(OrderContext orderContext){
        return null;
    }
}
