import java.io.*;
import java.util.*;

public class Loops{
  public static void main(String[]args){
    System.out.println(ex3(2,3));
    System.out.println(ex4(7));
    System.out.println(myexp(1,1));
    check(1);
    for (double i=0.1; i<=100.0; i*=10){
      check(i);
    }
    for (double i=-0.1; i>=-100.0; i*=10){
      check(i);
    }
  }
// exercise 3 power
    public static double ex3(double x, int n){
      double ans=1;
      for (int i=0; i<n; i++){
      ans*=x;
      }
      return ans;
    }
// exercise 4 factorial method
    public static int ex4(int n){
      int ans=1;
      while(n>0){
        ans*=n;
        n=n-1;
      }
      return ans;
    }
// exercise 5
    public static double myexp(double x, int n){
      double ans=0;
      int i=0;
      while(i<=n){
       ans=ans+ex3(x,i)/ex4(i);
       i++;
      }
      return ans;
    }

    public static void check(double x){
      System.out.println(x +"\t"+ myexp(x,24) + "\t"+ Math.exp(x));
    }
}
