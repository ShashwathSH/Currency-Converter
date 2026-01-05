package com.shashwathsh.Currency_Converter.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import javax.validation.constraints.Min;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CurrencyConverterEntity {
    @Min(value = 3)
    String fromCurrency;
    @Min(value = 3)
    String toCurrency;

    Integer units;

}
