package com.bartumeu.msscbrewery.web.controller;

import com.bartumeu.msscbrewery.web.model.BeerDTO;
import com.bartumeu.msscbrewery.web.service.BeerServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerServiceImpl beerService;

    public BeerController(BeerServiceImpl beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeer(@PathVariable UUID beerId) {
        return ResponseEntity.ok(beerService.getBeerById(beerId));
    }

}
