package com.github.felixlyd.orderstatesample.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * class OrderStatsEnum: do something
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnum {
    None("00","无订单"),
    NotUsed("01","待使用；可领取"),
    Used("02","已使用"),
    Revoked("03","已撤销"),
    Expired("04","已过期"),
    Returned("05","已退回"),
//    Recharging("06","充值中"), // 可优化
//    UseAvailable("07","可领取"), // 可优化
    Purchasing("08","采购中"),
    ReceivedUnused("09","已领取未使用；充值中"),
    Invalid("10","已作废"),
    ;

    private final String code;
    private final String msg;
}
