import java.util.Scanner;

public class twodarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();

    int[][] num = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        num[i][j] = sc.nextInt();
      }
    }

// print data from array

    // for (int i = 0; i < row; i++) {
    //     for (int j = 0; j < col; j++) {
    //         System.out.print(num[i][j] + " ");
    //     }
    //     System.out.println();
    // }

// search data from array
    System.out.print("Enter The Number to Find: ");
    int x = sc.nextInt();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (num[i][j] == x){
            System.out.println("The Given Number is found");
            System.out.println("The Location of Given Number is ("+i+", "+j+")");
        } 
      }
    }
    // System.out.println("The given number is not found.");
  }
}
