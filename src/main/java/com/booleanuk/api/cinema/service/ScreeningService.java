package com.booleanuk.api.cinema.service;

import com.booleanuk.api.cinema.model.Screening;
import com.booleanuk.api.cinema.repository.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {
    @Autowired
    private ScreeningRepository screeningRepository;

    public List<Screening> getAllScreenings() {
        return screeningRepository.findAll();
    }

    public Screening getScreeningById(Long id) {
        return screeningRepository.findById(id).orElse(null);
    }

    public Screening saveScreening(Screening screening) {
        return screeningRepository.save(screening);
    }

    public void deleteScreening(Long id) {
        screeningRepository.deleteById(id);
    }
}