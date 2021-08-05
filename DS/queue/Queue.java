import java.io.*;
import java.util.*;

//gotta fix deQueue. queueing works but when i dequeue it returns 0 as size. maybe enqueue is not adding anything??


public class Queue{
  private Node front;
  private Node end;
  int count=0;

  public Queue(){
    front= null;
    end= null;
  }//end queue constructor

  public void addFront(String value){
    Node newNode = new Node(value);
    if (front==null){
      front=newNode;
    } else {
  Node currNode= new Node();
  currNode.setData(front.getData());
	newNode.setNext(currNode);
	front = newNode;
  }
    }//end addfront

  public void enQueue(String value){
    Node newNode = new Node(value);
    if (front==null){
      front= newNode;
      count++;
      return;
    } else if(end==null){
      end= newNode;
      front.setNext(end);
      count++;
      return;
    } else if (end!=null){
      count++;
      Node container= end;
      container.setNext(newNode);
      end= newNode;
    }
  }//end enqueue(val)

  public String deQueue(){
    Node currNode=front;
    if(front==null && end==null){
      return null;//empty queue
    }
    count--;
    Node tempNode=new Node(front.getData());
    Node nextNode= front.getNext();
    Node nextNext= nextNode.getNext();
    front=nextNode;
    front.setNext(nextNext);
    return tempNode.getData();
  }//end dequeue

public String toStrings(){
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

    }


  public String front(){
    return front.getData();
  }//end get front

  public boolean isEmpty(){
    return front==null;
  }//end isempty

  public int size(){
    // Node currNode= front;
    // int size=0;
    // // if (end==null){
    // //   return -1;
    // // }
    // while (currNode!=null){
    //   currNode=currNode.getNext();
    //   size=size+1;
    // }
    return count;
  }//end size

}//end class