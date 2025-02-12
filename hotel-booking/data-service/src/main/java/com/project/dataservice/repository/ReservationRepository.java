package com.project.dataservice.repository;

import com.project.dataservice.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface ReservationRepository extends JpaRepository <Reservation, Long> {

    @Query("SELECT COUNT(r) = 0 FROM Reservation r " +
            "WHERE r.roomId = :roomId " +
            "AND ((r.arrivalDate BETWEEN :arrivalDate AND :departureDate) " +
            "OR (r.departureDate BETWEEN :arrivalDate AND :departureDate) " +
            "OR (:arrivalDate BETWEEN r.arrivalDate AND r.departureDate))")
    boolean existsByRoomIdAndDatesOverlap(@Param("roomId") Long roomId,
                                          @Param("arrivalDate") LocalDate arrivalDate,
                                          @Param("departureDate") LocalDate departureDate);
}