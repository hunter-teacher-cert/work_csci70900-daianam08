//the reading is confusing and does not indicate where certain things should go. getting a bunch of errors

import java.io.*;
import java.util.*;

public class Time {
  // your implementation of class Time here

  //private intance variables can only be accessed inside this class! will generate error if another class references it
  private int hour;
  private int minute;
  private double second;

public Time(){
  //this is called a constructor, ommits static, and is used to initialize instance variable like the ones above. returns nothing
  this.hour=0;
  this.minute=0;
  this.second=0.0;
  //"this" is used to refer to the object we are creating
}//end time contructor

public Time(int hour, int minute, double second){
//value constructor. both this one and the previous one can exist because when referenced, java will know which to choose
this.hour=hour;
this.minute=minute;
this.second=second;
//"this" helps disinguish the variables from the parameters in this case.
}//end time value constructor

}//end class

public class TimeClient{
  public static void main (String[]args){
    Time time = new Time (10, 02, 53.2);
    //cant do system.out.println(time.hour), will give compiler error because of the private class. need to write a method
  }

public static void printTime(Time t){
  System.out.print(t.hour);
  System.out.print(":");
  System.out.println(t.minute);
  System.out.print(":");
  System.out.println(t.second);
//you can write it like this as well:
// System.out.printf("%02d:%02d:%04.1f\n",
 //  t.hour, t.minute, t.second);
//02 means total 2 width, leading zeros if needed
//04.1 means same plus one digit after the zero
}

//not a static method, so this is an instance method: invoked only on the intance of the class. String.format return a formatted tring rather than displaying it.
public String toString(){
  return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
}

//will need to use "getter" methods(below) to access the private classes
public int getHour(){
  return this.hour;
}
public int getMinute(){
  return this.minute;
}
public int getSecond(){
  return this.second;
}

//if we want to modify the info, we gotta use "setters", also called mutators
public void setMinute(int minute){
  this.minute=minute;
}
public void setHour(int hour){
  this.hour=hour;
}
public void setSecond(int second){
  this.second=second;
}

// This implementation of add does not modify either of the parameters. Instead, it creates and returns a new Time object.
public Time add(Time t2) {
    Time sum = new Time();
    sum.hour = this.hour + t2.hour;
    sum.minute = this.minute + t2.minute;
    sum.second = this.second + t2.second;

    if (sum.second >= 60.0) {
        sum.second -= 60.0;
        sum.minute += 1;
    }
    if (sum.minute >= 60) {
        sum.minute -= 60;
        sum.hour += 1;
    }
    return sum;
}



}//end class timeclient