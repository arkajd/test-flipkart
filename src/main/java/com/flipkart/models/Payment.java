package com.flipkart.models;

import com.flipkart.models.enums.PaymentMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment {

    private long id;

    private Order order;

    @Enumerated(EnumType.STRING)
    PaymentMode paymentMode;
}
