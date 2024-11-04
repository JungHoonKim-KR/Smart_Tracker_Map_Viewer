package com.example.maps.repository;

import com.example.maps.Entity.NeosenResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface Repository extends JpaRepository<NeosenResult, Long> {
    List<NeosenResult>findNeosenResultByDeviceIdAndCollectDate(String NeosenResultId, Timestamp collectDate);
    List<NeosenResult>findNeosenResultByDeviceIdAndKoreanDate(String NeosenResultId, Timestamp collectDate);

}
