package com.github.felixlyd.orderstatesample.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * enum EventsEnum: do something
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
@Getter
@AllArgsConstructor
public enum EventsEnum {
    Use("",""),
    Create("",""),
    Recharge("",""),
    RechargeFail("",""),
    Receive("",""),
    Purchase("",""),
    PurchaseOk("",""),
    Revoke("",""),
    Return("",""),
    Expire("",""),
    ;

    private final String code;
    private final String msg;

}
