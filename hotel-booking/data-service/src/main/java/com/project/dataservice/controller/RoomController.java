package com.project.dataservice.controller;

import com.project.dataservice.service.RoomService;
import com.project.dataservice.dto.RoomRequest;
import com.project.dataservice.entity.Room;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rooms")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @PostMapping
    public ResponseEntity<Room> addRoom(
            @RequestHeader("managerId")
            Long managerId,
            @RequestBody
            RoomRequest roomRequest) {

        Room room = roomService.addRoom(roomRequest, managerId);
        return ResponseEntity.status(HttpStatus.CREATED).body(room);
    }

    @GetMapping
    public ResponseEntity<List<Room>> getAllRooms() {
        List<Room> rooms = roomService.getAllRooms();
        return ResponseEntity.ok(rooms);
    }

    @PutMapping("/{roomId}/price")
    public ResponseEntity<String> updateRoomPrice(
            @PathVariable Long roomId,
            @RequestParam int newPrice) {
        roomService.updateRoomPrice(roomId, newPrice);
        return ResponseEntity.ok("Цена комнаты обновлена!");
    }

    @DeleteMapping("/{roomId}")
    public ResponseEntity<String> deleteRoom(
            @PathVariable Long roomId) {
        roomService.deleteRoomById(roomId);
        return ResponseEntity.ok("Комната удалена!");
    }

    @GetMapping("/{roomId}/availability")
    public ResponseEntity<Boolean> checkRoomAvailability(
            @PathVariable
            Long roomId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate arrivalDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate departureDate) {
        boolean isAvailable = roomService.isRoomAvailable(roomId, arrivalDate, departureDate);
        return ResponseEntity.ok(isAvailable);
    }
}