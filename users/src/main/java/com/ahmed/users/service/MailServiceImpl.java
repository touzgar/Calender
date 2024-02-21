package com.ahmed.users.service;
import com.ahmed.users.mail.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class MailServiceImpl implements MailService{
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String mailAddress;

    public void sendMail(String email, Mail mail) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(mailAddress);
        simpleMailMessage.setSubject(mail.getSubject());
        simpleMailMessage.setText(mail.getBody());
        simpleMailMessage.setTo(email);
        javaMailSender.send(simpleMailMessage);
    }

}
