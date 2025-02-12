package com.project.dataservice.mapper;

import com.project.dataservice.dto.HotelRequest;
import com.project.dataservice.dto.RoomRequest;
import com.project.dataservice.entity.Hotel;
import com.project.dataservice.entity.Room;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface HotelMapper {

    //с маппером чутка надо раззобраться но в целом гуд все понятно
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creationDate", ignore = true)
    @Mapping(target = "rooms", source = "rooms")
    @Mapping(target = "address", source = "address")
    Hotel toEntity(HotelRequest request);

    @Mapping(target = "hotel", ignore = true)
    @Mapping(target = "id", ignore = true)
    Room toEntity(RoomRequest request);

    // Новый метод, чтобы связать комнаты с отелем РАЗОБРАТЬСЯ!!!
    default List<Room> mapRooms(List<RoomRequest> roomRequests,
                                @Context
                                Hotel hotel) {
        if (roomRequests == null) return new ArrayList<>();
        return roomRequests.stream().map(roomRequest -> {
            Room room = toEntity(roomRequest);
            room.setHotel(hotel);
            return room;
        }).collect(Collectors.toList());
    }
}