package com.project.dataservice.controller;

import com.project.dataservice.dto.BookingRequest;
import com.project.dataservice.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reservations")
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    @PostMapping
    public ResponseEntity<Void> createReservation(
            @RequestBody
            BookingRequest request) {
        reservationService.createReservation(request);
        return ResponseEntity.ok().build();
    }
}