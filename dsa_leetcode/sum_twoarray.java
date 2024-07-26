// package dsa_leetcode;
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// package dsa_leetcode;

public class sum_twoarray {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int arr = nums[i] + nums[j];
                if (arr == target) {
                    sum[0] = j;
                    sum[1] = i;
                    break;
                    // return sum;
                }
            }
        }
        return sum;
        // return sum;
    }

    public static void main(String[] args) {
        sum_twoarray ls = new sum_twoarray();
        int[] num = { 2, 7, 11, 15 };
        int target = 9;
        for (int number : ls.twoSum(num, target)) {
            System.out.print(number+ ", ");
        }
    }
}
