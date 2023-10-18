package com.eliasneri.emailservice.core;

public interface EmailSendUserCase {
    void sendEmail(String to, String subject, String body);
}
