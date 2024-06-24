package com.psh10066.code.chapter01.item01;

import com.psh10066.common.HelloService;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    // 반환 타입의 하위 타입 객체를 반환할 수 있다.
    // 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
    public static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }

    public static void main(String[] args) {
        // 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다.
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(h -> System.out.println(h.hello()));
    }
}
