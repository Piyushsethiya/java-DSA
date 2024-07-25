import java.util.*;

public class function {

  public static void print_name(String name) {
    System.out.println("My name is " + name);
    return;
  }

  // Make a multiply and return there product
  public static int multiply(int a, int b) {
    int product = a * b;
    return product;
  }

  // find factorial of 2 no.
  public static int factorial(int n) {
    int fact = 1;
    if (n == 0) {
      return 1;
    } else {
      for (int i = 1; i <= n; i++) {
        fact = fact * i;
      }
      return fact;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // String name = sc.next();
    // print_name(name);

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // System.out.println("Total Number: " + multiply(a, b));

    int n = sc.nextInt();
    System.out.println("Total Number of factorial: " + factorial(n));
  }
}
