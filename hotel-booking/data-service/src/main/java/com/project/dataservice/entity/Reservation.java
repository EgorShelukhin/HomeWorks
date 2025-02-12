package com.project.dataservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Reservations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    private Long userId;

    @JoinColumn(name = "room_id", nullable = false)
    private Long roomId;

    @Column(name = "arrival_date", nullable = false, updatable = false)
    private LocalDate arrivalDate;

    @Column(name = "departure_date", nullable = false, updatable = false)
    private LocalDate departureDate;
}