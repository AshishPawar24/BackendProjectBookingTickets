package com.scienceMuseumTicketBooking.backend.controller;

//package com.scienceMuseumTicketBooking.backend.controller;

import com.google.zxing.BarcodeFormat;
//import com.google.zxing.BarcodeFormat.QR_CODE;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.scienceMuseumTicketBooking.backend.model.Booking;
import com.scienceMuseumTicketBooking.backend.model.User;
import com.scienceMuseumTicketBooking.backend.service.emailService;

@RestController
@CrossOrigin
@RequestMapping("/api/visit")
public class VisitController {

    @Autowired
    private UserController usercont;

    @Autowired
    private MuseumController museumcont;

    @Autowired
    private BookingController bookingcont;

    @Autowired
    private emailService emailservice;

    @GetMapping("/send-email")
    public String sendVisitDetailsEmail() throws IOException, WriterException {

        User u = usercont.getCurrentUser();
        Booking b = bookingcont.getcurrentbooking();
        String sessionid = bookingcont.sesssion_id;

        // QR Code generation (placeholder for Day 6)
        QRCodeWriter qr = new QRCodeWriter();
        BitMatrix bitMatrix = qr.encode(sessionid, BarcodeFormat.QR_CODE, 200, 200);


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", out);
        byte[] qrBytes = out.toByteArray();

        // Send email (placeholder)
        emailservice.sendEmail(
                u.getEmail(),
                u.getName(),
                b.getTotal_people(),
                b.getVisit_date(),
                b.getVisit_time(),
                "TEMP_TICKET_NO",
                qrBytes
        );

        return "Visit details email sent successfully!";
    }
}
