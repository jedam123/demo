package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class PartsService {

    @Autowired
    PartsRepository partsRepository;

    void addPart(Parts part) {
        partsRepository.save(part);
    }

    List<Parts> showAllParts() {
        return partsRepository.findAll();
    }
}
