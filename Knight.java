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
public class Knight extends Piece{
    
     public Knight(boolean colour, boolean alive){
        this.colour = colour;
        this.alive = alive;
        
    }
    
    @Override
    void move(int inirow, int inicolumn, int firow, int ficolumn){
        boolean check = true;
        
        if((Chessboard.chance%2 == 0 && colour == true) || (Chessboard.chance%2 == 1 && colour == false)){
            
        
        if(inirow < 8 && inicolumn < 8 && inirow >= 0 && inicolumn >= 0 &&(firow < 8 && ficolumn < 8 && firow >= 0 && ficolumn >= 0) ){
           
            if(Chessboard.boxes[firow][ficolumn] == null){
              
                if(Math.abs(firow - inirow) == 2 && Math.abs(ficolumn - inicolumn) == 1){
                        
                        Chessboard.boxes[firow][ficolumn] = Chessboard.boxes[inirow][inicolumn];
                        Chessboard.boxes[inirow][inicolumn] = null;
                    }
                    
                    else if(Math.abs(firow - inirow) == 1 && Math.abs(ficolumn - inicolumn) == 2){
                        
                        Chessboard.boxes[firow][ficolumn] = Chessboard.boxes[inirow][inicolumn];
                        Chessboard.boxes[inirow][inicolumn] = null;
                        
                    }
                
                else
                    check = false;
         
            }
            
            else{
                if(Chessboard.boxes[firow][ficolumn] != null){
                     
                    if(inirow == firow && inicolumn == ficolumn)
                        check = false;
                    
                    else{
                         
                        if(Math.abs(firow - inirow) == 2 && Math.abs(ficolumn - inicolumn) == 1){
                            
                             if(Chessboard.boxes[inirow][inicolumn].colour != Chessboard.boxes[firow][ficolumn].colour){
                               
                                kill((Piece)Chessboard.boxes[firow][ficolumn], firow, ficolumn);
                            
                                Chessboard.boxes[firow][ficolumn] = Chessboard.boxes[inirow][inicolumn];
                                Chessboard.boxes[inirow][inicolumn] = null;
                             }
                             else
                                 check = false;
                        }
                        
                        else if(Math.abs(firow - inirow) == 1 && Math.abs(ficolumn - inicolumn) == 2){
                            
                            if(Chessboard.boxes[inirow][inicolumn].colour != Chessboard.boxes[firow][ficolumn].colour){
                                kill((Piece)Chessboard.boxes[firow][ficolumn], firow, ficolumn);
                            
                                Chessboard.boxes[firow][ficolumn] = Chessboard.boxes[inirow][inicolumn];
                                Chessboard.boxes[inirow][inicolumn] = null;
                            }
                            else
                                check = false;
                        }
                        
                        else 
                            check = false;
                        
                    }
                }
            }
        
       }
        else
            check = false;
        }
        else
            check = false;
        
        if(check == false)
            System.out.println("Wrong inputs for move!");
        else
            Chessboard.chance++;
       
    }
    
    @Override
    void kill(Piece p, int row, int column){
        
        p.alive = false;
        Chessboard.boxes[row][column] = null;
    }
    
    void check(King k){}
    
    void checkMate(King k){}
    
    @Override
    public String toString(){
        if(colour == true)
            return "wN";
        else
            return "bN";
    }
    
}
