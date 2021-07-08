import java.io.*;
import java.util.*;

public class Test{
public static void main (String[]args){
    int aiBoard[]={0,4,4,4,4,4,4};
    int playerBoard[]={4,4,4,4,4,4,0};
    System.out.println("Welcome to Mancala! Here is the board:");
    board(aiBoard,playerBoard);

  }//end main
public static void board(int [] ai, int [] player){
  System.out.println(" ai position: 1, 2, 3, 4, 5, 6");
  System.out.println("       ai:"+ Arrays.toString(ai));
  System.out.println("             "+ Arrays.toString(player)+ " player");
  System.out.println("              1, 2, 3, 4, 5, 6: player position");
  System.out.println("Mancala: ai="+ai[0]+", player="+player[6]);
// display(example) 
// ai poition:1 2 3 4 5 6
//         ai:4 4 4 4 4 4
//            4 4 4 4 4 4:player
//            6 5 4 3 2 1:player position
//  Mancala: ai= 0 player= 0
// last stone droped: ai position: 2
}//end board


}//end Test class