import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    Dllist office= new Dllist();
    
    System.out.println("--test is empty--");
    System.out.println(office.isEmpty());
    office.addFront("Michael S.");
    office.addBack("Stanley H.");
    System.out.println(office.isEmpty());
    System.out.println(office.toString());

    System.out.println("--test insert--");
    office.insert(1, "Jim H.");
    System.out.println(office.toString());
    System.out.println(office.length());

    System.out.println("--test gets/sets--");
    System.out.println(office.get(2));
    office.set(2, "Kevin M.");
    System.out.println(office.toString());
    //below gets previous item of index
    System.out.println(office.getPrevi(2));

    System.out.println("--test search--");
    System.out.println(office.search("Jim H."));
    System.out.println(office.search("Kelly K."));

    System.out.println("--test remove--");
    office.remove(1);
    System.out.println(office.toString());
    office.remove(5);


    }//end main
}//end driver class