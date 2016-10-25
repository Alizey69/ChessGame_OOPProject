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
public class Rook extends Piece {
    
     public Rook(boolean colour, boolean alive){
        this.colour = colour;
        this.alive = alive;
        
    }
    
    @Override
    void move(int inirow, int inicolumn, int firow, int ficolumn){
        boolean check = true;
        Piece.che = false;
        
        if((Chessboard.chance%2 == 0 && colour == true) || (Chessboard.chance%2 == 1 && colour == false)){
        
        if(inirow < 8 && inicolumn < 8 && inirow >= 0 && inicolumn >= 0 &&(firow < 8 && ficolumn < 8 && firow >= 0 && ficolumn >= 0) ){
            
            if(Chessboard.boxes[firow][ficolumn] == null){
                
                //if(inirow != firow && inicolumn != ficolumn){
                    
                    if(Math.abs(firow - inirow) <= 7 && Math.abs(ficolumn - inicolumn) == 0){
                        
                        for(int i = inirow+1 ; i <= firow; i++){
                            if(Piece.che == false){
                            
                                if(Chessboard.boxes[i][inicolumn] != null){
                                    Piece.che = true;
                                    break;
                                }
                            }
                            else 
                                break;
                        }
                        
                        for(int i = inirow-1 ; i >= firow; i--){
                            if(Piece.che ==  false){
                            
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
                            
                            if(check(firow, ficolumn) == true){
                                System.out.println("Opponent move your King! Check!");
                            }
                        }
                        else
                            check = false;
                        
                        
                    }
                    
                    else if(Math.abs(firow - inirow) == 0 && Math.abs(ficolumn - inicolumn) <= 7){
                         
                        for(int i = inicolumn+1 ; i <= ficolumn; i++){
                            if(Piece.che ==  false){
                            
                                if(Chessboard.boxes[inirow][i] != null){
                                    Piece.che = true;
                                    break;
                                }
                            }
                            else
                                break;
                            
                        }
                        
                        for(int i = inicolumn+1 ; i >= ficolumn; i--){
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
                            
                            if(check(firow, ficolumn) == true){
                                System.out.println("Opponent move your King! Check!");
                            }
                        }
                        else
                            check = false;
                    }
                    
                    else
                        check = false;
                //}
            }
            else{
                 //if(inirow != firow && inicolumn != ficolumn){
                 
                if(inirow == firow && inicolumn == ficolumn)
                    check = false;
                    
                     
                else{
                    if(Math.abs(firow - inirow) <= 7 && Math.abs(ficolumn - inicolumn) == 0){
                       // System.out.println("Hi1");
                        for(int i = inirow+1 ; i <= firow-1; i++){
                            
                            if(Piece.che == false){
                            
                                if(Chessboard.boxes[i][inicolumn] != null){
                                    Piece.che = true;
                                    break;
                                }
                            }
                            else
                                break;
                        }
                        
                        for(int i = inirow-1 ; i >= firow+1; i--){
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
                                
                                if(check(firow, ficolumn) == true){
                                System.out.println("Opponent move your King! Check!");
                            }
                                
                            }
                            else
                                check = false;
                        }
                        else
                            check = false;
                        
                    }
                    
                    else if(Math.abs(firow - inirow) == 0 && Math.abs(ficolumn - inicolumn) <= 7){
                         
                        for(int i = inicolumn+1 ; i <= ficolumn-1; i++){
                            if(Piece.che == false){
                            
                                if(Chessboard.boxes[inirow][i] != null){
                                    Piece.che = true;
                                    break;
                                }
                            }
                            else
                                break;
                            
                        }
                        
                        for(int i = inicolumn-1 ; i >= ficolumn+1; i--){
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
                                
                                if(check(firow, ficolumn) == true){
                                    System.out.println("Opponent move your King! Check!");
                                }
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
        Chessboard.graveyard[Chessboard.gravecounter] = p;
        Chessboard.boxes[row][column] = null;
        
        Chessboard.gravecounter++;
    }
    /*
    This is castling method of the Rook which implements the castling mechanism
    of chess with the King.
    */
    void castling(King k){}
    
    @Override
    boolean check(int inirow, int inicolumn){
        
        Piece.che = false;
        
        Chessboard.krow = 0;
        Chessboard.kcolumn = 0;
        
        boolean ch = true;
        int i, j;
       
        boolean col = this.colour;
        col = !col;
        
        King k = new King(col, true);
        
        //System.out.println(col);
        
        for(i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                //System.out.println("Hi");
                if(Chessboard.boxes[i][j] != null){
                    if(Chessboard.boxes[i][j].getClass() == k.getClass() && Chessboard.boxes[i][j].colour == k.colour){
                       //System.out.println("Hi");
                       
                        Chessboard.krow = i;
                        Chessboard.kcolumn = j;
      
                        break;
                        
                    }  
                }
            }
        }
        
        if(Math.abs(Chessboard.krow - inirow) <= 7 && Math.abs(Chessboard.kcolumn - inicolumn) == 0){
                       // System.out.println("Hi1");
                        for(i = inirow+1 ; i <= Chessboard.krow-1; i++){
                            
                            if(Piece.che == false){
                            
                                if(Chessboard.boxes[i][inicolumn] != null){
                                    Piece.che = true;
                                    break;
                                }
                            }
                            else
                                break;
                        }
                        
                        for(i = inirow-1 ; i >= Chessboard.krow+1; i--){
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
                            
                            if(Chessboard.boxes[inirow][inicolumn].colour != Chessboard.boxes[Chessboard.krow][Chessboard.kcolumn].colour){
                                ch = true;
                            }
                            else
                                ch = false;
                        }
                        else
                            ch = false;
                        
                    }
                    
                    else if(Math.abs(Chessboard.krow - inirow) == 0 && Math.abs(Chessboard.kcolumn - inicolumn) <= 7){
                         
                        for(i = inicolumn+1 ; i <= Chessboard.kcolumn-1; i++){
                            if(Piece.che == false){
                            
                                if(Chessboard.boxes[inirow][i] != null){
                                    Piece.che = true;
                                    break;
                                }
                            }
                            else
                                break;
                            
                        }
                        
                        for(i = inicolumn-1 ; i >= Chessboard.kcolumn+1; i--){
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
                            
                            if(Chessboard.boxes[inirow][inicolumn].colour != Chessboard.boxes[Chessboard.krow][Chessboard.kcolumn].colour){
                                ch = true;
                            }
                            else
                                ch = false;
                            
                        }
                        else
                            ch = false;
                 }
                     else
                        ch = false;
        
        return ch;
        
    }
    
    
    
    void checkMate(King k){}
    
    @Override
    public String toString(){
        if(colour == true)
            return "wR";
        else
            return "bR";
    }
}
