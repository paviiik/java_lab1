package com.phone.repository;


import com.phone.model.Country;
import com.phone.service.CountryService;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class CountryDaoImpl implements CountryService {
    // Хардкодим список стран
    private final List<Country> countries;
    public CountryDaoImpl() {
        countries = Arrays.asList(
                new Country("Germany", "DE", "+49"),
                new Country("United States", "US", "+1"),
                new Country("Belarus", "BY", "+375")
        );
    }

    @Override
    public Country findByValue(String value) {
        return countries.stream()
                .filter(c ->
                        c.getName().equalsIgnoreCase(value) ||
                                c.getCode().equalsIgnoreCase(value) ||
                                c.getPhoneCode().equals(value))
                .findFirst()
                .orElse(null);
    }
}