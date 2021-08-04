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
      count++;
      return;
    } else if(end==null){
      end= newNode;
      count++;
      return;
    } else if (end!=null){
      end.setNext(newNode);
      end=newNode;
      count++;
    // Node currNode=new Node();
    // currNode.setData(end.getData());
    // end= newNode;
    // currNode.setNext(end);
    }
  }//end enqueue(val)

  public String deQueue(){
    Node currNode=front;
    if( front==null && end==null){
      return null;//empty queue
    }
    count--;
    Node tempNode=new Node();
    front=tempNode;
    currNode=front;
    // temp=x, x=y, y=temp
    // front=currNode.getNext();
    return front.getData();
    // Node currNode=new Node();
    // Node nextNode= new Node();
    // nextNode=front.getNext();
    // currNode.setData(nextNode.getData());
    // front=currNode;
    // count--;
    // return front.getData();
  }//end dequeue

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