package com.shashwathsh.Currency_Converter.service;

import com.shashwathsh.Currency_Converter.dto.CurrencyApiResponse;
import com.shashwathsh.Currency_Converter.dto.CurrencyConversionResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@RequiredArgsConstructor
public class CurrencyConverterServiceImpl implements CurrencyConverterService{

    RestClient restClient;
    static String API_KEY = "fca_live_Z0VuRdQEDIJWSWhmwP3zRNZHk2iDz6uvchvydIJZ";

    @Override
    public CurrencyConversionResponse convert(String base, String target, double units) {

        CurrencyApiResponse apiResponse =
                restClient.get()
                        .uri(uriBuilder -> uriBuilder
                                .path("/latest")
                                .queryParam("apikey",API_KEY)
                                .queryParam("base_currency",base)
                                .queryParam("target_currency",target)
                                .build())
                        .retrieve()
                        .body(CurrencyApiResponse.class);

        double rate = apiResponse.data().get(target);
        double convertedAmount = rate*units;

        return new CurrencyConversionResponse(
                base,
                target,
                units,
                rate,
                convertedAmount
                );
    }
}
