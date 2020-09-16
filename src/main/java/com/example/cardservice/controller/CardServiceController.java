package com.example.cardservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardservice.model.Card;
import com.example.cardservice.service.CardService;

@RestController
@RequestMapping("/api/v1")
public class CardServiceController {
 
	@Autowired
	private CardService cardService;
	
	@GetMapping("/card")
	public ResponseEntity<List<Card>> getAllCards(){
		List<Card> cards= cardService.getAllCards();
		
		if(cards==null || cards.isEmpty() )
			return new ResponseEntity("Sorry! No Cards Available for this account!",
					HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Card>>(cards,HttpStatus.OK);
		
		
	}
	
	@PostMapping("/card")
	public ResponseEntity<List<Card>> createCard(@RequestBody Card card){
		List<Card> cards= cardService.createCard(card);
		
		if(cards==null || cards.isEmpty() )
			return new ResponseEntity("Sorry! No Cards Available for this account!",
					HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Card>>(cards,HttpStatus.OK);
		
		
	}
	
	
	
	@PatchMapping("/card/{cardNo}/{creditLimit}")
	public ResponseEntity<Card> updateCreditLimit(
					@PathVariable("cardNo")Long cardNo,
					@PathVariable("creditLimit")double creditLimit){
		Card card= cardService.updateLimit(cardNo, creditLimit);
		
		if(card==null  )
			return new ResponseEntity("Sorry! Updation error!",
					HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<Card>(card,HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/card/{cardNo}")
	public ResponseEntity<List<Card>> deleteCard(@PathVariable("cardNo")Long cardNo){
		List<Card> cards= cardService.deleteCard(cardNo);
		
		if(cards==null || cards.isEmpty() )
			return new ResponseEntity("Sorry! No cards Available in Db!",
					HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<List<Card>>(cards,HttpStatus.OK);
		
	}

	
	
	
}
