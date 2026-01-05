package com.shashwathsh.Currency_Converter.repository;

import com.shashwathsh.Currency_Converter.entity.CurrencyConverterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyConverterRepository extends JpaRepository<CurrencyConverterEntity,String> {
}
