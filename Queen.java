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
                            
                            if(check(firow, ficolumn) == true){
                                    System.out.println("Opponent move your King! Check!");
                                }
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
                            
                            if(check(firow, ficolumn) == true){
                                    System.out.println("Opponent move your King! Check!");
                                }
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
                                
                                if(check(firow, ficolumn) == true){
                                    System.out.println("Opponent move your King! Check!");
                                }
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
        }
        
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
        
        if(Math.abs(Chessboard.krow - inirow) == Math.abs(Chessboard.kcolumn - inicolumn)){
                        // Got to check the feasibility of the move in a way that no other piece falls into its path.
                        for(i = inirow+1, j = inicolumn+1; i < Chessboard.krow; i++, j++){
                            if(j < Chessboard.kcolumn){
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
                        
                        for(i = inirow-1, j = inicolumn-1; i > Chessboard.krow; i--, j--){
                            if(j > Chessboard.kcolumn){
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
                        for(i = inirow+1, j = inicolumn-1; i < Chessboard.krow; i++, j--){
                            if(j > Chessboard.kcolumn){
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
                        
                        for(i = inirow-1, j = inicolumn+1; i > Chessboard.krow; i--, j++){
                            if(j < Chessboard.kcolumn){
                                
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
                            
                            if(Chessboard.boxes[inirow][inicolumn].colour != Chessboard.boxes[Chessboard.krow][Chessboard.kcolumn].colour){
                            
                                ch = true;
                            }
                            else
                                ch = false;
                        }
                    }
                    else if(Math.abs(Chessboard.krow - inirow) <= 7 && Math.abs(Chessboard.kcolumn - inicolumn) == 0){
                        // Got to check for vertical movements
                        for(i = inirow+1 ; i < Chessboard.krow; i++){
                            
                            if(Piece.che == false){
                            
                                if(Chessboard.boxes[i][inicolumn] != null){
                                    Piece.che = true;
                                    break;
                                }
                            
                            }
                            else
                                break;
                        }
                        
                        for(i = inirow-1 ; i > Chessboard.krow; i--){
                            
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
                        // got to check for horizontal movements
                        for(i = inicolumn+1 ; i < Chessboard.kcolumn; i++){
                            
                            if(Piece.che == false){
                                if(Chessboard.boxes[inirow][i] != null && Piece.che == false){
                                    Piece.che = true;
                                    break;
                                }
                            
                            }
                            else 
                                break;
                            
                        }
                        
                        for(i = inicolumn-1 ; i > Chessboard.kcolumn; i--){
                            
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
        //System.out.println(ch);
        return ch;
    
    }
    
    void checkMate(King k){}
    
     @Override
    public String toString(){
        if(colour == true)
            return "wQ";
        else
            return "bQ";
    }
}
