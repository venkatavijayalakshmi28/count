import java.util.*;

public class Num1 {
    public static Scanner scn = new Scanner(System.in);

    public static void fiboPattern(int n) {
        int a = 0, b = 1, temp = 0;
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= row; i++) {
                System.out.print(a + "\t");
                temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println();
        }
    }

    public static boolean pythagoreanTriplet(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        if (max == a && b * b + c * c == a * a) {
            return true;
        } else if (max == b && a * a + c * c == b * b) {
            return true;
        } else if (max == c && b * b + a * a == c * c) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean pythagoreanTriplet2(int a, int b, int c) {
        return ((b * b + c * c == a * a) || (a * a + c * c == b * b) || (b * b + a * a == c * c));
    }

    public static int pow(int n) {
        int pwr = 1;
        while (n != 0) {
            n /= 10;
            pwr *= 10;
        }
        return pwr;
    }

    public static void digitsInForward(int n) {
        int pow = pow(n);
        pow /= 10;
        while (pow > 0) {
            int quo = n / pow;
            n %= pow;
            pow /= 10;
            System.out.println(quo);
        }
    }

    public static boolean checkPrime(int n) {
        boolean res = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i != 0) {
                res = true;
            } else {
                return false;
            }
        }
        return res;
    }

    public static void isaPrimeNum(int n) {
        boolean res = checkPrime(n);
        if (res == true) {
            System.out.println("It is prime number.");
        } else {
            System.out.println("It is not prime number.");
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

    public static void benjaminBulb(int n) {
        for (int i = 1; i*i <= n; i++) {
            System.out.println(i*i);
        }
    }

    public static void inverseOfNumber(int n) {
        int inv = 0;
        int orgPos = 1;
        while(n != 0) {
            int orgDig = n % 10;
            int invDig = orgPos;
            int invPos = orgDig;

            inv += invDig * (int)Math.pow(10, invPos - 1);

            n /= 10;
            orgPos++;
        }
        System.out.println(inv);
    }

    public static void main(String[] args) {
        // System.out.println(rotateNumber(scn.nextInt(), scn.nextInt()));
        inverseOfNumber(scn.nextInt());
    }
}
