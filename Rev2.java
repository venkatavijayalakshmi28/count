import java.util.*;

public class Rev2 {
    public static Scanner scn = new Scanner(System.in);

    public static void reverseOrder(int n) {
        while (n != 0) {
            int ans = n % 10;
            System.out.println(ans);
            n /= 10;
        }
    }

    public static int power(int n) {
        int pow = 1;
        while (n != 0) {
            n /= 10;
            pow *= 10;
        }
        return pow / 10;
    }

    public static void forwardOrder(int n) {
        int pow = power(n);
        while (n != 0) {
            int ans = n / pow;
            System.out.println(ans);
            n %= pow;
            pow /= 10;
        }
    }

    public static int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int rotateNumber(int n, int r) {
        int countDig = countDigit(n);
        r %= countDig;
        if (r < 0) {
            r += countDig;
        }
        int div = 1;
        int mul = 1;

        for (int i = 1; i <= countDig; i++) {
            if (i <= r) {
                div *= 10;
            } else {
                mul *= 10;
            }
        }
        int a = n % div;
        int b = n / div;

        return (a * mul + b);
    }

    public static void inverseOfNumbers(int n) {
        int inv = 0;
        int orgPos = 1;
        while (n != 0) {
            int orgDig = n % 10;
            int invDig = orgPos;
            int invPos = orgDig;

            inv += invDig * (int) Math.pow(10, invPos - 1);

            n /= 10;
            orgPos++;
        }
        System.out.println(inv);
    }

    public static void main(String[] args) {
        forwardOrder(scn.nextInt());
    }
}
