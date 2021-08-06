import java.io.*;
import java.util.*;


public class Dllist{
    private Node front; // the front of the list
    private Node back;
    public  Dllist(){
	    front = null;
      back = null;
    }

    // Add a new node containing data
    // at the front of the list
    public void addFront(String data){
	// make the new node
  	  Node newNode = new Node(data);
      if (front==null){
        front= newNode;
        return;
      }
      Node currNode= front;
	// point it to what front points to
	    newNode.setNext(currNode);
	    newNode.setPrev(null);
	// point front to the new node
	    front = newNode;
    }//end addfront

    public void addBack(String data){
      Node newNode= new Node(data);
      if(front.getNext()==null){
        front.setNext(newNode);
        newNode.setPrev(front);
        return;
      }
      Node currNode= front;
      while (currNode!=null){
      currNode=currNode.getNext();
      }
      back.setNext(newNode);
    } //end add back

    public String toString(){
      Node currentNode;
      currentNode = front;
      Node backNode =back;
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
       return null;//index is empty?
     }//end get
      
    public String getPrevi(int index){
      Node currentNode=front;
      int i=0;
      while(currentNode!= null && i!=index){
         i++;
        currentNode=currentNode.getNext();
      } 
       Node prevN=currentNode.getPrev();
          return prevN.getData();
      //  return null;//index is empty?
     }//end get
      


    // sets the item at location index (starting
    // with 0) to value.
    // only sets if the index is within range
    public void set(int index, String value){
      int count = 0;
      Node currentNode = front;
      Node newNode= new Node(value);
      if (currentNode==null){
        currentNode=newNode;
        currentNode.setNext(back);
        return;
      }
      while (currentNode != null && count != index){
        currentNode = currentNode.getNext();
        count = count + 1;
      }
      // once there, set the new data
      if (currentNode != null){
        currentNode.setData(newNode.getData());
      }
    }//end set

    // insert an item before index.
    // only inserts if the index is within bounds
    // Hint: look at toString for hints on
    // traversal and draw out a diagram.
    // You will need a variable that refers to
    // the node BEFORE you want to do the insertion.


    public void insert(int index, String value){
      int count=0;
      Node newNode= new Node(value);
      Node currNode= front;
      Node inPrev= new Node();
      if (index==0){
        Node nextN=front.getNext();
        inPrev= front.getPrev();
        newNode=front;
        front.setNext(nextN);
        front.setPrev(inPrev);
        return;
      }
      while (currNode!=null && count!=index){
        count=count+1;
        currNode=currNode.getNext();
      }
      // if (currNode==null){
      //   Node currData= new Node(currNode.getData());
      //   currData.setNext(currNode.getNext());
      //   currData.setPrev(currNode.getPrev());
      //   currNode=newNode;
      //   currNode.setNext(currData.getNext());
      //   currNode.setPrev(currData.getPrev());
      //   return;
      // }
      if (count==index){
        newNode.setPrev(currNode.getPrev());
        newNode.setNext(currNode);
        currNode.getPrev().setNext(newNode);
        currNode.setPrev(newNode);
      }
    }//end insert

    // returns the index of the first item with
    // data value key. Returns -1 if not found

  public int search(String key){
	 Node currNode=front;
   Node search= new Node(key);
   int count=0;
   while(currNode!= null){
     if(currNode.getData()==search.getData()){
return count;
    }
     currNode=currNode.getNext();
     count++;
}
return -1;
     }//end search


    // removes the node at index.
    // does nothing if index out of bounds

  public void remove(int index){
      Node currNode=front;
      int counter=0;
      while(currNode!=null){
        if (counter==index){
        Node nextN= currNode.getNext();
        Node prevN= currNode.getPrev();
        Node nextNextN= nextN.getNext();
        currNode=nextN;
        currNode.setNext(nextNextN);
        currNode.setPrev(prevN);
        prevN.setNext(currNode);
        if (nextNextN!=null){
        nextNextN.setPrev(currNode);
        }
        return;
      }
        counter++;
        currNode= currNode.getNext();
      }
    return;
	}//end remove

      }//end class
