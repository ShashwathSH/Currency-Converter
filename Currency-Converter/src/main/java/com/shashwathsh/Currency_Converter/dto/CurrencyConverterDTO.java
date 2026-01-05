package com.shashwathsh.Currency_Converter.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CurrencyConverterDTO {

    String fromCurrency;
    String toCurrency;
    Integer units;

}
