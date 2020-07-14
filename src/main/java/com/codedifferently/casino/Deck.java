package com.codedifferently.casino;

import com.codedifferently.casino.Card;
import com.codedifferently.casino.Card.Suit;
import com.codedifferently.casino.Card.Value;

import java.util.ArrayList;

public class Deck {
    // private Card card;
    private ArrayList<Card> cardsInDeck = new ArrayList<Card>();
    

    // this.card = new ArrayList <card>();

    public Deck(){
        Integer count = 1;
        for(Value s :Value.values()){
            for(Suit v : Suit.values()){
                Card card = new Card(v, s);
                cardsInDeck.add(card);
                System.out.println(card.toString());
                System.out.println(count);
                count++;
            }
        }
    }
    public ArrayList<Card> getDeck(){
        return cardsInDeck;
    }
}




    

