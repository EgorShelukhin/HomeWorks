package com.project.dataservice.service;

import com.project.dataservice.dto.RoomRequest;
import com.project.dataservice.entity.Hotel;
import com.project.dataservice.entity.Room;
import com.project.dataservice.mapper.HotelMapper;
import com.project.dataservice.repository.HotelRepository;
import com.project.dataservice.repository.ReservationRepository;
import com.project.dataservice.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;
    private final HotelRepository hotelRepository;
    private final ReservationRepository reservationRepository;
    private final HotelMapper hotelMapper;

    //при эксепшене прога вылетает надо сделать хэндлер
    public Room addRoom(RoomRequest request, Long managerId) {
        Hotel hotel = hotelRepository.findById(request.getHotelId())
                .orElseThrow(() -> new RuntimeException("Отель не найден!"));

        if (!hotel.getManagerId().equals(managerId)) {
            throw new RuntimeException("У вас нет прав добавлять комнаты в этот отель!");
        }

        boolean roomExists = roomRepository.existsByHotelAndTypeAndCountAndMaxPerson(
                hotel, request.getType(), request.getCount(), request.getMaxPerson());

        if (roomExists) {
            throw new RuntimeException("Такая комната уже существует в отеле!");
        }

        Room room = hotelMapper.toEntity(request);
        room.setHotel(hotel);
        return roomRepository.save(room);
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public List<Room> getAllRoomsByHotelId(Long hotelId) {
        return roomRepository.findByHotelId(hotelId);
    }

    public void updateRoomPrice(Long roomId, int newPrice) {
        int updatedPrice = roomRepository.updateRoomPrice(roomId, BigDecimal.valueOf(newPrice));
        if (updatedPrice == 0) { //Слав, почему тут гпт дает == 0 я не понял, те пропустит -1 чтоль. Я перепишу потом обработку исключения
            throw new RuntimeException("Комната с ID " + roomId + " не найдена!");
        }
    }

    public void deleteRoomById(Long roomId) {
        int deletedRoom = roomRepository.deleteRoomById(roomId);
        if (deletedRoom == 0) { //Слав, почему тут гпт дает == 0 я не понял, те пропустит -1 чтоль. Я перепишу потом обработку исключения
            throw new RuntimeException("Комната с ID " + roomId + " не найдена!");
        }
    }

    public boolean isRoomAvailable(Long roomId, LocalDate arrivalDate, LocalDate departureDate) {
        return reservationRepository.existsByRoomIdAndDatesOverlap(roomId, arrivalDate, departureDate);
    }
}