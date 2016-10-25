/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame;

import java.util.Scanner;

/**
 *
 * @author Alizey
 */
public class Driver {
    
    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);
        
        Chessboard ch = new Chessboard();
        
        int i, j, inirow, inicol, firow, ficol;
        
        // stores the index of the last dead in the Graveyard array.
        int dead = 0;
        
        // White pieces are above and black ones are towards bottom initially!
        while(true){
        
        dead = Chessboard.gravecounter;
        System.out.println("");
        
        for(i = 0; i <= 7; i++){
            for(j = 0; j <= 7; j++){
                if(Chessboard.boxes[i][j] == null)
                    System.out.print("-" + "  ");
                else
                    System.out.print(Chessboard.boxes[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        if(Chessboard.chance%2 == 0)
            System.out.println("White's chance!");
        else
            System.out.println("Black's chance!");
        
        System.out.println("");
        
        System.out.println("Enter the initial location of the piece you want to move and then its final location all seperated by enters!");
        
        inirow = sc.nextInt();
        inicol = sc.nextInt();
        firow = sc.nextInt();
        ficol = sc.nextInt();
        
        
        
        Chessboard.boxes[inirow][inicol].move(inirow, inicol, firow, ficol);
        
        
        
        /*
        This loop is for checking the condition for when after a piece moves
        it 
        */
        for(i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                if(Chessboard.boxes[i][j] != null){
                    //System.out.print("ch ");
                    if(Chessboard.boxes[i][j].check(i, j) == true){
                        System.out.println("Invalid move, this will get your king killed!");
                        // even if one piece threatens the king it is check, and hence we can break out of
                        // the loop to avoid multiple printing of message.
                        
                        /*Avoiding the move here because this will result in a checkmate and thus, reducing the
                        chance counter in order to revert chance
                        */
                        Chessboard.chance--;
                        
                        /*Reverting back the move*/
                        Chessboard.boxes[inirow][inicol] = Chessboard.boxes[firow][ficol];
                        /* This part is necessary for the bringing back of a piece which
                        got killed due to a wrong move.
                        */
                        if(dead != Chessboard.gravecounter){
                            //System.out.println("Hey");
                            Chessboard.boxes[firow][ficol] = Chessboard.graveyard[dead];
                        }
                        else
                            Chessboard.boxes[firow][ficol] = null;
                        
                        break;
                    }
                }
                    
            }
        }
        
        }
        
    }
    
}
