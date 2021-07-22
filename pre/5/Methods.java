import java.io.*;
import java.util.*;

public class Methods{
  public static void main(String[] args){
    System.out.println(isDivisible());
    System.out.println(isTriangle());
    Scanner ackCheck= new Scanner(System.in);

    System.out.print("Ack function! Enter first integer: ");
    int m= ackCheck.nextInt();
    System.out.print("Enter second integer: ");
    int n= ackCheck.nextInt();
    System.out.println(ack(m,n));
  }//end main

  public static boolean isDivisible () {
    Scanner in= new Scanner(System.in);
    System.out.print("Is this divisible? Enter one number: ");
    int n = in.nextInt();
    System.out.print("Enter another number: ");
    int m = in.nextInt();
    if (n%m == 0){
    return true;
    } else {
      return false;
    }
  }//end divisible

  public static boolean isTriangle(){
    Scanner tri= new Scanner(System.in);
    System.out.print("Is this a triangle? Enter one side: ");
    int a= tri.nextInt();
    System.out.print("Enter the second side: ");
    int b= tri.nextInt();
    System.out.print("Enter the last side: ");
    int c= tri.nextInt();
    if (a+b<c){
      return false;
    } else if (a+c<b){
      return false;
    } else if(b+c<a){
      return false;
    } else{
      return true;
    }
  }//end triangle

  public static int ack(int m, int n){
  if (m==0){
    return n+1;
  } else if(m>0 && n==0){
    return ack(m-1,1);
  } else if (m>0 && n>0){
    return ack(m-1, ack(m, n-1));
  } else{
    return 0;
  }
}//end ack
}//end class