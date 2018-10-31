public class HelloWorld {
  public static void main(String[] args) {
     int[] numbers = {2, 3};

     if (numbers[1] > numbers[0]) {
       System.out.println(numbers[1] + " is greater than " + numbers[0]);
     } else if (numbers[0] == numbers [1]) {
       System.out.println("Both numbers are set to " + numbers[0]);
     } else {
       System.out.println(numbers[0] + " is greater than " + numbers[1]);
     }
  }
}
