 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cardgame;

/**
 *
 * @author Karan Chaudhary
 */
public class CardTrick extends Card {
    private String playername;

    public CardTrick(String playername, Value value, Suit suit) {
        super(value, suit);
        this.playername = playername;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }
    // Name- Karan Chaudhary
    //STUDENT ID - 991652837
    //I'm Done .
    
}
