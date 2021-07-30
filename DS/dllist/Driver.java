import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	    Node n;
      n = new Node();
      n.setData("Eduardo");
      
      Node n2 = new Node("Brian");
      n.setNext(n2);
      n2.setPrev(n);

      Node n3 = new Node("Daiana");
      n3.setPrev(n2);
      n2.setNext(n3);

      Node n4 = new Node("Steph");
      n4.setPrev(n3);
      n3.setNext(n4);

      System.out.println("---Print List---");
      System.out.println(n);
      System.out.println(n2);
      System.out.println(n3);
      System.out.println(n4);
      
      System.out.println("---getNext---");
      System.out.println(n.getNext());
      n.getNext().setNext(new Node("Tiff"));
      System.out.println(n2.getNext());
      System.out.println(n.getNext().getNext());

      System.out.println("---Print New List---");
      System.out.println(n);
      System.out.println(n2);
      System.out.println(n3);
      System.out.println(n4);
      
	// 1.Create a new  list that looks like:
	//   L->"a"->"b"->"c"->"d"
	// 2. Write the code to insert an "x"
	//    between the b and the c
	// 3. Write the code to delete the c


	//1
	Node L;
	Node a = new Node("a");
	Node b = new Node("b");
	Node c = new Node("c");
	Node d = new Node("d");
	Node e = new Node("e");

	L=a;
	a.setNext(b);
	b.setNext(c);
  b.setPrev(a);
	c.setNext(d);
  c.setPrev(b);
	d.setNext(e);
  d.setPrev(c);
  e.setPrev(d);
	System.out.println();
	System.out.println("Part 1:");
	// remember not to lose the head / start
	// of the list - make a copy
	Node currentNode;
	currentNode = L;
	while (currentNode != null){
	    System.out.print(currentNode+"->");
	    // this is like i=i+1 is for arrays
	    // but for linked lists 
	    currentNode = currentNode.getNext();
	}
	System.out.println("null");

	//2
	Node x = new Node("X");
	x.setNext(c);
	b.setNext(x);
	System.out.println("Part 2:");
	currentNode = L;
	while (currentNode != null){
	    System.out.print(currentNode+"->");
	    // this is like i=i+1 is for arrays
	    // but for linked lists 
	    currentNode = currentNode.getNext();
	}
	System.out.println("null");

	//3
	b.setNext(d);
	currentNode = L;
	while (currentNode != null){
	    System.out.print(currentNode+"->");
	    // this is like i=i+1 is for arrays
	    // but for linked lists 
	    currentNode = currentNode.getNext();
	}
	System.out.println("null");

	/* Or:
	   L = new Node("a");
	   L.setNext(new Node("B"));
	   L.getNext().setNext(new Node("C"));
	   L.getNext().getNext().setNext(new Node("D"));
	   etc
	*/

	System.out.println("\n");
	System.out.println("Dllist");
	System.out.println("-----------");
	
	Dllist dl = new Dllist();
	System.out.println(dl);
	
	dl.addFront("a");
	System.out.println(dl);

		
	dl.addFront("b");
	System.out.println(dl);

	dl.addFront("c");
	System.out.println(dl);

  System.out.println(dl.get(2));
  
    }//end main
}//end driver class