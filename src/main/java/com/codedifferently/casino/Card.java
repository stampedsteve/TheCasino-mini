package com.codedifferently.casino;

public class Card {
    private Suit suit;
    private Value value;
    enum Suit {
        heart,
        diamond,
        club,
        spades
    }

    enum Value{
 
    two(2), 
    three(3), 
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9),
    ten(10),
    jack(10),
    queen(10),
    king(10),
    ace(11);
 
    private Integer val;
 
    Value(Integer carVal) {
        this.val = carVal;
    }
 
    public Integer getVal() {
        return val;
    }
}
public Card(Suit suit,Value val){
    this.suit = suit;
    this.value = val;
  }

  public Value getValue() {
        return this.value;
  }

  public Suit getSuit(){
      return this.suit;
  }
}