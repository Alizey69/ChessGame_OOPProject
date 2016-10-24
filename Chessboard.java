
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame;

/**
 *
 * @author Alizey
 */

public class Chessboard {
    
    public static Piece boxes[][] = new Piece[8][8];
    // White will always start first.
    public static int chance = 2;
    // true boolean with the Player object is for the player with white pieces.
    // whereas false with the Player object is for the black pieces.
    public Chessboard(){
        // p1 is white
        Player p1 = new Player("First One", true);
        // p2 is black 
        Player p2 = new Player("Second One", false);
    
    
    }
    
}
