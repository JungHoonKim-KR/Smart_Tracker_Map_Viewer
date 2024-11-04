package com.example.maps.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class NeosenResult {
    @Id
    @Column(name = "result_no", nullable = false)
    private Long resultNo;

    @Column(name = "command", nullable = false, length = 1)
    private String command;

    @Column(name = "device_id", nullable = false, length = 6)
    private String deviceId;

    @Column(name = "collect_date")
    private LocalDateTime collectDate;

    @Column(name = "korean_date")
    private LocalDateTime koreanDate;

    @Column(name = "temperature")
    private Double temperature;

    @Column(name = "humidity")
    private Double humidity;

    @Column(name = "alarm_code")
    private Short alarmCode;

    @Column(name = "latitude", length = 15)
    private String latitude;

    @Column(name = "longitude", length = 15)
    private String longitude;

    @Column(name = "rev_packet", length = 100)
    private String revPacket;

    @Column(name = "create_date", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createDate;
}
