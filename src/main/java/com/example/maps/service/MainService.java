package com.example.maps.service;

import com.example.maps.Entity.NeosenResult;
import com.example.maps.dto.RequestDto;
import com.example.maps.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {
    private final Repository repository;

    public List<NeosenResult> findAll(){
        return repository.findAll();
    }

}
