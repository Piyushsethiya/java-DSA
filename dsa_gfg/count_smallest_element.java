// Given an array arr containing non-negative integers. Count and return an array ans where ans[i] denotes the number of smaller elements on right side of arr[i].

package dsa_gfg;

public class count_smallest_element {
    public static int[] constructLowerArray(int[] arr) {
        int[] temp = new int[arr.length];
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    count++;
                }
            }
            temp[i] = count;
            count = 0;
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(constructLowerArray(arr));
    }
}
