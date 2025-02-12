package com.project.dataservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RoomType {
    @JsonProperty("standard")
    STANDARD,

    @JsonProperty("lux")
    LUX,

    @JsonProperty("vip")
    VIP;
}