package com.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer> {

	ExchangeValue findFromandTo(String from, String to);
}
