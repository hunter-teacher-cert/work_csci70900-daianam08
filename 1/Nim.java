import java.io.*;
import java.util.*;

// https://github.com/hunter-teacher-cert/work_csci70900-mrbombmusic/blob/master/1/Nim.java completed code
//game seems to work but cannot figure out how to subtract ai and player from bag :( this version gives current stones =0 every time

public class Nim{
public static void main(String[] args){
  int bag=12;
  int turn = 0;
  boolean gameOn=false;
  Scanner game= new Scanner(System.in);
  if (gameOn==false){
  System.out.println("Enter 0 to start the game!");
  bag=12;
  turn=0;
  }
int begin= game.nextInt();
  if (begin==0){
    gameOn=true;
  }
  if (gameOn==true){
  while (bag>0){
    if (turn % 2 == 0){
      System.out.println("Turn:  Player");
      // int playerHand;
      // playerHand=playerRound(bag);
      bag=bag-playerRound(bag);
      System.out.println("Current Stones: "+ bag);
      turn+=1;
    } else {
      System.out.println("Turn:  AI");
      // int aiHand;
      // aiHand=aiRound(bag);
      bag= bag-aiRound(bag);
      System.out.println("Current Stones: "+ bag);
      turn+=1;
    }//else
  }
  if (bag==0){
      if (turn % 2 ==0){
      System.out.println("The AI won.  Sorry- try again!");
      gameOn=false;
    } else {
      System.out.println("You win!");
      gameOn=false;
    } //else
  } 
} //end if gameOn
} //end main

public static int playerRound(int pbag){
  Scanner in = new Scanner(System.in);
  if (pbag>3){
  System.out.println("Pull 1, 2, or 3 stones: ");
  int youPull = in.nextInt();
  if (youPull<=0 || youPull>3){
  System.out.println("Hey no cheating! Only pull 1, 2, or 3 stones: ");
  youPull = in.nextInt();
  } else {
  System.out.println("You pulled "+youPull+".");
  youPull=pbag;
  } return pbag;
  } else if(pbag>2){
    System.out.println("Pull 1 or 2 stones: ");
    int youPull = in.nextInt();
    if (youPull<=0 || youPull>2){
    System.out.println("Hey no cheating! Only pull 1 or 2 stones: ");
    youPull = in.nextInt();
    } else {
  System.out.println("You pulled "+youPull+".");
    youPull=pbag;
  } return pbag;
  } else if(pbag==1){
    System.out.println("Pull the last stone! ");
    int youPull = in.nextInt();
    if (youPull<=0 || youPull>2){
    System.out.println("Hey! Pull only 1:");
    youPull = in.nextInt();
    } else {
    System.out.println("You pulled "+youPull+".");
    youPull=pbag;
  } 
}  return pbag;//else if 1
} //end player

public static int aiRound(int abag){
  if (abag>3){
  int rn = (int) (Math.random() * 3 + 1);
  System.out.println("AI pulled "+ rn+ " stones!");
  rn=abag;
  } else if (abag==2){
    int rn2 = (int) (Math.random() * 2 + 1);
    System.out.println("AI pulled "+ rn2+ " stones!");
    rn2=abag;
  } else if (abag==1){
    abag-=1;
  } return abag;
} //end ai

} //end of class



