package com.example.cardservice.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cardservice.model.Card;
import com.example.cardservice.repository.CardServiceRepository;

@Service("CardService")
public class CardServiceImpl implements CardService {
	
	@Autowired
	private CardServiceRepository cardServiceRepository;

	@Override
	public List<Card> getAllCards() {
		
		return cardServiceRepository.findAll();
	}

	@Override
	public Card findCard(Long cardNo) {
		
		return cardServiceRepository.getOne(cardNo);
	}
	
	@Override
	public List<Card> deleteCard(Long cardNo) {
		Card  card= findCard(cardNo);
		if(card!=null)
				cardServiceRepository.delete(card);
		return getAllCards();
	
	}

	@Override
	public Card updateLimit(Long cardNo, double creditLimit) {
		Card card=findCard(cardNo);
		if(card!=null)
			card.setCreditLimit(creditLimit);
		return card;
	}
	
	@Override
	public List<Card> createCard(Card card) {
		//customerServiceRepository.save(card.getCustomerId());
		cardServiceRepository.save(card);
		return cardServiceRepository.findAll();
	}


}
