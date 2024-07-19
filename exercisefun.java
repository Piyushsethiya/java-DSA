import java.util.Scanner;

public class exercisefun {

  // Enter 3 numbers from the user & make a function to print their average.
  public static int average(int a, int b, int c) {
    int av = (a + b + c) / 3;
    return av;
  }

  // Write a function to print the sum of all odd numbers from 1 to n.
  public static int oddsum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        sum = sum + i;
      }
    }
    return sum;
  }

  // Write a function which takes in 2 numbers and returns the greater of those two.
  public static int getgreater(int a, int b) {
    if (a < b) {
      return b;
    } else {
      return a;
    }
  }

  // Write a function that takes in the radius as input and returns the circumference of a circle.
  public static double circumference_circle(double r) {
    double formula = 2 * 3.14 * r;
    return formula;
  }

  // Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
  public static int checking_vote(int age) {
    if (age < 18) {
      return 0;
    } else {
      return 1;
    }
  }

  // Write an infinite loop using do while condition.

  // Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
  public static int[] check_count(int n) {
    Scanner sc = new Scanner(System.in);
    int p = 0, ne = 0, z = 0;
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] < 0) {
        ne++;
      } else if (arr[i] > 0) {
        p++;
      } else {
        z++;
      }
    }
    sc.close();
    int[] res = new int[3];
    res[0] = p;
    res[1] = ne;
    res[2] = z;
    return res;
  }

  // Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

  public static int powerofnumber(int x, int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= x;
    }
    return result;
  }

  // Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
  public static int greatest_divisor(int a, int b) {
    if (b == 0) {
      return a;
    }
    while (b != 0) {
      int temp = a % b;
      a = b; ;
      b = temp;
    }
    return a;
  }

  // Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 .....
  public static int[] Fibonacci(int n) {
    int[] res = new int[n];
    int pos = 0;
    res[0] = pos;
    // pos
    for (int i = 1; i <= n; i++) {
      // res[i] = pos + 
      res[i + 1] = res[i] + i;
      // pos  pos;
    }
    // System.out.println(res);
    return res;
  }

  // In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it. (BONUS)

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, n;

    // a = sc.nextInt();
    // b = sc.nextInt();
    // c = sc.nextInt();
    // System.out.println("The Average of 3 Number: " + average(a, b, c));

    // n = sc.nextInt();
    // System.out.println("Sum of All Odd numbers: " + oddsum(n));

    // a = sc.nextInt();
    // b = sc.nextInt();
    // System.out.println("the greater of those two is: " + getgreater(a, b));

    // double r = sc.nextInt();
    // System.out.println("The Circumference of a Circle is: " + circumference_circle(r));

    // n = sc.nextInt();
    // if(checking_vote(n) == 0){
    //     System.out.println("It is not Eligible for Vote.");
    // } else{
    //     System.out.println("It is Eligible for Vote.");
    // }

    // System.out.print("Enter the Number: " );
    // n = sc.nextInt();
    // int[] count = check_count(n);
    // System.out.println("Count of Positive Number: " + count[0]);
    // System.out.println("Count of Negative Number: " + count[1]);
    // System.out.println("Count of Zeroes: " + count[2]);

    // int x = sc.nextInt();
    // n = sc.nextInt();
    // System.out.println("Power of "+x+"^"+n+": " + powerofnumber(x, n));

    // System.out.print("Enter the first Number: " );
    // a = sc.nextInt();
    // System.out.print("Enter the second Number: " );
    // b = sc.nextInt();
    // System.out.println("Common Greatest Divisor is: " + greatest_divisor(a, b));

    n = sc.nextInt();
    System.out.println(Fibonacci(n));
  }
}
