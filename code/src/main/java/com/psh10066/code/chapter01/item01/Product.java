package com.psh10066.code.chapter01.item01;

public class Product {

    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        // 호출할 때마다 인스턴스를 새로 생성하지 않아도 된다. (ex. Boolean.valueOf())
        System.out.println(settings1);
        System.out.println(settings2);
    }
}
