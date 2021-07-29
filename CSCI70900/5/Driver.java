//Julian, Jovani, Daiana

import java.io.*;
import java.util.*;

public class Driver {

  public static void main(String[] args) {

    //declare a var of appropriate type to assign an instance of Time to
    Time t;

    //assign var the address of a newly-apportioned Time object
    t = new Time(11,59,59.8);
    String s= time.toString();

    //above for printing or you can use below as well:
    String s= time.toString();


    Time time1 = new Time(9, 30, 0.0);
    Time time2 = time1;
    Time time3 = new Time(9, 30, 0.0);

    time1.equals(time3);
    
  }//end main()
   
 //"that" refers to time3 while "this" refers to time 1. "this" is a keyword, "that is a variable name"
  public boolean equals(Time that) {
        return this.hour == that.hour
            && this.minute == that.minute
            && this.second == that.second;
  }

// That’s all there is to it. Static methods and instance methods do the same thing, and you can convert from one to the other with just a few changes.

}//end class