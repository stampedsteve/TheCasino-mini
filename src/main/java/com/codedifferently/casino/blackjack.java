package com.codedifferently.casino;

import java.util.ArrayList;

import com.codedifferently.*;




public class blackjack {
    

    public Integer getHandValue(player p){
        ArrayList<Card> temp = p.showHand();
        Integer result = 0;
        for(Card c: temp){
            Integer value = c.getValue().getVal();
            result += value;
        }
        return result;
    }
            

    
    public void dealHands(ArrayList deck,player p1, player p2){
        p1.addCard(deck.remove(0));
        p1.addCard(deck.remove(1));
        getHandValue(p1);


        p2.addCard(deck.remove(2));
        p2.addCard(deck.remove(3));
        getHandValue(p2);

    
        
    }

    public void dealCard(ArrayList deck,player p){
        p.addCard(deck.remove(0));
    }
    /*
    public void BlackGame(){
        while(getHandValue(p1) > 21 && getHandValue(p2) > 21){
            
        }
    }
    */
}