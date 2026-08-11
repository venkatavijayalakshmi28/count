import java.util.Scanner;

public class NumberSystem4 {
    public static Scanner scn = new Scanner(System.in);

    public static int numFrequency(int n, int data) {
        int count = 0;

        while (n > 0) {
            int lastDig = n % 10;
            if (lastDig == data) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void numFrequencyQueries(long n, int[] query) {
        int count = 0;
        int[] ans = new int[10];
        while (n != 0) {
            long d = n % 10;
            n /= 10;
            ans[(int) d]++;
        }

        for (int q : query) {
            System.out.println(q + " : " + ans[q]);
        }
    }

    public static int pow(int n) {
        int pwr = 1;
        while (n != 0) {
            n /= 10;
            pwr *= 10;
        }
        return pwr;
    }

    public static int decimalToBinary(int n) {
        int ans = 0;
        int pow = 1;
        while (n != 0) {
            int rem = n % 2;
            n /= 2;
            ans += rem * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int binaryToDecimal(int n) {
        int pwr = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans += rem * pwr;
            pwr *= 2;
            n /= 10;
        }
        return ans;

    }

    public static int decimalToAnyBase(int n, int base) {
        int pwr = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % base;
            ans += rem * pwr;
            n /= base;
            pwr *= 10;
        }
        return ans;
    }

    public static int anyBaseToDecimal(int n, int base) {
        int pwr = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans += rem * pwr;
            n /= 10;
            pwr *= base;
        }
        return ans;
    }

    public static int anyBaseToAnyBase(int n, int b1, int b2) {
        return decimalToAnyBase(anyBaseToDecimal(n, b1), b2);
    }

    public static int anyBaseAddition(int n, int m, int base) {
        int pwr = 1;
        int ans = 0, carry = 0;
        while(n != 0 || m != 0 || carry != 0) {
            int sum = carry + (n % 10) + (m % 10);
            n /= 10;
            m /= 10;

            int ansLastDig = sum % base;
            carry = sum / base;

            ans += ansLastDig * pwr;
            pwr *= 10;
        }
        return ans;
    }


    public static int anyBaseSub(int n, int m, int base) {
        int pwr = 1;
        int ans = 0, borrow = 0; 
        while (n != 0) { 
            int diff = borrow + (n % 10) - (m % 10);
            n /= 10;
            m /= 10;

            if(diff < 0) {
                borrow = -1;
                diff += base;
            }
            else {
                borrow = 0;
            }

            ans += diff * pwr;
            pwr *= 10;

        }
        return ans;
    }


    public static void main(String[] args) {
        // int[] query = new int[scn.nextInt()];
        // for (int i = 0; i < query.length; i++) {
        // query[i] = scn.nextInt();
        // }
        // numFrequencyQueries(scn.nextLong(), query);

        System.out.print(anyBaseSub(scn.nextInt(), scn.nextInt(), scn.nextInt()));
    }
}
