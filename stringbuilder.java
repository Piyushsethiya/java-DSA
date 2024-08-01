// string are immutable

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("tony");
        System.out.println(str);         

    // set char At index - change the value of the index
        str.setCharAt(0, 'M');
        System.out.println(str);         
        
    //insert function - add value

        str.insert(0, '-');
        System.out.println(str);
        
    // delete function

        str.delete(4, 5);
        System.out.println(str);

    // append function- add the last index
        
        str.append("a");
        System.out.println(str);

    // revesre the String
        for(int i = 0; i<=str.length(); i++){
            if(str.length() / 2 == 1){
                
            }
        }
    }
}
