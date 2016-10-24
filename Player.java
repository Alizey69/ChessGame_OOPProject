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
public class Player {
    String name;
    boolean colour; // true for white and false for black
   // Pawn p1 = new Pawn();
   
    
    /*
    Main class for Chess not yet made, will follow up with a future submission, please excuse the delay! :(
    */
    
    public Player(String name, boolean colour){
        this.name = name;
        this.colour = colour;
        
        
        if(colour == true){
            // 8 pawns
           Piece Wpawn1 = new Pawn(colour, true);
           Piece Wpawn2 = new Pawn(colour, true);
           Piece Wpawn3 = new Pawn(colour, true);
           Piece Wpawn4 = new Pawn(colour, true);
           Piece Wpawn5 = new Pawn(colour, true);
           Piece Wpawn6 = new Pawn(colour, true);
           Piece Wpawn7 = new Pawn(colour, true);
           Piece Wpawn8 = new Pawn(colour, true);
           // 2 rooks
           Piece Wrook1 = new Rook(colour, true);
           Piece Wrook2 = new Rook(colour, true);
           // 2 knights
           Piece Wknight1 = new Knight(colour, true);
           Piece Wknight2 = new Knight(colour, true);
           // 2 bishops
           Piece Wbishop1 = new Bishop(colour, true);
           Piece Wbishop2 = new Bishop(colour, true);
           // 1 queen
           Piece Wqueen = new Queen(colour, true);
           // 1 king
           Piece Wking = new King(colour, true);
           
           Chessboard.boxes[1][0] = Wpawn1;
           Chessboard.boxes[1][1] = Wpawn2;
           Chessboard.boxes[1][2] = Wpawn3;
           Chessboard.boxes[1][3] = Wpawn4; 
           Chessboard.boxes[1][4] = Wpawn5;
           Chessboard.boxes[1][5] = Wpawn6; 
           Chessboard.boxes[1][6] = Wpawn7;
           Chessboard.boxes[1][7] = Wpawn8; 
           
           Chessboard.boxes[0][0] = Wrook1;
           Chessboard.boxes[0][7] = Wrook2;
           
           Chessboard.boxes[0][1] = Wknight1; 
           Chessboard.boxes[0][6] = Wknight2;
           
           Chessboard.boxes[0][2] = Wbishop1;
           Chessboard.boxes[0][5] = Wbishop2; 
           
           Chessboard.boxes[0][3] = Wqueen;
           
           Chessboard.boxes[0][4] = Wking; 
       }
        
        else{
           Piece Bpawn1 = new Pawn(colour, true);
           Piece Bpawn2 = new Pawn(colour, true);
           Piece Bpawn3 = new Pawn(colour, true);
           Piece Bpawn4 = new Pawn(colour, true);
           Piece Bpawn5 = new Pawn(colour, true);
           Piece Bpawn6 = new Pawn(colour, true);
           Piece Bpawn7 = new Pawn(colour, true);
           Piece Bpawn8 = new Pawn(colour, true);
           
           Piece Brook1 = new Rook(colour, true);
           Piece Brook2 = new Rook(colour, true);
           
           Piece Bknight1 = new Knight(colour, true);
           Piece Bknight2 = new Knight(colour, true);
           
           Piece Bbishop1 = new Bishop(colour, true);
           Piece Bbishop2 = new Bishop(colour, true);
           
           Piece Bqueen = new Queen(colour, true);
           
           Piece Bking = new King(colour, true);
           
           Chessboard.boxes[6][0] = Bpawn1;
           Chessboard.boxes[6][1] = Bpawn2;
           Chessboard.boxes[6][2] = Bpawn3;
           Chessboard.boxes[6][3] = Bpawn4; 
           Chessboard.boxes[6][4] = Bpawn5;
           Chessboard.boxes[6][5] = Bpawn6; 
           Chessboard.boxes[6][6] = Bpawn7;
           Chessboard.boxes[6][7] = Bpawn8; 
           
           Chessboard.boxes[7][0] = Brook1;
           Chessboard.boxes[7][7] = Brook2;
           
           Chessboard.boxes[7][1] = Bknight1; 
           Chessboard.boxes[7][6] = Bknight2;
           
           Chessboard.boxes[7][2] = Bbishop1;
           Chessboard.boxes[7][5] = Bbishop2; 
           
           Chessboard.boxes[7][4] = Bqueen;
           
           Chessboard.boxes[7][3] = Bking;
       }
       
    }

    
    
}
