package com.indra.technicalTest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.indra.technicalTest.PriceService;
import com.indra.technicalTest.model.Price;

/**
 * Controller that manages queries.
 */
@RestController
@RequestMapping("/api/prices")
public class PriceController {
    @Autowired
    private PriceService priceService;

    
    /**
     * Endpoint REST
     *
     * @param brandId   Brand identifier.
     * @param productId Product identifier.
     * @param date      Date for consultation.
     * @return 			ResponseEntity with the object or NOT_FOUND if it doesn't exist.
     */
    @GetMapping
    public ResponseEntity<Price> getPrice(
        @RequestParam Integer brandId,
        @RequestParam Integer productId,
        @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) String date) {
        Price price = priceService.getPrice(brandId, productId, date);

        if (price != null) {
            return new ResponseEntity<>(price, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
