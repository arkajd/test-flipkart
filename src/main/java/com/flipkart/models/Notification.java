package com.flipkart.models;

import com.flipkart.models.User;
import com.flipkart.models.enums.NotificationType;
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
public class Notification {

    private long id;

    private User receiver;

    private String sender;

    private String message;

    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;
}
