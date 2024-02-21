package com.ahmed.users.service;

import com.ahmed.users.mail.Mail;

public interface MailService {
    void sendMail(String email, Mail mail);

}
