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
public class Queen extends Piece{
    
     public Queen(boolean colour, boolean alive){
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
                //if(inirow != firow && inicolumn != ficolumn){
                if(inirow ==  firow && inicolumn == ficolumn)
                    check = false;
                
                else{
                    
                    if(Math.abs(firow - inirow) == Math.abs(ficolumn - inicolumn)){
                        // Got to check the feasibility of the move in a way that no other piece falls into its path.
                        for(i = inirow+1, j = inicolumn+1; i < firow; i++, j++){
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
                        // Got to correct the for loops according as follows!
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
                    }
                    else if(Math.abs(firow - inirow) <= 7 && Math.abs(ficolumn - inicolumn) == 0){
                        // Got to check for vertical movements
                        //System.out.println("hi1");
                        for(i = inirow+1 ; i < firow; i++){
                            
                            if(Piece.che == false){
                            
                                if(Chessboard.boxes[i][inicolumn] != null){
                                    Piece.che = true;
                                    break;
                                }
                            
                            }
                            else
                                break;
                        }
                        
                        for(i = inirow-1 ; i > firow; i--){
                            
                            if(Piece.che == false){
                            
                                if(Chessboard.boxes[i][inicolumn] != null){
                                    Piece.che = true;
                                    break;
                                }
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
                    else if(Math.abs(firow - inirow) == 0 && Math.abs(ficolumn - inicolumn) <= 7){
                        // got to check for horizontal movements
                        for(i = inicolumn+1 ; i < ficolumn; i++){
                            
                            if(Piece.che == false){
                                if(Chessboard.boxes[inirow][i] != null && Piece.che == false){
                                    Piece.che = true;
                                    break;
                                }
                            
                            }
                            else 
                                break;
                            
                        }
                        
                        for(i = inicolumn-1 ; i > ficolumn; i--){
                            
                            if(Piece.che == false){
                                
                                if(Chessboard.boxes[inirow][i] != null){
                                    Piece.che = true;
                                    break;
                                }
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
                //}
                }
                
            }
            else{
               
                if(inirow == firow && inicolumn == ficolumn)
                    check = false;
                
                else{
                    
                    if(Math.abs(firow - inirow) == Math.abs(ficolumn - inicolumn)){
                        // Got to check the feasibility of the move in a way that no other piece falls into its path.
                        for(i = inirow+1, j = inicolumn+1; i < firow; i++, j++){
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
                        // Got to correct the for loops according as follows!
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
                            else
                                break;
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
                    else if(Math.abs(firow - inirow) <= 7 && Math.abs(ficolumn - inicolumn) == 0){
                        // Got to check for vertical movements
                        for(i = inirow+1 ; i < firow; i++){
                            
                            if(Piece.che == false){
                            
                                if(Chessboard.boxes[i][inicolumn] != null){
                                    Piece.che = true;
                                    break;
                                }
                            
                            }
                            else
                                break;
                        }
                        
                        for(i = inirow-1 ; i > firow; i--){
                            
                            if(Piece.che == false){
                            
                                if(Chessboard.boxes[i][inicolumn] != null){
                                    Piece.che = true;
                                    break;
                                }
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
                        else
                            check = false;
                    }
                    else if(Math.abs(firow - inirow) == 0 && Math.abs(ficolumn - inicolumn) <= 7){
                        // got to check for horizontal movements
                        for(i = inicolumn+1 ; i < ficolumn; i++){
                            
                            if(Piece.che == false){
                                if(Chessboard.boxes[inirow][i] != null && Piece.che == false){
                                    Piece.che = true;
                                    break;
                                }
                            
                            }
                            else 
                                break;
                            
                        }
                        
                        for(i = inicolumn-1 ; i > ficolumn; i--){
                            
                            if(Piece.che == false){
                                
                                if(Chessboard.boxes[inirow][i] != null){
                                    Piece.che = true;
                                    break;
                                }
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
                        else
                            check = false;
                        
                    }
                    else
                        check = false;
                }
                
                
            }
        }
        }
        
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
            return "wQ";
        else
            return "bQ";
    }
}
