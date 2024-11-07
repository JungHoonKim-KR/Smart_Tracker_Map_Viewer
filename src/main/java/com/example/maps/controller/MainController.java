package com.example.maps.controller;


import com.example.maps.Entity.NeosenResult;
import com.example.maps.dto.NeosenResultDto;
import com.example.maps.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;
    @GetMapping("/test")
    public List<NeosenResultDto> test(){
        List<NeosenResult> allResults = mainService.findDevice();

        return allResults.stream()
                .map(result -> new NeosenResultDto(result.getDeviceId(), result.getCollectDate(), result.getKoreanDate(), result.getLatitude(), result.getLongitude(), result.getCreateDate()))
                .toList();
    }

//    @GetMapping("/collect")
//    public List<NeosenResultDto> maps(RequestDto requestDto){
//        mainService.findNeosenResultsByCollectTime(requestDto);
//
//
//    }

}
