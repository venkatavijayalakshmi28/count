import java.util.*;
public class count9{
    public static Scanner scn = new Scanner(System.in);

    public static void stringCompression(String str){
        int n = str.length(), i = 1;
        String ans = str.charAt(0) + "";
        while(i < n) {
            while(i < n && ans.charAt(ans.length()-1) == str.charAt(i)) {
                i++;
            }
            if (i < n) {
                ans += str.charAt(i);
                i++;
            }
        }
        System.out.print(ans);
    }

    public static void stringCompressionCounts(String str){
        int n = str.length(), i = 1, count = 0;
        String ans = str.charAt(0) + "";
        while(i < n) {
            count = 1;
            while(i < n && ans.charAt(ans.length()-1) == str.charAt(i)) {
                i++;
                count++;
            }

            if (count >= 1) {
                ans = ans + ":" + count + "\n";
            }
            if (i < n) {
                ans += str.charAt(i);
            }
            i++;
        }
        System.out.print(ans);
    }
    public static void main(String[] args){
        stringCompressionCounts(scn.nextLine());
    }
}
