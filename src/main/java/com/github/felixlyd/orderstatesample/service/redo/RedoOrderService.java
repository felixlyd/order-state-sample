package com.github.felixlyd.orderstatesample.service.redo;

import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;

/**
 * interface RedoOrderService: 订单冲正
 *
 * @author : liuyaodong
 * @date 2023/4/26
 */
public interface RedoOrderService {
    void redo(OrderContext orderContext);
}
