package org.adopt.controller.catController;

import org.adopt.dto.catDto.CatRequest;
import org.adopt.model.Cat;
import org.adopt.service.catService.CatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gatos")
public class CatController {

    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @PostMapping
    public Cat create(CatRequest catRequest) {
        return catService.create(catRequest);
    }

    @PutMapping
    public Cat update(CatRequest catRequest) {
        return catService.update(catRequest);
    }

    @PatchMapping
    public Cat patch() {
        return null;
    }

    @DeleteMapping
    public void delete(CatRequest catRequest) {

    }

    @GetMapping
    public Cat findById() {
        return null;
    }

    @GetMapping
    public Cat findAll() {
        return null;
    }
}
