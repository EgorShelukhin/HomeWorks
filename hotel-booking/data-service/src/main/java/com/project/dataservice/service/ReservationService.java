package com.project.dataservice.service;

import com.project.dataservice.dto.BookingRequest;
import com.project.dataservice.entity.Reservation;
import com.project.dataservice.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservationService {

    ReservationRepository reservationRepository;

    public void createReservation(BookingRequest request) {

        Reservation reservation = new Reservation();

        reservation.setUserId(request.getUserId());
        reservation.setRoomId(request.getRoomId());
        reservation.setArrivalDate(request.getArrivalDate());
        reservation.setDepartureDate(request.getDepartureDate());

        reservationRepository.save(reservation);
    }
}
