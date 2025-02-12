package com.project.dataservice.service;

import com.project.dataservice.dto.HotelRequest;
import com.project.dataservice.entity.Hotel;
import com.project.dataservice.mapper.HotelMapper;
import com.project.dataservice.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepository hotelRepository;
    private final HotelMapper hotelMapper;

    @Transactional
    public Hotel addHotel(HotelRequest request, Long managerId) {
        Hotel hotel = hotelMapper.toEntity(request);
        hotel.setManagerId(managerId);
        hotel.setCreationDate(LocalDateTime.now());

        // Добавляем связь с комнатами
        if (hotel.getRooms() != null) {
            hotel.getRooms().forEach(room -> room.setHotel(hotel));
        }
        return hotelRepository.save(hotel);
    }
}