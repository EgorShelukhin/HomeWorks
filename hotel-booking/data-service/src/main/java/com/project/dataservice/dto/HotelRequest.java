package com.project.dataservice.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class HotelRequest {

    private String name;
    private String city;
    private String address;
    private List<RoomRequest> rooms;
}