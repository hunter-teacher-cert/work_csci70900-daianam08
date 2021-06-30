import java.io.*;
import java.util.Scanner;

//Exercise 2   Write a program that converts a temperature from
//Celsius to Fahrenheit. It should (1) prompt the user for input,
//(2) read a double value from the keyboard, (3) calculate the result,
//and (4) format the output to one decimal place.
//For example, it should display "24.0 C = 75.2 F".
//f=c*(9/5)+32

public class Q2 {
	public static void main(String[] argss){
    double celsius;
	  Scanner in = new Scanner(System.in);
  
	System.out.println("Enter number for Celsius for Farenheit conversion");
	celsius = in.nextDouble();
  final double CONVERT= (celsius * 9/5)+32;
	System.out.printf("%.1f C = %.1f F ", celsius, CONVERT);
	}
}