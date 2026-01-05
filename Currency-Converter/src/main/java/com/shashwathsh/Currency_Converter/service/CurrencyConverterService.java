package com.shashwathsh.Currency_Converter.service;

import com.shashwathsh.Currency_Converter.repository.CurrencyConverterRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@RequiredArgsConstructor
public class CurrencyConverterService {
    CurrencyConverterRepository currencyConverterRepository;
    ModelMapper modelMapper;

}
