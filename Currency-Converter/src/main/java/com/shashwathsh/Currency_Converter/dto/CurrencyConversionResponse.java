package com.shashwathsh.Currency_Converter.dto;


public record CurrencyConversionResponse(

    String baseCurrency,
    String targetCurrency,
    double units,
    double rate,
    double convertedAmount
){
}
