package com.psh10066.code.chapter01.item01;

public class Order {

    private boolean prime;
    private boolean urgent;
    private Product product;

    // 이름을 가질 수 있고, 동일한 시그니처로 생성할 수 있다.
    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }
}
