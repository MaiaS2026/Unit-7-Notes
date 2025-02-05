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

      // .set(int index, obj) REPLACES element at that index with the new obj
      // returns the replaced element (same type as the list holds)
      String replacedElement = toBuy.set(0, "Mango");
      System.out.println(toBuy);
      // Often, you won't need to store the return output
      toBuy.set(2, "Rice");
      System.out.println(toBuy);

      // .remove(int index) DELETES element at that index
      // returns the removed obj (string)
      String removedElement = toBuy.remove(0);
      System.out.println(toBuy);
      System.out.println("Moved to shopping cart:" + removedElement);      
      // ALSO shifts all remaining elements to the left (lower index)
      // Often, you won't actaully need to store the removed item
      toBuy.remove(1);
      System.out.println(toBuy);

      // THING WE HAVE TO DO
      ArrayList<String> toDoList = new ArrayList<String>();
      toDoList.add(0, "Do homework");
      toDoList.add(1, "Help make dinner");
      toDoList.add(2, "Call grandpa");
      System.out.println("TO DO:" + toDoList);

      toDoList.set(1, "Order pizza");
      System.out.println(toDoList);

      System.out.println(toDoList.size() + " things left to do!");

      System.out.println(toDoList.get(0) + " is my biggest priority!");

      System.out.println(toDoList.remove(0));
      System.out.println(toDoList); 

      // 7.3 Traversing with Loops
      ArrayList<Integer> bingoNumbers = new ArrayList<Integer>();
      bingoNumbers.add(26);
      bingoNumbers.add(49);
      bingoNumbers.add(62);
      bingoNumbers.add(17);

      // ENHANCED FOR-EACH LOOP
      int total = 0;
      int product = 1;
      for (Integer num : bingoNumbers) {
         total = total + num; // same as total += num
         product *= num;
      }
      System.out.println("Sum of bingo numbers: " + total);
      System.out.println("Product of bingo numbers: " + product);

   }
}