/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ChessGame;
import java.lang.Math;
import java.util.*;
/**
 *
 * @author Alizey
 */

/*
This java file contains all the Pieces together with the Pieces class.
All different pieces as in Pawns, Rook, Bishop, King, Queen are here aswell and 
extends the Piece class.

*/


/*
Here, as we can see that the Piece class has attributes colour, row, column, alive.
Now, every attribute has its meaning.
The colour boolean stands for the Piece's
colour, that is if the colour of the Piece be white, its colour value would 
be true and hence false for black.
The row and column attribute as the name suggests, determines the Piece's position
on the chess board. 
The type attribute is different type of moves associated with a particular 
Piece.
*If and when a Piece dies its row and column value is to be turned into -1.*
The alive attribute is easy to understand as it tells when a Piece is on the 
chessboard or not.


*/
public abstract class Piece{
    boolean colour;
    boolean alive;
    // Have to make sure that each piece gets its own unique id.
    
    // Piece methods, to be inherited by all the sub pieces!
    abstract void move(int inirow, int inicolumn, int firow, int ficolumn);
    abstract void kill(Piece p, int row, int col);
    
    public static boolean che = false;
    
}


/*
The definitions for the subsequent similar methods remain the same.
*/







