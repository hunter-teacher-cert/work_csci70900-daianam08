//Assignment given to students
import java.io.*;
import java.util.*;

/*
Below is some code that calculates the difference between your age and the moon landing in 1969. Only 5 common errors were included, but you must find at least 3. Work with a partner. To debug:
1. Read through the code. Find bugs you know how to solve. Comment where you think things will go wrong.
2. Run the code.
3. Check for errors in the shell/console.
4. Find and fix the errors in the code.

If you're stuck, don't forget to:
1. Use your notes
2. Ask a neighbor
3. Then ask the teacher
*/

public class Debug{
  public static void main{
    System.out.println("How long had it been since the USA went to the moon by the time you were born? Enter your age below:");
    Scanner in= new Scanner(System.in);
    int age= age.nextInt();
    System.out.println(difference(age) " years passed between the moon landing and the year you were born!");

  }//end main

  public static void difference(int age){
    int moon= 1969;
    int today= 2021;
    int diff= (today-age)-moon;
    return moon;
  }

}//end Debug Class