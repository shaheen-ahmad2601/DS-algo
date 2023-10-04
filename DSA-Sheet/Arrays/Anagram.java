package Arrays;

import java.util.Arrays;

public class Anagram {

    public static boolean checkAnagram(String str1, String str2) {

        // Remove whitespace and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // check if the length is equal or not.
        if (str1.length() != str2.length()) {
            return false;
        }

        // convert Arrays to charactrerArrays.
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        // sort the array.
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        // now check if th char of str1 and str2 are equal or not.
        for (int i = 0; i < charArr1.length; i++) {
            if (charArr1[i] != charArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "acbDaeb";
        String str2 = "adcabeb";
        boolean res = checkAnagram(str1, str2);
        System.out.println(res);

    }
}

/*
 * Changed the method signature to accept two String parameters instead of
 * arrays of strings.
 * Converted the input strings str1 and str2 into character arrays using
 * toCharArray().
 * Sorted the character arrays using Arrays.sort().
 * Compared the sorted character arrays element by element to check if they are
 * equal.
 * Now, the code will correctly check if str1 and str2 are anagrams of each
 * other.
 * 
 * 
 * "\\s" is a regular expression that represents whitespace characters.
 * Specifically, "\\s" matches any whitespace character, including spaces, tabs,
 * and newline characters. The replaceAll method is used to replace all
 * occurrences of the matched pattern with an empty string, effectively removing
 * all whitespace characters from the string str1.
 */