import java.io.*;
import java.util.*;

//gotta fix deQueue. queueing works but when i dequeue it returns 0 as size. maybe enqueue is not adding anything??


public class Queue{
  private Node front;
  private Node end;

  public Queue(){
    front= null;
    end=null;
  }//end queue constructor

  // public void addFront(String value){
  //   Node newNode = new Node(value);
  //   if (front==null){
  //     front=newNode;
  //   } else {
  // Node currNode= new Node();
  // currNode.setData(front.getData());
	// newNode.setNext(currNode);
	// front = newNode;
  // }
    //}//end addfront

  public void enQueue(String value){
    Node newNode = new Node(value);
    if (front==null){
      front= newNode;
    } else if(end==null){
      end= newNode;
    } else if (end!=null){
      end.setNext(newNode);
      end=newNode;
    // Node currNode=new Node();
    // currNode.setData(end.getData());
    // end= newNode;
    // currNode.setNext(end);
    }
  }//end enqueue(val)

  public String deQueue(){
    if(end==null){
      return end.getData();//empty queue
    }
    Node currNode= front.getNext();
    front=currNode;
    return front.getData();
  }//end dequeue

  public String front(){
    return front.getData();
  }//end get front

  public boolean isEmpty(){
    return front==null;
  }//end isempty

  public int size(){
    Node currNode= front;
    int size=0;
    // if (end==null){
    //   return -1;
    // }
    while (currNode!=null){
      currNode=currNode.getNext();
      size=size+1;
    }
    return size;
  }//end size

}//end class