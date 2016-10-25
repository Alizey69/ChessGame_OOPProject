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
class Pawn extends Piece{
    
    
    public Pawn(boolean colour, boolean alive){
        this.colour = colour;
        this.alive = alive;
        
    }

    /*
    The move method is supposed to move the chess piece in a particular way
    abiding by the piece's behaviour.
    The type 
    */
    @Override
            /*Methods still not made so as to differentiate the moves for the black and white pieces, have to work on it too!*/
            /* For the move method got to determine when some of th epieces comeinthe way or not!*/
    void move(int inirow, int inicolumn, int firow, int ficolumn){
        
        boolean check = true;
        Piece.che = false;
        
        // Ensuring that in white's turn, white pieces are only move and in black's chance only black pieces move!
        if((Chessboard.chance%2 == 0 && colour == true) || (Chessboard.chance%2 == 1 && colour == false)){
        //System.out.println("Hi1");
        
        if(inirow < 8 && inicolumn < 8 && inirow >= 0 && inicolumn >= 0 &&(firow < 8 && ficolumn < 8 && firow >= 0 && ficolumn >= 0) ){
           // System.out.println("Hi2");
            if(Chessboard.boxes[firow][ficolumn] == null){
            //System.out.println("Hi3");
                
                    //System.out.println("Hi4");
                if((firow - inirow) == 1 && ficolumn - inicolumn == 0 && colour == true){
                    //System.out.println("Hi5");
                        Chessboard.boxes[firow][ficolumn] = Chessboard.boxes[inirow][inicolumn];
                        Chessboard.boxes[inirow][inicolumn] = null;
                        
                        if(check(firow, ficolumn) == true){
                                System.out.println("Opponent move your King! Check!");
                            }
                     
                }
                else if((firow - inirow) == -1 && ficolumn - inicolumn == 0 && colour == false){
                    //System.out.println("Hi6");
                        Chessboard.boxes[firow][ficolumn] = Chessboard.boxes[inirow][inicolumn];
                        Chessboard.boxes[inirow][inicolumn] = null;
                        
                        if(check(firow, ficolumn) == true){
                                System.out.println("Opponent move your King! Check!");
                            }
                }
                
                else if((firow - inirow) == 2 && ficolumn - inicolumn == 0 && colour == true && inirow == 1){
                    
                    for(int i = inirow+1; i <= firow; i++){
                        if(Piece.che == false){
                            if(Chessboard.boxes[i][inicolumn] != null){
                                Piece.che = true;
                                //System.out.println("Sad");
                                break;
                            }
                        }
                        else
                            break;
                    }
                    
                    for(int i = inirow-1; i >= firow; i--){
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
                        
                        if(check(firow, ficolumn) == true){
                                System.out.println("Opponent move your King! Check!");
                            }
                    }
                    else
                        check = false;
                    
                }
                else if((firow - inirow) == -2 && ficolumn - inicolumn == 0 && colour == false && inirow == 6){
                    for(int i = inirow+1; i <= firow; i++){
                        if(Piece.che == false){
                            if(Chessboard.boxes[i][inicolumn] != null){
                                Piece.che = true;
                                //System.out.println("Sad");
                                break;
                            }
                        }
                        else
                            break;
                    }
                    
                    for(int i = inirow-1; i >= firow; i--){
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
            
            else{
                
                if(Chessboard.boxes[firow][ficolumn] != null){
                    //System.out.println("Hey1");
                    
                    if(inirow == firow && inicolumn == ficolumn){
                        check = false;
                    }
                    else{
                    //if(inirow != firow && inicolumn != ficolumn){
                         
                        if((firow - inirow) == 1 && Math.abs(ficolumn - inicolumn) == 1 && colour == true){
                        
                       // The kill method is not yet made, will implement it in future submissions!
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
                        else if((firow - inirow) == -1 && Math.abs(ficolumn - inicolumn) == 1 && colour == false){
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
                    //}
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
        
        //System.out.println(Chessboard.boxes[firow][ficolumn].getClass());
       
        
    }
    /*
    The kill method as its name suggests kills the piece on which it is called
    upon, sends the piece to the graveyard! This method is same for every piece
    actually.
    */
    @Override
    void kill(Piece p, int row, int column){
        p.alive = false;
        Chessboard.graveyard[Chessboard.gravecounter] = p;
        Chessboard.boxes[row][column] = null;
        
        Chessboard.gravecounter++;
    }
    /*
    This method is only used by the Pawn for when it reacher the base of the
    base of the opponent to respawn a player's lost pieces.
    */
    void revive(Piece p){}
    /*
    This method is called upon after the move method is called upon and tells
    whether the opponent's king is under siege or not. If this returns as true 
    then the move method of the opponent's king is forced into play.
    inirow and inicolumn sends the present position of the piece into the method.
    */
    @Override
    boolean check(int inirow, int inicolumn){
        
        Chessboard.krow = 0;
        Chessboard.kcolumn = 0;
        
        boolean ch = true;
        int i, j;
       
        boolean col = this.colour;
        // colour of opponent's king
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
        
        //System.out.println(Chessboard.krow +" "+ Chessboard.kcolumn);
        
        if((Chessboard.krow - inirow) == 1 && Math.abs(Chessboard.kcolumn - inicolumn) == 1){
                        
                       // The kill method is not yet made, will implement it in future submissions!
                        if(Chessboard.boxes[inirow][inicolumn].colour != Chessboard.boxes[Chessboard.krow][Chessboard.kcolumn].colour){
                       
                            ch = true;
                        }
                        else
                           ch = false;
                        }
                        else if((Chessboard.krow - inirow) == -1 && Math.abs(Chessboard.kcolumn - inicolumn) == 1 && colour == false){
                            if(Chessboard.boxes[inirow][inicolumn].colour != Chessboard.boxes[Chessboard.krow][Chessboard.kcolumn].colour){
                       
                            ch = true;
                        }
                        else
                           ch = false;
                        }
                        
                    else
                        ch = false;
        
        return ch;
        
        
    }
    /* 
    When a checkmate happens, that is, when check and kill method is called 
    simultaneously then finally the checkMate method is called to end the game itself.
    */
    void checkMate(King k){}
    @Override
    
    public String toString(){
        if(colour == true)
            return "wP";
        else
            return "bP";
    }
 
}
