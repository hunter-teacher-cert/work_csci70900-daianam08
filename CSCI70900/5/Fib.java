import java.io.*;
import java.util.*;

public class Fib{
  public static void main (String[] args){
  System.out.println(fib(0));
   System.out.println(fib(1));
    System.out.println(fib(2));
  
  }

    public static int fib (int a){
    if (a==0){
      return 0;
    }
    else if (a ==1 || a ==2){
      return 1;
    } else {
      return fib(a-1)+ fib(a-2);
  }
  }

  public static int fib(int a){
    for (int i=3; i<a; i=8){

    }
  }

}//end class Fib