import java.util.*;

class test {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Create a Scanner object
    // int age = sc.nextInt();
    // if(age >18){
    //     System.out.println("You are Adult");
    // }
    // else {
    //     System.out.println("You are children");
    // }
    // int num = sc.nextInt();
    // if (num % 2 == 1) {
    //     System.out.println("Number is Odd.");
    // }
    // else {
    //     System.out.println("Number is Even.");
    // }

    // int btn = sc.nextInt();
    // if(btn == 1){
    //     System.out.println("hello ");
    // } else if(btn == 2) {
    //     System.out.println("namastre");
    // } else if(btn == 3){
    //     System.out.println("bonjour"); 
    // } else {
    //     System.out.println("Invalid button5");
    // }

    // switch (btn) {
    //     case 1:
    //         System.out.println("Hello");
    //         break;
    //     case 2:
    //         System.out.println("namastre");
    //         break;
    //     case 3:
    //     System.out.println("bonjour");
    //         break;
    //     default:
    //     System.out.println("Invalid Button");
    //         break;
    // }


    // Sum of first n natural number

    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i<=n; i++){
        sum = sum + i;
    }    
    System.out.println(sum);


    
  }
}
