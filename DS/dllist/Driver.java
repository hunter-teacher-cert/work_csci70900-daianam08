import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    Dllist office= new Dllist();
    
    System.out.println(office.isEmpty());
    office.addFront("Michael S.");
    office.addBack("Stanley H.");
    System.out.println(office.isEmpty());
    System.out.println(office.toString());

    office.insert(1, "Jim H.");
    System.out.println(office.toString());
    System.out.println(office.length());








    }//end main
}//end driver class