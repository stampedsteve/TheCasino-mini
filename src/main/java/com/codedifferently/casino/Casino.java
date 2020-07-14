package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.codedifferently.casino.Card;

import com.codedifferently.*;

public class Casino {

    public static void main(String[] args) {
        boolean hit = false;
        String stayOrHit = "";
        Scanner scan = new Scanner(System.in);

        Deck newDeck = new Deck();
        ArrayList<Card> deckList = newDeck.getDeck();
        Collections.shuffle(deckList);
        player p1 = new player();
        player p2 = new player();
      
        blackjack b1 = new blackjack();
        b1.dealHands(deckList,p1,p2);
        if (b1.getHandValue(p1) == 21){
            System.out.println("Player wins!");
        }
        if (b1.getHandValue(p2) == 21){
            System.out.println("Dealer wins!");
        }

        while(stayOrHit != "stay"){
            System.out.println("stay or hit?");
            stayOrHit = scan.nextLine();
            if(stayOrHit == "hit"){
                b1.dealCard(deckList, p1);
                System.out.println(b1.getHandValue(p1));
            }
            if(b1.getHandValue(p1) > 21){
                System.out.println("Player loses");
            }
        }

        while(b1.getHandValue(p2) < 17){
            b1.dealCard(deckList, p2);
            if(b1.getHandValue(p2) > 21){
                System.out.println("Player wins");
            }
            if(b1.getHandValue(p2) > b1.getHandValue(p1)){
                System.out.println("Computer wins");
            }
            else{
                System.out.println("Player wins");
            }
        }
        
        
        System.out.println("Welcome to Blackjack");
        System.out.println("Player 1 Here is your Hand, would you like to hit or stay?");
        System.out.println(b1.getHandValue(p1));
        

        


    }
}    
            
    
    //implement card and CardDeck before lunch
    // implement blackjack before dinner
    //implement GoFish before 8:00
