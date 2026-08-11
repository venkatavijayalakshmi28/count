import java.util.*;

public class palindrome8 {
    public static Scanner scn = new Scanner(System.in);

    public static boolean palindromeString(String str, int si, int ei) {
        boolean isPalindrome = false;
        while (si < ei) {
            if (str.charAt(si) == str.charAt(ei)) {
                isPalindrome = true;
            }
            si++;
            ei--;
        }
        return isPalindrome;
    }

    public static void printAllPalindromicSubstring(String str) {
        for (int i = 0; i< str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (palindromeString(str, i, j)) {
                    String subStr = str.substring(i, j+1);
                    System.out.print(subStr);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println(palindromeString(scn.nextLine()));
    }
}
