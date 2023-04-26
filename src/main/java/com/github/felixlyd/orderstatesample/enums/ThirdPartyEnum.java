package com.github.felixlyd.orderstatesample.enums;

import com.github.felixlyd.orderstatesample.service.third.impl.WechatOrderServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * enum ThirdPartyEnum: do something
 *
 * @author : liuyaodong
 * @date 2023/4/26
 */
@Getter
@AllArgsConstructor
public enum ThirdPartyEnum {
    Wechat("01","微信合作方", WechatOrderServiceImpl.class),
    ;
    private final String code;
    private final String msg;
    private final Class<?> classOfBean;
}
