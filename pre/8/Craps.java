import java.io.*;
import java.util.*;


public class Craps{
  public static void main(String[]args){
    // part 1
    Scanner inr = new Scanner(System.in);
    System.out.println("To roll, gimme a number of rounds to play: ");
    int rollNum= inr.nextInt();
    int scoreR=0;
    int finalScore=0;
    for (int i=1; i<rollNum; i++){
     System.out.println("Round "+ i);
      scoreR=round();
      if (scoreR==0){
        System.out.println("round lost");
      }else{
        finalScore++;
        System.out.println("round won");
      }
    }
  System.out.println("You won "+ finalScore + " times out of "+ rollNum +" rounds!");
  } //main

  
  public static int roll(int rolled){
    Random roller= new Random();
    int numb= roller.nextInt(rolled)+1;
    return numb;
    } //roll DONE

  public static int shoot(int dice, int maxValDice){
    int total=0;
    for (int i=0; i<dice; i++){
      total+=roll(maxValDice);
    }
    return total;
    } //shoot DONE

//fix all of it
  public static int round(){
    Random diceRoll= new Random();
    int diceNumb = (int)Math.floor(Math.random()*(12-2+1)+2);
    int point=0;
    int score=0;
    int scoreWL=0;
    if (diceNumb== 2 || diceNumb== 3 || diceNumb== 12){
      System.out.println("You rolled "+diceNumb+"!");
      System.out.println("Craps! You lose!");
      scoreWL=winLose(score);
    } else if (diceNumb== 7|| diceNumb== 11){
      System.out.println("You rolled "+diceNumb+"!");
      System.out.println("Natural! You win!");
      score++;
      scoreWL=winLose(score);
    } else {
      System.out.println("You rolled "+diceNumb+"!");
      point=diceNumb;
      System.out.println("Next round!");
      diceNumb = (int)Math.floor(Math.random()*(12-2+1)+2);
    // diceNumb = diceRoll.current().nextInt(2,12+1);
      if (diceNumb==point){
        System.out.println("You rolled your number again! You win!");
        score++;
      scoreWL=winLose(score);
      } else if (diceNumb==7){
        System.out.println("Oof, you rolled a 7. You lose!");
      scoreWL=winLose(score);
      } else {
        System.out.println("You didn't roll your number again. You lose!");
      scoreWL=winLose(score);
      }//else
    }//else
    if (scoreWL==0){
      return 0;
    } else {
       return 1;
    }
  } //round

  public static int winLose(int score){
    if (score==0){
      return 0;
    } else if (score==1) {
      return 1;
    } else {
      return 2;
    }
  }//end winLose

} //end of class