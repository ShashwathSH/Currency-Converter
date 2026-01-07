package com.shashwathsh.Currency_Converter.service;

import com.shashwathsh.Currency_Converter.dto.CurrencyConversionResponse;
import org.springframework.stereotype.Service;

@Service
public interface CurrencyConverterService {

    CurrencyConversionResponse convert(String base,String target,double units);
}
