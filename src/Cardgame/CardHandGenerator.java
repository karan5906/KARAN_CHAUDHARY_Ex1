/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cardgame;
/**
 @author karan chaudhary
 
 
 */

import Cardgame.Card.Suit;
import Cardgame.Card.Value;
import java.util.Random;

public class CardHandGenerator {


    public static Card[] generateHand(int numCards,
            Value[] cardValues, Suit[] cardSuits) {
        // We'll use Random to generate random numbers
        Random random = new Random();
        
        Card[] hand = new Card[numCards];

        for (int i = 0; i < hand.length; i++) {
            Card.Value value = cardValues[random.nextInt(cardValues.length)];
            Card.Suit suit = cardSuits[random.nextInt(cardSuits.length)];

            Card card = new Card(value, suit);
            hand[i] = card;
        }
        return hand;
    }

}
