package zLeetCode.Integer;

// import java.util.HashSet;
// import java.util.Set;

public class SingleNumber {
    public static int findNumber(int[] nums){
        // Optimised approach, using xor operator.
        int ans = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            ans = ans ^ nums[i];
        }return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 1, 2, 1 };4
        int res = findNumber(nums);
        System.out.println(res);
    }
}

/*
 * => // Brute force approach TC- O(n) , SC - O(n);
 * => // Optimised approach TC- O(n) , SC - O(1); constant space.
 * public static int findNumber(int[] nums) {
 * if (nums.length == 1) {
 * return nums[0];
 * }
 * 
 * Set<Integer> set = new HashSet<>();
 * 
 * for (int num : nums) {
 * if (set.contains(num)) {
 * set.remove(num);
 * } else {
 * set.add(num);
 * }
 * }
 * return set.iterator().next();
 * }
 */

/*
 * Q: Single number
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 * 
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 * 
 * Input: nums = [1]
 * Output: 1
 */