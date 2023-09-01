package com.modelmappingdto.modelmappingdto.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private long id;
    private String email;
    private String place;
    private double longitude;
}
