import java.io.*;
import java.util.*;

public class Arrays{
  public static void main(String[]args){
    double [] a = {10.0, 30.0, 5.0, 12.0} ;
    double [] b= powArray(a,3);
    int [] scores= {2,5,5,3,1};
    int [] hist= histogram(scores,5);
    // for (double x: hist){
    //   System.out.println(x);
    // }
    int max= indexOfMax(scores);
    System.out.println(max);
}

// q1, part 1
public static double[] powArray(double[] a, double b){
  double [] sqr=new double [a.length];
    for (int i=0; i<a.length; i++){
      sqr[i]=Math.pow(a[i],b);
    } return sqr;
  } 

 //q1, part 2 
public static int[] histogram(int [] scores, int count){
  int[] hist=new int [count+1];
  for (int score : scores){
    hist[score]++;
  } return hist;
}

// q4
public static int indexOfMax(int [] abc){
  int maxv=abc[0];
  int finalMax;
  int maxI=0;
  for (int i=1; i<abc.length; i++){
    if (abc[i]>maxv){
      maxv=abc[i];
      maxI=i;
    }
  } 
  return maxI;
};
// cant use enhanced for loop 


// public static int[] sieve(int n){

// }

} //end of class 
