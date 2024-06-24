package com.psh10066.code.chapter01.item01;

import com.psh10066.common.HelloService;

public class KoreanHelloService implements HelloService {

    @Override
    public String hello() {
        return "안녕하세요.";
    }
}
