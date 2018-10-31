import java.util.*;

public class HelloWorld {
  public static void main(String[] args) {

    Map map = new HashMap();

    map.put("firstName", "Dean");
    map.put("lastName", "Webb");

    map.remove("lastName");

    System.out.println(map.size());

  }
}
