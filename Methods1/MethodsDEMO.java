//HW Lesson 2-annotated code for a lesson

import java.io.*;
import java.util.*;

public class MethodsDEMO{
  public static void main(String[] args){
   System.out.println(isDivisible()); //use this to test our code! comment out when working on the stuff below.

    //after setting up isDivisible, do the following on your own:
    //What happens when isDivisible is false? How should you set up your conditional?
    if(isDivisible()== true) {
      System.out.println("These numbers are divisible.");
    } else {
      System.out.println("These numbers are not divisible.");
    }
  }//end main

//we will be using user input to practice using Scanner.
//review with students how to find out if something is divisible by another number(gives remainder of 0 when divided. reminder of the use of "/" vs "%" !!!)
  public static boolean isDivisible () {
    System.out.print("Is this divisible? Enter a big number: ");//this line will be given

    //who can walk me through Scanner?
    Scanner in= new Scanner(System.in);
    int n = in.nextInt();
    //remember to store in(your input) into a new variable to be used later

    System.out.print("Enter smaller number: ");//this line will be given

    //PAUSE
    //do we need to redo Scanner? what does in.nextInt() do?
    //how do we store our next value?
    int m = in.nextInt();

    //PAUSE. Let's put this all together:
    //How do we use the inputs to figure out if the numbers are divisible?
    //When should we return true/false?
    //***reminder of the use of "/" vs "%" !!!*** SUPER IMPORTANT
    if (n%m == 0){//use divide on purpose, maybe even use println to see what happens and why it is wrong
    return true;
    } else {
      return false;
    }
  //once we know the answer returns true or false, we can manipulate that data back in main!

  }//end isDivisible

}//end Methods class