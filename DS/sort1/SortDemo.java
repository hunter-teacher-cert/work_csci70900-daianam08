import java.io.*;
import java.util.*;
/*
Setup:
 1.Make a folder under your work repo named: ds
 2. Make another folder under that named sort1
 3. Copy this file and SortDemoDriver.java into the ds/sort1 folder
Lab:
Part 1:
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortDemoDriver.java and SortDemo.java) and confirm
   the behavior of the constructors.
Part 2:
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortDemoDriver to test.
Part 3:
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortDemoDriver to test.
*/
//ArrayList is a built in class (we built superArray which is an example of an ArrayList) 
//with methods to add, remove, etc.
public class SortDemo{
    
  /* Instance Variables */
  private ArrayList<Integer> data;  // to store the data
  private Random r;
  
  //SortDemo default constructor
  //Generates and stores in an ArrayList 15 random integers that are between 0 and 19
  public SortDemo(){
    data = new ArrayList<Integer>();      
    r = new Random(); //r is a variable that will store a number of type "Random"
    
    for (int i=0;i<15;i++){ //generate 15 integers
        data.add(r.nextInt(20)); //generate a random number from 0-19
      }
  }
  
  //SortDemo constructor with parameters
  //Generates and stores in an ArrayList "size" number of random integers that are between 0 and 19
  public SortDemo(int size){
    data = new ArrayList<Integer>();
    r = new Random();
    
    for (int i=0;i<size;i++){
        data.add(r.nextInt(20));
      }
  }

  //get() method returns the value at a given index
  public int get(int index){
    return this.data.get(index);
  }

  /*
    return the index of the ArrayList data from index start to the end
    Example, if the arraylist has:
    5,3,10,6,8
    if start was 2 (start at index 2, value 10) then it woudl return 3 which is the index of the value
    6 which is the index with the smallest value from start to end
  */
  //What is the smallest value in this array and 
  //return the index of that value; 
  
  public int findSmallestIndex(int start){
    int smallIndex = start;
    int i; // start a variable at the one after start(which is why we added +1)
    
    // loop from that variable to end and update smallIndex as needed      
    for (i = smallIndex + 1; i < this.data.size(); i++){
      
      //compare value at smallIndex to current value
      //if the current value is smaller, store that value's index as the new smallIndex
      if (this.data.get(i) < this.data.get(smallIndex)){
        smallIndex = i;
      }
    } return smallIndex;
  }
  
  //sort() method calls SmallestIndex
  //For example, swap 5 and 3 but need to store 3 in integer temp
  public void sort(){

    int i;
    int temp; //Create a temp variable to store the value being swapped

    //Iterate through the data array to sort all values by swapping
    for (i = 0; i < data.size()-1; i++){
      int j = findSmallestIndex(i);  // find the smallest index from i to end(-1 because the end is already the largest)
      
      //Swap the item at that index and i
      temp=this.data.get(j);
      this.data.set(j,this.data.get(i));
      this.data.set(i,temp); 
    }
  }//sort end

  /* If you finish the lab early you can get started on this */
  public int linearSearch(int value){
    // loop through the ArrayList data
    // and if the value you're searchign for is in the ArrayList, return it.
    // return -1 if it isn't there.
    for (int i=0; i<data.size(); i++){
      if (value==data.get(i)){
        return value;
      } 
    } return -1; 
  }//linearSearch end
  
  /* If you finish the lab early you can get started on this */
  public int binarySearch(int value){
    boolean replacethiswithrealexpression=false;
    int lowerIndex = 0;
    int upperIndex = data.size();
    int middleIndex = data.size()/2;
    /* if upper crosses lower it's not there and the lop should exit the loop
      and if the item is at middle you should exit the loop
            you have to replace the "replacethiswithrealexpression" boolean
            with a correct expression based on lowerIndex and upperIndex
    */
    while (replacethiswithrealexpression) {
      // update lower and upper.
      // remember if value is less than data.get(middleIndex) you want to search next time
      // from lower to the middle and otherwise from the middle to the upper.
      //
      // then update middleIndex based on new lowerIndex and upperIndex.
      }
    /* replace this return to either return the value if it was found and -1
      if upperIndex and lowerIndex crossed
    */
    return 0; // replace this return
  }

  public String toString(){
    return ""+data;
  };

    /*------------------------- MERGESORT STUFF -----------------*/


    // Preconditions: a and b are ArrayLists of Integers and
    //                both are in increasing order
    // Return: a new ArrayList of Integers that is the result
    //         of merging a and b. The new ArrayList
    //         should be in increasing order

    //if next int array a < next int array b then place next int array a in array c.
    // if next int array b < next int array a then place next int array b in array c. 
    private ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
         {
          //add the lists
        ArrayList<Integer> c= new ArrayList<Integer>();

           int aIndex = 0;
	         int bIndex = 0;
          // int nextA = a.get(i);
          // int nextB = b.get(i);
/*
         for(int i=0; i<a.size(); i++){
          if(a.get(i) < b.get(i)){
            c.add(a.get(i));
          } 
          if(a.get(i) == b.get(i)){
            c.add(a.get(i));
            c.add(b.get(i));
          }
          if (a.get(i)>b.get(i)){
            c.add(b.get(i));
          } 
         }  
*/
while (aIndex < a.size() && bIndex < b.size()){
          if (a.get(aIndex) < b.get(bIndex)){
        c.add(a.get(aIndex));
        aIndex = aIndex + 1;
          } else {
        c.add(b.get(bIndex));
        bIndex = bIndex + 1;
          }
      }

      //  copy over anthing else
    // we know that either a or b will be finished
	 while (aIndex < a.size()){
	     c.add(a.get(aIndex));
	     aIndex = aIndex + 1;
	 }

	 while (bIndex < b.size()){
	     c.add(b.get(bIndex));
	     bIndex = bIndex + 1;
	 }
/*  
VERSION 2
  while (!a.isEmpty() && !b.isEmpty()){
	    if (a.get(0) < b.get(0)) {
      c.add(a.get(0));
      a.remove(0);
        } else {
		// remove also returns the value so we
		// don't really need the get we used above
		c.add(b.remove(0));
	    }

	}
// copy the rest once we're at the end of one of the lists
	while (!a.isEmpty()){
	    c.add(a.remove(0));
	}
	while (!b.isEmpty()){
	    c.add(b.remove(0));
	}
	
  */
	
	return c;
	}
    
    
    private ArrayList<Integer> fillForMerge(int size)
    {
      ArrayList<Integer> a = new ArrayList<Integer>();
      int lastVal = r.nextInt(10);
      for (int i = 0 ; i < size ; i=i+1)
        {
            a.add(lastVal);
            lastVal = lastVal + r.nextInt(10);
        }
        return a;

    }
    public void testMerge(){
      ArrayList<Integer> a = new ArrayList<Integer>();
      ArrayList<Integer> b = new ArrayList<Integer>();
  

      a = fillForMerge(10);
      b = fillForMerge(10);

      //result= merge(a,b);
      System.out.println(a);
      System.out.println(b);

     ArrayList<Integer> result = merge(a,b);
	System.out.println(result);
  
    }

  /*
  public static void mergeSort([] a, []b)
     {
       int bigList[];
       bigList= []a +[]b;

       if(current.length<2)
          return;
     }

     int mid =length/2;
     int left= new int[mid];
     int right= new int[length-mid];
     
     for(int i=0; int <mid; i++)
     {
       left[i]=current[i];
     }
    

  */

public ArrayList<Integer> msort(ArrayList<Integer> l){
	
	ArrayList<Integer> left = null;
	ArrayList<Integer> right = null;
  int length = l.size();
  if (length < 2){ 
    return l;
  }
 
	// base case - if the input ArrayList is smaller than 2 elements

  
// create arraylist sample: ArrayList<Integer> a = new ArrayList<Integer>();
	// split l into left and right halves
 int middle = length / 2 ;
 ArrayList<Integer> listLeft = new ArrayList<Integer>() ;
 ArrayList<Integer> listRight =new ArrayList<Integer>() ;
 for (int i = 0; i< middle; i++){
   listLeft.add(l.get(i)); //grabbing listLeft assigning utilizing l.get the index (i, x) and the values (l.get(i))
 }
  for (int i = middle; i < l.size(); i++){
    listRight.add(l.get(i));
  }

  listLeft = msort(listLeft);
  listRight = msort(listRight);

  l = merge(listLeft,listRight);

  return l;
	// sort the left half
//start at element 0 and go to mid; will not include middle

	// sort the right half
  //start at mid go to end of list; will include middle

	// merge the two halves that have been sorted

	// return the result
    }

    public void msortTest(){
	    data = msort(data);
    }

}