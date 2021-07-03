//MANCALA 2.0
//redid on my own

import java.io.*;
import java.util.*;


public class Mancala{
  public static void main(String[]args){
    int aiBoard[]={0,4,4,4,4,4,4};
    int playerBoard[]={4,4,4,4,4,4,0};

    boolean gameOn=false;
    if (gameOn==false){
      aiBoard[0]=0;
      playerBoard[6]=0;
      for (int i=1; i<aiBoard.length; i++){
        aiBoard[i]=4;
      }
      for (int i=0; i<playerBoard.length-1; i++){
        playerBoard[i]=4;
      }
      System.out.println("Welcome to Mancala! Choose a position above your side to start the game!");
      board(aiBoard,playerBoard);

      Scanner num = new Scanner(System.in);
      int play=num.nextInt();
      if (play>1 || play<6){
      playerFirstPlay(gameOn,playerBoard, play);
      } else {
        System.out.println("Sorry, choose a number between 1 and 6");
        play=num.nextInt();
      }
    }//end gameOnFalse

    if (gameOn==true){
      int turn=0;
      board(aiBoard,playerBoard);
      if (turn % 2==0){
        System.out.print("AI turn");
        //playerTurn();
      } else {
        System.out.print("Player turn");
        //aiTurn();
      }


    }//end gameOnTrue
    

  }//end main

  public static void playerFirstPlay(boolean on, int playerMove[], int number/*playerboard imported*/){
    on=true;
    int hand=0;
    for (int i=0; i<playerMove.length-1; i++){
      if (number==i){
        hand=playerMove[i]-7;
        playerMove[i]=0;
      }
    }
    for (int x=1; x<hand; x++){
      playerMove[x]=playerMove[x]-1;
    }
    if (hand==0){

    }



  }//end first move


  public static void board(int [] ai, int [] player){
  System.out.println("ai position" + "\n"+ "1 2 3 4 5 6");
   for (int i=1; i<ai.length; i++){
      System.out.print(ai[i]+" ");
    }
    System.out.print("\n");
    for (int i=0; i<player.length-1; i++){
        System.out.print(player[i]+" ");
     }
    System.out.print("\n");

    System.out.println("6 5 4 3 2 1"+"\n" + "player position");
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
