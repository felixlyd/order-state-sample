package com.github.felixlyd.orderstatesample.handler.condition;

import com.alibaba.cola.statemachine.Condition;
import com.github.felixlyd.orderstatesample.entity.dto.OrderContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * class UseOrderCondition: do something
 *
 * @author : liuyaodong
 * @date 2023/4/26
 */
@Slf4j
@Component
public class UseOrderCondition implements Condition<OrderContext> {
    /**
     * @param context context object
     * @return whether the context satisfied current condition
     */
    @Override
    public boolean isSatisfied(OrderContext context) {
        log.info("判断是不是XXXXX场景和XXXX场景");
        return true;
    }

    @Override
    public String name() {
        return Condition.super.name();
    }
}
