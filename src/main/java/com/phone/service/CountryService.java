package com.phone.service;


import com.phone.model.Country;

public interface CountryService {
    Country findByValue(String value);
}