package com.github.felixlyd.orderstatesample.service.manual;

import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;

/**
 * interface ManualUseOrderService: 售后处理
 *
 * @author : liuyaodong
 * @date 2023/4/26
 */
public interface ManualOrderService {
    /**
     * 人工核销
     * @return 订单上下文
     */
    default OrderContext manualUse(){
        return new OrderContext();
    }

    /**
     * 人工退回
     * @return 订单上下文
     */
    default OrderContext manualReturn(){
        return new OrderContext();
    }


}
