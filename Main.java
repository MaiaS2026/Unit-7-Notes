// Import the ArrayList CLASS
// (from the java.util PACKAGE)
import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      // DECLARE and ArrayList object
      // <Type> is required, each ArrayList can hold one type of object
      ArrayList<String> buzzwords;  

      // DECLARE & CREATE an ArrayList
      // by calling the CONSTRUCTOR
      ArrayList<String> shoppingList = new ArrayList<String>();

      // ArrayLists can ONLY STORE OBJECTS!!!
      // for int and double (primitive types),
      // you must use their WRAPPER CLASSES
      ArrayList<Integer> ages = new ArrayList<Integer>();
      ArrayList<Double> testScores = new ArrayList<Double>();
      // Java will handle the "wrapping" for you, 
      // this is called AUTOBOXING

      // Use the .add (obj) METHOD to populate/fill list
      testScores.add(93.00); // double gets wrapped into Double
      System.out.println(testScores); // prints [93.0]

      // 7.2: ArrayList METHODS
      // after "new", make call to the CONSTRUCTOR
      ArrayList<String> toBuy = new ArrayList<String>();

      // .add(obj) appends obj to END OF LIST
      toBuy.add("Coffee");
      toBuy.add("Pasta");
      toBuy.add("Cheese");
      toBuy.add("Tru Fru");
      System.out.println("SHOPPING LIST: ");
      System.out.println(toBuy);

      // .size() returns int -> number of items
      System.out.println(toBuy.size() + " things left to buy!");

      // .add(int index, obj) -> "INSERT" at index 
      toBuy.add(0, "Ice Cream");
      System.out.println(toBuy);
      // ALSO shifts over elements from that index on

      // .get(int index) returns an object of the same type as the list holds 
      // like array [int index]
      int lastIndex = toBuy.size() - 1;
      String lastElement = toBuy.get(lastIndex);
      System.out.println(lastElement);
      System.out.println(toBuy.get(3));

   }
}