package com.codedifferently.casino;

import java.util.ArrayList;

public class player {
    
    ArrayList<Card> hand = new ArrayList<Card>();
    Integer money = 200;
    

    public void addCard(Object object){
        hand.add((Card) object);
    }

    public void removeCard(Card c){
        hand.remove(c);
    }


    public ArrayList showHand(){
        return hand;
    }
   
    
   
   //display an error if a player picks over 10 cards

   }




