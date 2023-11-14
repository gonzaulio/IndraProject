package com.indra.technicalTest;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.technicalTest.model.Price;
import com.indra.technicalTest.repository.PriceRepository;

/**
 * Service with business logic.
 */
@Service
public class PriceService {
    @Autowired
    private PriceRepository priceRepository;

    /**
     * Find the applicable price for a product on a given date.
     *
     * @param brandId   Brand identifier.
     * @param productId Product identifier.
     * @param date      Date for consultation.
     * @return 			The Price entity that represents the applicable price.
     */
    public Price getPrice(Integer brandId, Integer productId, String date) {
        List<Price> prices = priceRepository.findByBrandIdAndProductIdAndStartDateBeforeAndEndDateAfter(
                brandId, productId, date, date);

        return prices.stream()
            .max(Comparator.comparing(Price::getPriority))
            .orElse(null);
    }
}
