package com.flipkart.models;

import com.flipkart.models.enums.PaymentMode;

public class Payment {

    long id;

    Order order;

    PaymentMode paymentMode;
}
