package org.adopt.controller.dogController;

import org.adopt.model.Dog;
import org.adopt.service.dogService.DogService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cachorros")
public class DogController {
    private DogService dogService;

    @PostMapping
    public Dog create() {
        return null;
    }

    @PutMapping
    public Dog update() {
        return null;
    }

    @PatchMapping
    public Dog patch() {
        return null;
    }

    @DeleteMapping
    public void delete() {

    }

    @GetMapping
    public Dog finById() {
        return null;
    }

    @GetMapping
    public Dog findAll() {
        return null;
    }
}
