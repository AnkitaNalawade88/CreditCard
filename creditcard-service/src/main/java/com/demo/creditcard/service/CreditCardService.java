package com.demo.creditcard.service;

import com.demo.creditcard.entity.CreditCard;
import com.demo.creditcard.repository.CreditCardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CreditCardService {

    @Autowired
    private CreditCardRepository cardRepository;

    public CreditCard saveCard(CreditCard cc) {
        log.info("Inside saveCard of CreditCardService");
        return cardRepository.save(cc);
    }
	
	public List<CreditCard> getAllCards() {
		log.info("Inside getAllCards of CreditCardService");
		return cardRepository.findAll();
	}
}
