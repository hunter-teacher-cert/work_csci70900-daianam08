//mancala completed by group

import java.io.*;
import java.util.*;
import java.util.Scanner; //not necessary
import java.util.Random;  //not necessary

public class HMancala{
  //method for the player's turn
  public static int playerInput (int playerBoard[], int playerPitChoice) {
    //int playerPitChoice;
    //playerPitChoice = 0;
    boolean valid;
    valid = false;
    Scanner in = new Scanner(System.in);
    while (!valid)
    { //what is the benefit of adding this? couldn't we just say while (true)? also, is this to check if it's a valid move? or just to record that it's valid? should we make checking if a move is valid a separate method, isValidMove?
      //ask the user to pick stones from a pit
      System.out.println("From which pit would like to pick stones? Please pick a number from 1 to 6.");
      playerPitChoice = in.nextInt();
      valid  = true;
      //check to see if the input is invalid
      if (playerPitChoice != 1 &&
          playerPitChoice != 2 &&
          playerPitChoice != 3 &&
          playerPitChoice != 4 &&
          playerPitChoice != 5 &&
          playerPitChoice != 6)
      {
        System.out.println("That's not a valid pit. Pick a number from 1 to 6!");
        valid = false;
      }//end if statement to catch invalid input
      else
      {
          if  (playerBoard[playerPitChoice] == 0)
          {
           System.out.println("the pit is empty. Pick a number not with empty content");
           valid= false;
          }
      } // end else statement
    } //end while
    return playerPitChoice;
  }//end player input
 public static int aiInput(int aiBoard[], int aiPitChoice)
 {
  //int aiPitChoice;
  //aiPitChoice = 0;
  Random rand = new Random();
  aiPitChoice  = rand.nextInt(5) +1;
  while (aiBoard[aiPitChoice] ==0){ //how are we linking this to what's actually in the array?
    aiPitChoice++;
    if (aiPitChoice == 6)
      aiPitChoice = 1;
  }
  return aiPitChoice;
    //to choose a pit to pick from (at random); we need to check tom ake sure that the pit actually has stones in it; we can do this with a loop
  }//end aiTurn
  public static void mancalaAlgorithm(boolean ai, int aiBoard[], int playerBoard[], int aiPitChoice, int playerPitChoice)
  {
    //as discussed, we'll create a method that takes as input the player and ai pit choices, and then reconfigures the board; note: if we do this, how can/should we instantiate the board here?
    int index;
    int numberPit;
    int pitBoard[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    if (ai)
    {
        index = aiPitChoice;
        numberPit = aiBoard[aiPitChoice];
        aiBoard[aiPitChoice] =0;
    }
    else
    {
        index = playerPitChoice +7;
        numberPit = playerBoard[playerPitChoice];
        playerBoard[playerPitChoice]=0;
    }
    //System.out.println(numberPit);
    for (int i=0; i<13; i++)
    {
      for (int j=0; j<7; j++)
      {
          pitBoard[j] = aiBoard[j];
      }
      for (int j=0; j<7; j++)
      {
          pitBoard[j+7] = playerBoard[j];
      }
    }
    for (int i = 0; i < numberPit; i++)
    {
      //System.out.println(Arrays.toString(pitBoard));
        if (index == 13)
          {index = 0;}
        else
          {index++;}
        pitBoard[index] = pitBoard[index] + 1;
        //System.out.println(Arrays.toString(pitBoard));
    }
    if (ai)
    {
      if(pitBoard[aiPitChoice] == 0)
        {
        pitBoard[0]=pitBoard[0] + pitBoard[aiPitChoice+7];
        pitBoard[aiPitChoice+7]=0;
        }
      else
        if(pitBoard[playerPitChoice+7] == 0)
        {
        pitBoard[7]=pitBoard[7] + pitBoard[playerPitChoice];
        pitBoard[playerPitChoice]=0;
        }
    }
    for (int i=0; i<13; i++)
      {
        for (int j=0; j<7; j++)
        {
          aiBoard[j]=pitBoard[j];
        }
        for (int j=0; j<7; j++)
        {
          playerBoard[j]=pitBoard[j+7];
        }
      }
   //System.out.println(Arrays.toString(pitBoard));
  }
  public static boolean winCondition(int playerBoard[], int aiBoard[], boolean winner)
  {
    //method to check if game is over
    //should this return a boolean?
    int sumPitPlayer;
    int sumPitAi;
    sumPitPlayer = 0;
    sumPitAi = 0;
    for (int i = 1; i <7; i++)
    {
        sumPitPlayer = sumPitPlayer + playerBoard[i];
    }
    for (int i = 1; i < 7; i++)
    {
        sumPitAi = sumPitAi + aiBoard[i];
    }
    if (sumPitAi == 0 || sumPitPlayer ==0)
      winner = true;
    //System.out.println(sumPitPlayer);
    return winner;
  }
  public static void main (String[]args){
    int aiBoard[]={0,4,4,4,4,4,4};
    int playerBoard[]={0,4,4,4,4,4,4};
    Random rand = new Random();
    int playerPitChoice = 0;
    int aiPitChoice=0;
    boolean ai;
    boolean winner;
    winner = false;
    System.out.println("Welcome to Mancala! Here is the board:");
    while (!winner)
    {
      System.out.println( );
      System.out.println("The current Mancala" );
      board(aiBoard, playerBoard);
      ai = false;
      playerPitChoice =  playerInput (playerBoard, playerPitChoice);
      mancalaAlgorithm(ai, aiBoard, playerBoard, aiPitChoice, playerPitChoice);
      winner = winCondition(playerBoard, aiBoard, winner);
      if (!winner)
        {
          ai = true;
          aiPitChoice = aiInput(aiBoard, aiPitChoice);
          mancalaAlgorithm(ai, aiBoard, playerBoard, aiPitChoice, playerPitChoice);
        //board(aiBoard, playerBoard);
        winner = winCondition(playerBoard, aiBoard, winner);
        }
    } // end while
  System.out.println("Ai: " + aiBoard[0]);
  System.out.println("you: " + playerBoard[0]);
  if (playerBoard[0] >= aiBoard[0])
    System.out.println("you won" );
  else
    System.out.println("you lost" );
  }//end main
public static void board(int aiBoard[], int playerBoard[]){
  // will this print or will i have to make this a method? i am using things from the main :/
  //you already made this a method, right? -Ian
  System.out.println();
  System.out.println("ai position:   1 2 3 4 5 6");
  System.out.println("ai:          " + String.valueOf(aiBoard[0]) + " " + String.valueOf(aiBoard[1]) + " " + String.valueOf(aiBoard[2]) + " " + String.valueOf(aiBoard[3]) + " " + String.valueOf(aiBoard[4]) + " " + String.valueOf(aiBoard[5]) + " " + String.valueOf(aiBoard[6]));
  System.out.println("             " + String.valueOf(playerBoard[6]) + " " + String.valueOf(playerBoard[5]) + " " + String.valueOf(playerBoard[4]) + " " + String.valueOf(playerBoard[3]) + " " + String.valueOf(playerBoard[2]) + " " + String.valueOf(playerBoard[1]) + " " + String.valueOf(playerBoard[0]) + "    " + "player");
  System.out.println("             6 5 4 3 2 1      player position");
// display(example)
// ai poition:1 2 3 4 5 6
//         ai:4 4 4 4 4 4
//            4 4 4 4 4 4:player
//            6 5 4 3 2 1:player position
//  Mancala: ai= 0 player= 0
// last stone droped: ai position: 2
  System.out.println();
}//end board
}//end class
// variables: 2 arrays for players (ai and player)
// indeces are 0-6 (0 for each player is the mancala)
//initialize all except [0] to 4. (4 stones to start)
// main method to initiate game
// method for AI turn (random pick of pit)
// and method for player turn (solicit input for which pit you want to pick from)
// method for checking gameOver (when one side has no more stones - when sum of all indices not including mancala is 0, that equals empty)
// method for checking if last stone dropped in an empty pit on your side and the other side is not empty
// variable for what you first pick up(what will be subtracted and added to each index)
//we can just print the [0] index for each array for the score