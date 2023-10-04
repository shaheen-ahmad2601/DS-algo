package Arrays;

public class Palindrome {

    public static boolean checkPalindrome(int num) {
        // String str = String.valueOf(num); // to convert into string
        // String str = Integer.toString(num); // to convert into string
        String str = "" + num; // to convert into string
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        int num = 12321;
        boolean res = checkPalindrome(num);
        System.out.println(res);
    }
}
