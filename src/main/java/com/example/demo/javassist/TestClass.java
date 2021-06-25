package com.example.demo.javassist;

import com.xiaomi.miliao.thrift.MiliaoSharedServiceBase;
import com.xiaomi.miui.ad.thrift.model.AdResultInfo;
import com.xiaomi.miui.ad.thrift.model.ClientInfoV3;
import com.xiaomi.miui.ad.thrift.service.MiuiAdDeliveryService;

public class TestClass extends MiliaoSharedServiceBase implements MiuiAdDeliveryService.Iface {
    public AdResultInfo getAds(ClientInfoV3 clientInfoV3) {
        return null;
    }

    @Override
    public void stop() {
    }
}
