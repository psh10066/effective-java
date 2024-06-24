package com.psh10066.external;

import com.psh10066.common.HelloService;

public class ChineseHelloService implements HelloService {

    @Override
    public String hello() {
        return "Ni Hao";
    }
}
