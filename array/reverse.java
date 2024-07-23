// write-a-program-to-reverse-an-array-or-string

package array;
import java.util.Scanner;

public class reverse {
  public static int[] reverse_arr(int[] arr) {
    int[] rev_arr = new int[arr.length];

    for (int index = 0; index < arr.length; index++) {
      rev_arr[index] = arr[arr.length - index - 1];
    }
    return rev_arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of array: ");
    int len = sc.nextInt();
    int[] arr = new int[len];
    for(int index = 0; index<len; index++){
      arr[index] = sc.nextInt();
    }
    for (int number : reverse_arr(arr)) {
      System.out.print(number+ ", ");
    }
  }
}
