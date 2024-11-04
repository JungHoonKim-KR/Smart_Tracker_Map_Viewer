package com.example.maps.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class NeosenResultDto {
    private String deviceId;
    private LocalDateTime collectDate;
    private LocalDateTime koreanDate;
    private String latitude;
    private String longitude;
    private LocalDateTime createDate;
}
