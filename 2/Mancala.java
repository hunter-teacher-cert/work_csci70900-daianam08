//redid
import java.io.*;
import java.util.*;


public class Mancala{
  public static void main(String[]args){
    int aiBoard[]={0,4,4,4,4,4,4};
    int playerBoard[]={4,4,4,4,4,4,0};
    
    boolean gameOn=false;
    if (gameOn=false){
      aiBoard[]={0,4,4,4,4,4,4};
      playerBoard[]={4,4,4,4,4,4,0};
      System.out.println("Welcome to Mancala! Choose a position on your side to start the game!");
      board(aiBoard,playerBoard);
    }//end gameOnFalse

    if (gameOn==true;){
      




    }//end gameOnTrue
    

  }//end main



  public static void board(int [] ai, int [] player){
  System.out.println("ai position" + "\n"+ "1 2 3 4 5 6");
   for (int i=1; i<ai.length; i++){
      System.out.print(ai[i]+" ");
    }
    System.out.print("\n");
    for (int i=1; i<player.length; i++){
        System.out.print(player[i]+" ");
     }
    System.out.print("\n");

    System.out.println("1 2 3 4 5 6"+"\n" + "player position");
    System.out.println("Mancala: ai="+ai[0]+", player="+player[6]);
// display(example) 
//ai poition
//1 2 3 4 5 6
//4 4 4 4 4 4
//4 4 4 4 4 4
//6 5 4 3 2 1
//player position
//Mancala: ai= 0 player= 0
  }//end board

}//end class
