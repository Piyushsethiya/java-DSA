import java.util.Scanner;

public class bit_manipulation {
    public static void main(String[] args) {
        
    // Get Bit Operation.
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        // if((bitMask & n) == 0 ){
        //     System.out.println("bit is Zero.");
        // } else {
        //     System.out.println("Bit is One");
        // }
    
    // Set Bit Operation

        // int set_res = bitMask | n;
        // System.out.println(set_res);

    // Clear Bit Operation

        // int not_bit = ~(bitMask);
        // int and_bit = not_bit & n;
        // System.out.println(and_bit); 
        
    // Update Bit Opertion
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();// update bit to 1 else update bit in 0
        if(oper == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else{
            int not_bit = ~(bitMask);
            int newNumber = not_bit & n;
            System.out.println(newNumber);
        }
    }
}
