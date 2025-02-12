package com.project.bookingservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping
    public ResponseEntity<String> createBooking(
            @RequestBody
            BookingRequest request) {
        boolean success = bookingService.bookRoom(request);
        if (success) {
            return ResponseEntity.ok("Бронирование успешно!");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Нет доступных мест для бронирования.");
        }
    }
}