package com.shashwathsh.Currency_Converter.controller;

import com.shashwathsh.Currency_Converter.advice.ApiResponse;
import com.shashwathsh.Currency_Converter.dto.CurrencyConversionResponse;
import com.shashwathsh.Currency_Converter.service.CurrencyConverterService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CurrencyConvertController {
    private final CurrencyConverterService converterService;

    @GetMapping("/convertCurrency")
    public ResponseEntity<ApiResponse<CurrencyConversionResponse>> convert(
            @RequestParam String fromCurrency,
            @RequestParam String toCurrency,
            @RequestParam double units
    ){
        CurrencyConversionResponse response = converterService.convert(fromCurrency,toCurrency,units);

        return ResponseEntity.ok(new ApiResponse<>(response));
    }

}
