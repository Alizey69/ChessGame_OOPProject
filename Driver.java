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
        
        // White pieces are above and black ones are towards bottom initially!
        while(true){
        
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
        }
        
    }
    
}
