package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parts")
public class PartsController {
    @Autowired
    PartsService partService;

    @PostMapping("/add")
    public void addPart(@RequestBody Parts part) {
        partService.addPart(part);
    }

    @GetMapping("/all")
    public List<Parts> showAllParts() {
        return partService.showAllParts();
    }
}
