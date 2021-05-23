package com.demo.creditcard.controller;

import com.demo.creditcard.VO.ResponseTemplateVO;
import com.demo.creditcard.entity.CreditCard;
import com.demo.creditcard.service.CreditCardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/creditcards")
@Slf4j
public class CreditCardController {

    @Autowired
    private CreditCardService ccService;

	@PostMapping("/saveCard")
	public CreditCard saveCard(@RequestBody CreditCard cc) {
		return ccService.saveCard(cc);
	}

	@GetMapping("/getAllCards")
	public List<CreditCard> getAllCards() {
		return ccService.getAllCard();
	}
	
	
	
	
	

}
