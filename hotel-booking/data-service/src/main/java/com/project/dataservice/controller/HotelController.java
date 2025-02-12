package com.project.dataservice.controller;

import com.project.dataservice.entity.Room;
import com.project.dataservice.service.HotelService;
import com.project.dataservice.dto.HotelRequest;
import com.project.dataservice.entity.Hotel;
import com.project.dataservice.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hotels")
@RequiredArgsConstructor
public class HotelController {

    private final HotelService hotelService;
    private final RoomService roomService;

    @PostMapping
    public ResponseEntity<Hotel> addHotel(
            @RequestHeader("managerId")
            Long managerId,
            @RequestBody
            HotelRequest hotelRequest) {
        Hotel hotel = hotelService.addHotel(hotelRequest, managerId);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<List<Room>> getRoomsByHotel(@PathVariable Long hotelId) {
        List<Room> rooms = roomService.getAllRoomsByHotelId(hotelId);
        if (rooms.isEmpty()) {
            return ResponseEntity.noContent().build(); // Возвращаем 204 No Content, если нет комнат
        }
        return ResponseEntity.ok(rooms);
    }
}