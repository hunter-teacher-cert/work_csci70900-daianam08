import java.io.*;
import java.util.*;

//populated characters of The Office

public class Qdriver{
  public static void main(String[]args){
    Node q= new Node("Michael S.");
    Node q2= new Node("Jim H.");
    q.setNext(q2);
    Node q3= new Node("Pam B.");
    q2.setNext(q3);

  System.out.println("---Test nodes---");
  System.out.println(q);
  System.out.println(q2);
  System.out.println(q3);

  System.out.println("---Test Queue---");
  Queue office= new Queue();
  System.out.println(office.isEmpty());
  office.enQueue("Angela M.");
  office.enQueue("Dwight S.");
  office.enQueue("Oscar N.");
  System.out.println(office.toStrings());
  System.out.println(office.size());
  System.out.println(office.isEmpty());
  System.out.println(office.front());
  System.out.println("---Test dequeue---");
  System.out.println(office.deQueue());
  System.out.println(office.toStrings());
  System.out.println(office.front());
  System.out.println(office.size());

  }//end main

}//end class