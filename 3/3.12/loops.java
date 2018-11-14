import java.util.*;

public class HelloWorld {
  public static void main(String[] args) {

    //First 10 multiples of 3
    /*
    int x = 1;

    while (x <= 10) {
      System.out.println(x * 3);
      x++;
    }
    */

    //First 10 triangle numbers
    /*
      for (int y = 1; y <= 10; y++) {
        int total = 0;
        for (int z = 1; z <=y ; z++) {
          total += z;
      }
      System.out.println(total);
    }
    */

    //String[] people = {"Frank", "Joan", "Matt", "Barbara", "Barry"};

    List<String> people = new ArrayList<String>();

    people.add("Frank");
    people.add("Joan");
    people.add("Matt");
    people.add("Barbara");
    people.add("Barry");

    for (String person : people) {
      System.out.println(person);
    }

  }
}
