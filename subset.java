import java.util.*;

public class subset {
    public static void findSubset(String str, String ans, int i) {
        // base class
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        // recursion
        // yes choice
        findSubset(str, ans + str.charAt(i), i + 1);
        // no choice
        findSubset(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, " ", 0);
    }
}