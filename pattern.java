import java.util.*;

public class pattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // *****
    // *****
    // *****
    // *****
    // int c = n+1;
    // for (int i = 1; i <= n; i++) {
    //   for (int j = 1; j <= c; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // *****
    // *   *
    // *   *
    // *****
    // int m = n+1;
    // for( int i = 1; i<=n; i++){
    //     for (int j = 1; j<=m; j++){
    //         if(i == 1 || j == 1 || i == n || j == m){
    //             System.out.print("*");
    //         }
    //         else {
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }

    // *
    // **
    // ***
    // ****
    // for(int i=1; i<=n; i++){
    //     for(int j = 1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // ****
    // ***
    // **
    // *
    // for(int i=1; i<=n; i++){
    //     for(int j=n; j>=i; j--){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //     *
    //    **
    //   ***
    //  ****
    // for(int i= 1; i<=n; i++ ){
    //     for(int j=1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }
    //     for (int k = 1; k<=i ; k++){
    //         System.out.print("*");
    //     }
    //     System.out.println("");
    // }

    // 1
    // 12
    // 123
    // 1234
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    // 12345
    // 1234
    // 123
    // 12
    // 1
    // for(int i=1; i<=n; i++){
    //     for(int j=i; j<=n; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    // 1
    // 12
    // 123
    // 1234
    // 12345
    // int num = 1;
    // for(int i=0; i<=n; i++){
    //     for(int j=0 ; j<= i; j++){
    //         System.out.print(num);
    //         num+=1;
    //     }
    //     // i += 1;
    //     System.out.println();
    // }
  }
}
