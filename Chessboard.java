
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
    /* Stores the dead pieces! Helpful when we have to restore a piece that got killed
    but now the move needs to be reverted back.
    */
    public static Piece graveyard[] = new Piece[1000];
    public static int gravecounter = 0;
    // White will always start first.
    public static int chance = 2;
    
    public static int krow = 0;
    public static int kcolumn = 0;
    
    // true boolean with the Player object is for the player with white pieces.
    // whereas false with the Player object is for the black pieces.
    public Chessboard(){
        // p1 is white
        Player p1 = new Player("First One", true);
        // p2 is black 
        Player p2 = new Player("Second One", false);
    
    
    }
    
}
