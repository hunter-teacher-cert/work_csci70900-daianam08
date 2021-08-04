import java.io.*;
import java.util.*;

public class Node {
  private String data;
  private Node next;

  public Node(){
    data= "";
    next= null;//next is node! remember that!
  }//end constructor Node

  public Node(String value){
    data= value;
    next= null;
  }//end node(x) constructor

  public Node(String value, Node next){
    data= value;
    this.next= next;
  }//end node(x,next) constructor

  public void setData(String value){
    data= value;
  }//end setData

  public void setNext(Node n){
    next= n;
  }//end setnext

  public String getData(){
    return data;
  }//end getdata

  public Node getNext(){
    return next;
  }//end getnext (node)

  public String toString(){
    return data;
  }//end to string

}//end class