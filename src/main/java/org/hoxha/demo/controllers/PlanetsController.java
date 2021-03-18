package org.hoxha.demo.controllers;

import static org.springframework.http.MediaType.TEXT_HTML_VALUE;

import java.util.List;

import org.hoxha.demo.model.Planet;
import org.hoxha.demo.service.PlanetsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanetsController {

    private PlanetsService planetsService;

    public PlanetsController(PlanetsService planetsService) {
        this.planetsService = planetsService;
    }

    @GetMapping("planets")
    public List<Planet> getPlanets() {
        return planetsService.getPlanets();
    }

    @GetMapping(value = "planets/html", produces = TEXT_HTML_VALUE)
    public String getPlanetsInHtmlFormat() {
        StringBuilder sb = new StringBuilder("Planets in our solar system");
        sb.append("<ul>");
        planetsService.getPlanets().forEach(planet -> sb.append("<li>") //
                .append(planet.getId()) //
                .append(" ") //
                .append(planet.getName()) //
                .append("</li>") //
        );
        sb.append("</ul>");
        return sb.toString();
    }
}
