package com.example.maps.dto;

import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class RequestDto {
    private String deviceId;
    private LocalDateTime time;
}
