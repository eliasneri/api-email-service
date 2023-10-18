package com.eliasneri.emailservice.adapters;

// contrato para o serviço externo

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
