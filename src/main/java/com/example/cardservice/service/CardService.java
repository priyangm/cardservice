package com.example.cardservice.service;

import java.util.List;

import com.example.cardservice.model.Card;

public interface CardService {

	List<Card> getAllCards();

	Card findCard(Long cardNo);

	List<Card> deleteCard(Long cardNo);

	Card updateLimit(Long cardNo, double creditLimit);

	List<Card> createCard(Card card);


}