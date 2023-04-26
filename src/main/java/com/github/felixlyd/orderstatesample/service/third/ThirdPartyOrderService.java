package com.github.felixlyd.orderstatesample.service.third;

import com.github.felixlyd.orderstatesample.entity.third.ThirdPartyReq;
import com.github.felixlyd.orderstatesample.entity.third.ThirdPartyResp;

/**
 * class ThirdPartyOrderService: do something
 *
 * @author : liuyaodong
 * @date 2023/4/25
 */
public interface ThirdPartyOrderService {
    <T extends ThirdPartyResp, K extends ThirdPartyReq> T query(K req);
    <T extends ThirdPartyResp, K extends ThirdPartyReq> T use(K req);
    boolean isSupportRevoke();
    <T extends ThirdPartyResp, K extends ThirdPartyReq> T revoke(K req);
}
