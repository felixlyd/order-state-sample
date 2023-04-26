package com.github.felixlyd.orderstatesample.entity.dto;

import com.github.felixlyd.orderstatesample.entity.order.ItemsOrder;
import com.github.felixlyd.orderstatesample.entity.order.Order;
import com.github.felixlyd.orderstatesample.entity.order.OrderRecord;

/**
 * class OrderContext: do something
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
public class  OrderContext {
    /**
     * 订单
     */
    private Order order;
    /**
     * 订单流水
     */
    private OrderRecord orderRecord;
    /**
     * 商品订单
     */
    private ItemsOrder itemsOrder;

    private boolean isOk;
}
