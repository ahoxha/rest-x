package org.hoxha.demo.service;

import java.util.List;

import org.hoxha.demo.model.Planet;
import org.hoxha.demo.repo.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanetsService {
    @Autowired
    private PlanetRepository planetRepository;

    public List<Planet> getPlanets() {
        return planetRepository.findAll();
    }
}
