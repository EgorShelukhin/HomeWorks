package com.project.dataservice.dto;

import com.project.dataservice.entity.RoomType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RoomRequest {

    private Long id;
    private RoomType type;
    private int count;
    private int price;
    private int maxPerson;
    private Long hotelId;
}