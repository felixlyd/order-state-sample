package com.github.felixlyd.orderstatesample.service.third.impl;

import com.github.felixlyd.orderstatesample.entity.third.ThirdPartyReq;
import com.github.felixlyd.orderstatesample.entity.third.ThirdPartyResp;
import com.github.felixlyd.orderstatesample.service.third.ThirdPartyOrderService;

/**
 * class WechatOrderServiceImpl: do something
 *
 * @author : liuyaodong
 * @date 2023/4/26
 */
public class WechatOrderServiceImpl implements ThirdPartyOrderService {

    @Override
    public <T extends ThirdPartyResp, K extends ThirdPartyReq> T query(K req) {
        return null;
    }

    @Override
    public <T extends ThirdPartyResp, K extends ThirdPartyReq> T use(K req) {
        return null;
    }

    @Override
    public boolean isSupportRevoke() {
        return false;
    }

    @Override
    public <T extends ThirdPartyResp, K extends ThirdPartyReq> T revoke(K req) {
        return null;
    }

}
