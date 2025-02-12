package com.project.bookingservice;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingRequest {

    private Long userId;
    private Long roomId;
    private LocalDate arrivalDate;
    private LocalDate departureDate;

}