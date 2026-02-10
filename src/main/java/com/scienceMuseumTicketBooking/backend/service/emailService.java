package com.scienceMuseumTicketBooking.backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class emailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail, String visitorName, String numberOfVisitors,
                          String date, String timeSlot, String ticketNumber,
                          byte[] qrCode) {

        MimeMessage message = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(toEmail);
            helper.setSubject("Your Visit Booking Confirmation");

            String body = String.format(
                    "Dear %s,\n\nYour visit is confirmed.\n\nVisitors: %s\nDate: %s\nTime: %s\nTicket No: %s\n\nRegards,\nMuseum Team",
                    visitorName, numberOfVisitors, date, timeSlot, ticketNumber
            );

            helper.setText(body);

            helper.addAttachment("EntryQr.png", new ByteArrayResource(qrCode));

            mailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
