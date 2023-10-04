package LinearSearch;

public class FindChar {

    public static boolean search(String str, char target) {

        if (str.length() == 0) {
            return false;
        }
        str = str.replaceAll("\\s", "").toLowerCase();

        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == target) {
        // return true;
        // }
        // }
        // return false;

        for (char ch : str.toCharArray()) {
            if (ch == target)
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String name = "ahMad";
        char target = 'm';
        boolean result = search(name, target);
        System.out.println(result);
    }
}

// Q: find the character in the string, if found then return true else return
// false.