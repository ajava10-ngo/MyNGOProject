package com.mailSending;

import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailSSL {

    public static void sendEmail(String recepient) {

        try {
            Properties properties = new Properties();

            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            String senderEmail = "ajavango@gmail.com";
            String password = "ajava10_ngo";

            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(senderEmail, password);
                }
            });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("From NGO Team");
            message.setText("You are now volunteer");

            String content = "<h1>Dear User.</h1>";
            content = content + "<p>We are pleased to inform you that you've became a volunteer now onwards.</p>";
            content = content + "<p>Our whole team admire your work, dedication towards the oraganization.</p>";
            content = content + "<br>Thank You<br>";

            message.setContent(content, "text/html");
            Transport.send(message);
            System.out.println("Email sent successfully...");
        } catch (Exception e) {
            System.out.println("Mail Exception : " + e.toString());
        }
    }
}
