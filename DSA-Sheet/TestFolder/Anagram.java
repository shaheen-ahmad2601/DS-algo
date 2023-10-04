package TestFolder;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {

        str1.replaceAll("\\s", "").toLowerCase();
        str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        for (int i = 0; i < charArr1.length; i++) {
            if (charArr1[i] != charArr2[i]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str1 = "abdcae";
        String str2 = "bcadae";
        boolean res = isAnagram(str1, str2);
        System.out.println(res);

    }
}
