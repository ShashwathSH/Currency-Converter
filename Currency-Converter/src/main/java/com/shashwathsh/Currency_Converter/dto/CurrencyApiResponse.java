package com.shashwathsh.Currency_Converter.dto;

import java.util.Map;

public record CurrencyApiResponse(
        Map<String, Double> data
) {
}
