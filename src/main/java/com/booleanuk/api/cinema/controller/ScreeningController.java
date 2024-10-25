package com.booleanuk.api.cinema.controller;

import com.booleanuk.api.cinema.model.Screening;
import com.booleanuk.api.cinema.service.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/screenings")
public class ScreeningController {
    @Autowired
    private ScreeningService screeningService;

    @GetMapping
    public List<Screening> getAllScreenings() {
        return screeningService.getAllScreenings();
    }

    @GetMapping("/{id}")
    public Screening getScreeningById(@PathVariable Long id) {
        return screeningService.getScreeningById(id);
    }

    @PostMapping
    public Screening createScreening(@RequestBody Screening screening) {
        return screeningService.saveScreening(screening);
    }

    @PutMapping("/{id}")
    public Screening updateScreening(@PathVariable Long id, @RequestBody Screening screening) {
        screening.setId(id);
        return screeningService.saveScreening(screening);
    }

    @DeleteMapping("/{id}")
    public Screening deleteScreening(@PathVariable Long id) {
        Screening screening = screeningService.getScreeningById(id);
        screeningService.deleteScreening(id);
        return screening;
    }
}