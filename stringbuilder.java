// string are immutable

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("tony");
        // System.out.println(str);

        // set char At index - change the value of the index
        str.setCharAt(0, 'M');
        // System.out.println(str);

        // insert function - add value

        str.insert(0, '-');
        // System.out.println(str);

        // delete function

        str.delete(4, 5);
        str.delete(0, 1);
        // System.out.println(str);

        // append function- add the last index

        str.append("a");
        // System.out.println(str);

        // revesre the String
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            int front = i;
            int back = n-1-i;
            char front_value = str.charAt(front);
            char back_value = str.charAt(back);
            str.setCharAt(front, back_value);
            str.setCharAt(back, front_value);
        }
        System.out.println(str);
    }
}
