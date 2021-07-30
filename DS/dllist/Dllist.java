import java.io.*;
import java.util.*;


public class Dllist{
    private Node front; // the front of the list
    public  Dllist(){
	    front = null;
    }

    // Add a new node containing data
    // at the front of the list
    public void addFront(String data){
	// make the new node
	    Node newNode = new Node(data);
	// point it to what front points to
	    newNode.setNext(front);
	// point front to the new node
	    front = newNode;
    }//end addfront

    public String toString(){
      Node currentNode;
      currentNode = front;
      String result = "";
      while (currentNode != null){
        result = result + currentNode + "->";
        // this is like i=i+1 is for arrays
        // but for linked lists 
        currentNode = currentNode.getNext();
       }
      result = result + "null";
      return result;
    }//end tostring

    // returns True if there is nothing in the list
    // False otherwise
    public boolean isEmpty(){
	return front==null; // could also return !front
    }//end isempty

    // returns the number of items in the list
    // Hint: look at the toString
    // to remind you how to traverse down the list
    public int length(){
      Node currentNode = front;
      int count = 0;
      while (currentNode != null){
        count = count + 1;
        currentNode = currentNode.getNext();
      }
      return count;
    }//end length

    // returns the item at location index;
    // returns null if there aren't enough
    // items. Starts with index 0
    public String get(int index){
      Node currentNode=front;
      int i=0;
      while(currentNode!= null){
        if(i==index){
          return currentNode.getData();
        } 
         i++;
        currentNode=currentNode.getNext();
      } 
       return null;
     }//end get
      

    // sets the item at location index (starting
    // with 0) to value.
    // only sets if the index is within range
    public void set(int index, String value){
      int count = 0;
      Node currentNode = front;
      while (currentNode != null && count != index){
        currentNode = currentNode.getNext();
        count = count + 1;
      }
      // once there, set the new data
      if (currentNode != null){
        currentNode.setData(value);
      }
    }//end set

    // insert an item before index.
    // only inserts if the index is within bounds
    // Hint: look at toString for hints on
    // traversal and draw out a diagram.
    // You will need a variable that refers to
    // the node BEFORE you want to do the insertion.

    public void insert(int index, String value){
      
      
    }

    // returns the index of the first item with
    // data value key. Returns -1 if not found

  //   public int search(String key){
	// return -1;	
  //   }

    // removes the node at index.
    // does nothing if index out of bounds

    // public void remove(int index){
	//}

      }//end class
