import java.util.Scanner;

public class exercisefun {
// Enter 3 numbers from the user & make a function to print their average.
    public static int average(int a, int b, int c) {
        int  av = (a+b+c)/3;
        return av;
    }

// Write a function to print the sum of all odd numbers from 1 to n.
// public static int oddsum(int n) {
//     int sum = 0;
//     for(int i=1; i<=n; i++){
//         if(i%2 == 1){
//             sum =+ i;
//         }
//         if (i==1) {
//             sum =+ 1;
//         }
//     }
//     return sum;
// }
// Write a function which takes in 2 numbers and returns the greater of those two.

// Write a function that takes in the radius as input and returns the circumference of a circle.

// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

// Write an infinite loop using do while condition.

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 

// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, n;

        // a = sc.nextInt();
        // b = sc.nextInt();
        // c = sc.nextInt();
        // System.out.println("The Average of 3 Number: " + average(a, b, c));
    
        n = sc.nextInt();
        System.out.println("Sum of All Odd numbers: " + oddsum(n));
    }
}
