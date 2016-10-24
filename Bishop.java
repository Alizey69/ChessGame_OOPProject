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
public class Bishop extends Piece{
    
     public Bishop(boolean colour, boolean alive){
        this.colour = colour;
        this.alive = alive;
        
    }
    
    @Override
    void move(int inirow, int inicolumn, int firow, int ficolumn){
        boolean check = true;
        int i, j;
        Piece.che = false;
        
        if((Chessboard.chance%2 == 0 && colour == true) || (Chessboard.chance%2 == 1 && colour == false)){
            
        if(inirow < 8 && inicolumn < 8 && inirow >= 0 && inicolumn >= 0 &&(firow < 8 && ficolumn < 8 && firow >= 0 && ficolumn >= 0) ){
            
            if(Chessboard.boxes[firow][ficolumn] == null){
               
                if(Math.abs(firow - inirow) == Math.abs(ficolumn - inicolumn)){
                        
                    for(i = inirow+1, j = inicolumn+1; i <= firow; i++, j++){
                        if(j <= ficolumn){
                            if(Piece.che == false){
                                if(Chessboard.boxes[i][j] != null){
                                        Piece.che = true;
                                        break;
                                    }
                                }
                                else
                                    break;
                            }
                            else 
                                break;
                        }
                        
                        for(i = inirow-1, j = inicolumn-1; i >= firow; i--, j--){
                            
                            if(j >= ficolumn){
                                
                                if(Piece.che == false){
                               
                                    if(Chessboard.boxes[i][j] != null){
                                        Piece.che = true;
                                        break;
                                    }
                                }
                                else break;
                            }
                            else 
                                break;
                        }
                        
                        for(i = inirow+1, j = inicolumn-1; i <= firow; i++, j--){
                            
                            if(j >= ficolumn){
                                if(Piece.che == false){
                                
                                    if(Chessboard.boxes[i][j] != null){
                                        Piece.che = true;
                                        break;
                                    }
                                }
                                else
                                    break;
                            }
                            else 
                                break;
                        }
                        
                        for(i = inirow-1, j = inicolumn+1; i >= firow; i--, j++){
                            if(j <= ficolumn){
                                if(Piece.che == false){
                                
                                    if(Chessboard.boxes[i][j] != null){
                                        Piece.che = true;
                                        break;
                                    }
                                }
                                else
                                    break;
                                }
                                else 
                                    break;
                        }
                        
                        if(Piece.che == false){
                            
                            Chessboard.boxes[firow][ficolumn] = Chessboard.boxes[inirow][inicolumn];
                            Chessboard.boxes[inirow][inicolumn] = null;
                        }
                        else
                            check = false;
                        
                    }
                    else
                        check = false;
                
            }
            else{
                
                
                if(inirow == firow && inicolumn == ficolumn)
                    check = false;
                
                else{
                
                    if(Math.abs(firow - inirow) == Math.abs(ficolumn - inicolumn)){
                        System.out.println("h1");
                        for(i = inirow+1, j = inicolumn+1; i < firow; i++, j++){
                            System.out.println("h1");
                            if(j < ficolumn){
                                
                                if(Piece.che == false){
                                
                                    if(Chessboard.boxes[i][j] != null){
                                        Piece.che = true;
                                        break;
                                    }
                                }
                                else
                                    break;
                            }
                            else 
                                break;
                        }
                        
                        for(i = inirow-1, j = inicolumn-1; i > firow; i--, j--){
                            if(j > ficolumn){
                                if(Piece.che == false){
                                
                                    if(Chessboard.boxes[i][j] != null){
                                        Piece.che = true;
                                        break;
                                    }
                                }
                                else
                                    break;
                            }
                            else 
                                break;
                        }
                        
                        for(i = inirow+1, j = inicolumn-1; i < firow; i++, j--){
                            if(j > ficolumn){
                                if(Piece.che == false){
                                
                                    if(Chessboard.boxes[i][j] != null){
                                        Piece.che = true;
                                        break;
                                    }
                                }
                                else
                                    break;
                            }
                            else 
                                break;
                        }
                        
                        for(i = inirow-1, j = inicolumn+1; i > firow; i--, j++){
                            if(j < ficolumn){
                                
                                if(Piece.che == false){
                                
                                    if(Chessboard.boxes[i][j] != null){
                                        Piece.che = true;
                                        break;
                                    }
                            }
                                else break;
                            }
                            else 
                                break;
                        }
                        
                        if(Piece.che == false){
                            
                            if(Chessboard.boxes[inirow][inicolumn].colour != Chessboard.boxes[firow][ficolumn].colour){
                            
                                kill((Piece)Chessboard.boxes[firow][ficolumn], firow, ficolumn);
                                Chessboard.boxes[firow][ficolumn] = Chessboard.boxes[inirow][inicolumn];
                                Chessboard.boxes[inirow][inicolumn] = null;
                            }
                            else
                                check = false;
                        }
                        
                    }
                    else
                        check = false;
                
                }
                 
            }
        }
        else
            check = false;
        }
        
        if(check == false)
            System.out.println("Wrong inputs for move!");
        else
            Chessboard.chance++;
    
    }
    @Override
    void kill(Piece p, int row, int col){
        p.alive = false;
        Chessboard.boxes[row][col] = null;
    }
    
    void check(King k){}
    
    void checkMate(King k){}
    
     @Override
    public String toString(){
        if(colour == true)
            return "wB";
        else
            return "bB";
    }
}
