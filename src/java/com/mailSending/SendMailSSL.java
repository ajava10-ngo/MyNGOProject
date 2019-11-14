package com.mailSending;

import com.constant.Constants;
import com.model.EmailVerification;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailSSL {

   public static boolean sendEmail(EmailVerification verification) {

      try {
         Properties properties = new Properties();

         properties.put("mail.smtp.auth", "true");
         properties.put("mail.smtp.starttls.enable", "true");
         properties.put("mail.smtp.host", "smtp.gmail.com");
         properties.put("mail.smtp.port", "587");

         Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(Constants.SENDER_EMAIL, Constants.PASSWORD);
            }
         });

         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(Constants.SENDER_EMAIL));
         message.setRecipient(Message.RecipientType.TO, new InternetAddress(verification.getEmail()));
         message.setSubject("From NGO Team");
         message.setText("You are now volunteer");

         String content = "<h1>Dear User.</h1>";
         content = content + "<p>Your OTP(One Time Password) is " + verification.getOtp() + "</p>";

         message.setContent(content, "text/html");
         Transport.send(message);
         System.out.println("Email sent successfully...");
         return true;
      } catch (Exception e) {
         System.out.println("Mail Exception : " + e.toString());
      }
      return false;
   }

   public static boolean sendEmail(String recepient) {

      try {
         Properties properties = new Properties();

         properties.put("mail.smtp.auth", "true");
         properties.put("mail.smtp.starttls.enable", "true");
         properties.put("mail.smtp.host", "smtp.gmail.com");
         properties.put("mail.smtp.port", "587");

         Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(Constants.SENDER_EMAIL, Constants.PASSWORD);
            }
         });

         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(Constants.SENDER_EMAIL));
         message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
         message.setSubject("From NGO Team");
         message.setText("You are now volunteer");

         String content = "<h1>Dear User.</h1>";
         content = content + "<p>We are pleased to inform you that you've became a volunteer from now onwards.</p>";
         content = content + "<p>Our whole team admire your work, dedication towards the oraganization.</p>";
         content = content + "<br>Thank You.<br>";

         message.setContent(content, "text/html");
         Transport.send(message);
         System.out.println("Email sent successfully...");
         return true;
      } catch (Exception e) {
         System.out.println("Mail Exception : " + e.toString());
      }
      return false;
   }
}
