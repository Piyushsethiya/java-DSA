package array;

import java.util.Scanner;

public class min_max {

  public static int find_min(int[] arr) {
    int min = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < i) {
        min = arr[i];
      }
    }
    return min;
  }

  public static int find_max(int[] arr) {
    int max = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > i) {
        max = arr[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of array: ");
    int len = sc.nextInt();
    int[] arr = new int[len];
    for (int index = 0; index < len; index++) {
      arr[index] = sc.nextInt();
    }
    System.out.println("The Minimum Number is: " + find_min(arr));
    System.out.println("The Maximum Number is: " + find_max(arr));
  }
}
