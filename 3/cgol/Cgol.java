//Group members:  Alex Moore, Diana, Eduardo
//Comments:  Making fine progress - everything pretty intuitive so far.  We took some time to understand the Game of Life before diving into coding.
/*List of variables
r/c are row and col

Note:  X is life, [blank] is no life
*/

import java.io.*;
import java.util.*;

/**
   The Rules of Life:
   Survivals:
   * A cell with 2 or 3 living neighbours will survive for the next generation.
   
   Death:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   
   Birth:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation
*/

public class CGOL
{

  //initialize empty board (all cells dead)
  public static char[][] createNewBoard(int rows, int cols) {

   
  char [][] newBoard=new char[rows][cols];


return newBoard;
  }


  //print the board to the terminal
  public static void printBoard(char[][] board) {
  

  for (int i=0;i<board.length;i++)
  {
    for (int j=0;j<board[0].length;j++)
    {
      System.out.print("["+board[i][j]+"]");

    } //for int j
System.out.println();
  };//for int i
  }//printBoard


  //set cell (r,c) to val
  public static void setCell(char[][] board, int r, int c, char val){

board[r][c]=val;

  }


  //return number of living neigbours of board[r][c]
  //row and col

  //Checks the board and square passed in (x=r, y=c) to count the number of neighbors.  Uses a nested for loop that goes from -1 to 0 to 1 to check the spaces around the square

  //Possible issue:  array out of bounds if by the edge - may need to modify later
  public static int countNeighbours(char[][] board, int r, int c) {

int totalNeighbors=0;

if(r>0 && c>0)
{
if (board[r-1][c-1]=='X')
totalNeighbors++;
};


if(r>0)
{
if (board[r-1][c]=='X')
totalNeighbors++;
};


if (r>0 && c<24)
{
if (board[r-1][c+1]=='X')
totalNeighbors++;
};

if (c>0)
{
if (board[r][c-1]=='X')
totalNeighbors++;
};

if (c<24)
{
if (board[r][c+1]=='X')
totalNeighbors++;
};

if (c>0 && r<24)
{
if (board[r+1][c-1]=='X')
totalNeighbors++;
};

if (r<24)
{
if (board[r+1][c]=='X')
totalNeighbors++;
};

if (r<24 && c<24)
{
if (board[r+1][c+1]=='X')
totalNeighbors++;
};

return totalNeighbors;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell(char[][] board,int r, int c) {
    if (countNeighbours(board, r, c)==2
 || countNeighbours(board, r, c)==3)
return 'X';
//else return '\0';
else return '\0';

//board [5][10] has an X but should be blank - why?

/*
System.out.println("Cell " + r+ "," + c+" has this # of neighbors: "+countNeighbours(board,r,c));
return '\0';
*/
//

  }


  //generate new board representing next generation
  public static char[][] generateNextBoard(char[][] board) {
    
char[][] nextGenBoard=new char[25][25];

for (int i=0;i<25;i++)
for (int j=0;j<25;j++)
{
//possible that we need to make a new board?

nextGenBoard[i][j]=
getNextGenCell(board,i,j);

}

return nextGenBoard;
  }


  public static void main( String[] args ){

    /*
    int sampleNumber=5;
    int sampleLetter=(char) sampleNumber;
    System.out.println("Sample number converted to a character is "+ sampleLetter);
    */
    char[][] board;
    board = createNewBoard(25,25);

//temporary - for testing purposes - then delete
/*
    printBoard(board);
System.out.println(countNeighbours(board,5,5));
*/
     //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//breathe life into some cells:
    setCell(board, 10, 4, 'X');
    setCell(board, 10, 5, 'X');
    setCell(board, 10, 6, 'X');

    setCell(board, 15, 12, 'X');
    setCell(board, 16, 12, 'X');
    setCell(board, 17, 12, 'X');
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
//    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  }//end main()

}//end class
/**
   DEMO
   animation in the terminal
   USAGE:
   Make this file your own, and comment liberally as you explore...
   Read for understanding.
   Skim over delay(). Focus on animate() and main().
   Jot down / discuss predictions of what you will see when you run it.
   Run.
   Reconcile expectation with observation.
 */


/*
public class Animate
{

  // pause for n milliseconds
  public static void delay(int n) {
    try {
      Thread.sleep(n);
    }
    catch(InterruptedException e) {}
  }


  // "repaint" by using an ANSI control character to
  // repeatedly place the cursor at the origin (upper left)
  public static void animate(int n) {
    //clear screen, place cursor at origin (upper left)
    System.out.print("[0;0H\n");

    System.out.println("we are aaanimaniacs " + n);

    // After you have predicted/observed/reconciled
    // behavior of the preceding line,
    // comment it out,
    // uncomment the for loop below, and
    // re-apply your process.

    /*
    for( int i=n; i > 0; i-- ) {
      System.out.println("we are aaanimaniacs " + i);
    }
    

    delay(1000);
  }


  // run 20 frames of animation
  public static void main( String[] args ) {

    for (int frame = 0; frame < 20; frame++) {
      animate(frame);
    }

  }//end main()
*/
//}//end class