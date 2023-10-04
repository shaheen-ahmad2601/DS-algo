package Arrays;

public class OccuranceCount {

    public static void countOccurrences(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);// storing char of string one by one in c variable.
            int count = 0;

            // Count the occurrences of the current character in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) { // comparing when this char is coming in string. and taking the count.
                    count++;
                }
            }

            System.out.println(c + "-" + count); // print char and count.
        }
    }

    public static void main(String[] args) {
        String str = "hellohellohithisis";
        countOccurrences(str);
    }
}
