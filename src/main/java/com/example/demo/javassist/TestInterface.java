package com.example.demo.javassist;

import com.xiaomi.miliao.thrift.MiliaoSharedService;
import com.xiaomi.miui.ad.thrift.service.MiuiAdDeliveryService;
import org.apache.thrift.TServiceClient;
import org.apache.thrift.protocol.TProtocol;

public class TestInterface {
    public interface Iface extends MiuiAdDeliveryService.Iface {
    }

    public static class Client extends MiuiAdDeliveryService.Client{
        public Client(TProtocol prot) {
            super(prot);
        }
    }
}
