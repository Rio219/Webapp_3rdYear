package com.webapp3rdyear.utils;
import java.util.Properties;
import java.util.Random;

import com.webapp3rdyear.entity.UserModel;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;



public class EmailUtils {

    // Hàm mã code ngẫu nhiên
    public String getRandom() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }

    // Hàm gửi email
    public boolean sendEmail(UserModel user) {
        boolean test = false;
        
        String toEmail = user.getEmail();
        String fromEmail = "riomailservice@gmail.com";
        String password = "sang21092004";
        
        try {
			Properties pr = configEmail(new Properties());
			 Session session = Session.getInstance(pr, new Authenticator() {
				 @Override
				 protected PasswordAuthentication getPasswordAuthentication() {
					 return new PasswordAuthentication(fromEmail, password);
				 }
				 });
			 
			 Message mess = new MimeMessage(session);
			 mess.setHeader("Content-Type", "text/plain; charset=UTF-8");
			 mess.setFrom(new InternetAddress(fromEmail));
			 mess.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			 
			 mess.setSubject("confirm code");
			 mess.setText("Your code : 123"  );
			 Transport.send(mess);
			 test=true;
        } catch (Exception e) {
			// TODO: handle exception
		}
        return test;
    }
    
    public Properties configEmail(Properties props) {
    	props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.port", "587"); // Port
        props.setProperty("mail.smtp.auth", "true"); // Enable authentication
        props.setProperty("mail.smtp.starttls.enable", "true"); // TLS
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.socketFactory.port", "587");
        return props;
    }

}
