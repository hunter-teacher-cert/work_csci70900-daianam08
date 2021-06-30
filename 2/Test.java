import java.io.*;
import java.util.*;

public class Test{
public static void main (String[]args){
    int aiBoard[]={0,4,4,4,4,4,4};
    int playerBoard[]={0,4,4,4,4,4,4};
    System.out.println("Welcome to Mancala! Here is the board:");
    board(aiBoard,playerBoard);

  }//end main
public static int board(int []aiBoard, int [] playerBoard){
  System.out.println("ai position: 1 2 3 4 5 6");
  System.out.println("ai:"+ Arrays.toString(aiBoard));
  System.out.println("        ai:"+ Arrays.toString(aiBoard));
  System.out.println("             "+ Arrays.toString(playerBoard)+ "player");
  System.out.println("              1 2 3 4 5 6: player position");
// display(example) 
// ai poition:1 2 3 4 5 6
//         ai:4 4 4 4 4 4
//            4 4 4 4 4 4:player
//            6 5 4 3 2 1:player position
//  Mancala: ai= 0 player= 0
// last stone droped: ai position: 2
return aiBoard, playerBoard;
}//end board


}//end Test class