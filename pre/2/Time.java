import java.io.*;
import java.util.*;

public class Time{
	public static void main (String [] args){
	double hour= 3;
	double min= 27;
	double seconds= 45;
	double timeSinceMidnight= (hour * 3600)+(min*60)+seconds;
	System.out.println (timeSinceMidnight + "seconds since midnight");
	double timeUntilMidnight= (24*60*60) - timeSinceMidnight;
	System.out.println(timeUntilMidnight+ "seconds until midnight");
	double percentTimePassed= (timeSinceMidnight/timeUntilMidnight);
	System.out.println(percentTimePassed + "percentage of time passed");

	hour=8;
	min=47;
	seconds=36;
	System.out.println("About " + (((hour*3600)+(min*60)+seconds)-timeSinceMidnight) + " seconds has passed since I started this lab") ;

	}
}