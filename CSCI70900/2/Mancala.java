//MANCALA 2.0
//redid on my own

//NEXT STEPS
//work on main if (player)
//reconider doing one array

import java.io.*;
import java.util.*;


public class Mancala{
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
  }//end board FINALIZED

  public static void main(String[]args){
    int aiBoard[]={0,4,4,4,4,4,4};
    int playerBoard[]={4,4,4,4,4,4,0};
//need to add pits ai||player equal 0 && gameOn true
//also need to add game ends at ai||player equal 0 && ai>player||ai<player mancala score
    int scores=0;

    if (player)

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
      System.out.println("Welcome to Mancala! Enter 0 to start!");
      Scanner in = new Scanner(System.in);
      int start=in.nextInt();
      if (start !=0){
        System.out.println("Only type 0 to begin!");
        start=in.nextInt();
        if (start==0){
          gameOn=true;
        }
      } else {
        gameOn=true;
      }
    }//end gameOnFalse

    if (gameOn==true){
      int turn=0;
      board(aiBoard,playerBoard);
      int play=0;
      if (turn % 2==0){
        System.out.println("Player turn");
        Scanner num = new Scanner(System.in);
        play=num.nextInt();
         if (play<1 || play>6){
           System.out.println("Sorry, choose a number between 1 and 6");
            play=num.nextInt();
          //playerTurn();
      } else {
          playerPlay(playerBoard,aiBoard, play);
          board(aiBoard,playerBoard);
          turn=turn+1;
      }
      } else {
         System.out.println("AI turn");
         aiPlay(playerBoard, aiBoard); //deleted play from here
          board(aiBoard,playerBoard);
          turn=turn+1;
        //aiTurn();
      }

    }//end gameOnTrue
    

  }//end main

        //HERE IS WHERE I GET STUCK AND NEED TO FIX CODE
  public static void playerPlay(int playerMove[], int aiMove[], int number/*playerboard imported*/){
    int hand=0;
    hand=playerHand(number, playerMove); //returns hand
   for (int i=hand; i<hand; i++){
     for(int j=6; j<playerMove.length-1; j--){
       playerMove[j]=playerMove[j]+1;
       hand=hand-1;
     } if (hand>0){
       for (i=hand; i<hand; i++){
         aiMove[i]=aiMove[i]+1;
         hand=hand-1;
       }
     }
   }
    // takes hand and subtracts one from each index. circle through
   
  }//end first play

  public static int aiPlay(int[] playerBoard, int [] aiBoard){
return 0;
  }

  public static int playerHand(int number, int playerMove[]){
    //takes number of position and translates to board. sets that position to zero
    int hand=0;
    if (number==1){
      hand=playerMove[6];
      playerMove[6]=0;
    } else if (number==2){
      hand=playerMove[5];
      playerMove[5]=0;
    } else if (number==3){
      hand=playerMove[4];
      playerMove[4]=0;
    } else if (number==4){
      hand=playerMove[3];
      playerMove[3]=0;
    } else if (number==5){
      hand=playerMove[2];
      playerMove[2]=0;
    } else if (number==6){
      hand=playerMove[1];
      playerMove[1]=0;
    }
    return hand;
}//end playerPosition


  

}//end class
