package com.flipkart.models;

import java.util.List;

public class Order {

    long id;

    List<Product> productList;

    User user;

    int total;

    Cart cart;
}
