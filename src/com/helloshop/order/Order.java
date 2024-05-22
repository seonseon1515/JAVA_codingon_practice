package com.helloshop.order;

import com.helloshop.project.Product;
import com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    // public 접근 제어자가 붙어야 다른 패키지에서 이 생성자를 호출 가능
    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
