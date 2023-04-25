package com.github.felixlyd.orderstatesample.service;

/**
 * class ThirdPartyOrderService: do something
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
public interface ThirdPartyOrderService {
    String query();
    String use();
    boolean isSupportRevoke();
    String revoke();
}
