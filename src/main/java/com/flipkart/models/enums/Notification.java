package com.flipkart.models.enums;

import com.flipkart.models.User;

public class Notification {

    long id;

    User receiver;

    String sender;

    String message;

    NotificationType notificationType;
}
