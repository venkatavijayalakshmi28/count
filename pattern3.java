import java.util.*;

public class pattern3 {
    public static Scanner scn = new Scanner(System.in);

    public static void diamondOfSpaces(int n) {
        int nsp = 1;
        int nst = n / 2;
        for (int row = 1; row <= n; row++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            for (int csp = 1; csp < nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (row <= n / 2) {
                nsp += 2;
                nst--;
            } else {
                nst++;
                nsp -= 2;
            }
            System.out.println("\t");
        }
    }

    public static void diamondOfSpaces2(int n) {
        int nst = (n / 2) + 1;
        int nsp = 1;
        for (int row = 1; row <= n; row++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (row <= (n / 2)) {
                nsp += 2;
                nst--;
            } else {
                nsp -= 2;
                nst++;
            }
            System.out.println("\t");
        }
    }

    public static void HollowSandTimer(int n) {
        int nst = n; // number of columns
        int nsp = 0; // leading spaces

        for (int row = 1; row <= n; row++) {
            // print leading spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            // print stars and inner spaces
            for (int col = 1; col <= nst; col++) {
                if (row == 1 || row == n || col == 1 || col == nst) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            // update values
            if (row <= n / 2) {
                nsp += 1;
                nst -= 2;
            } else {
                nsp -= 1;
                nst += 2;
            }
        }
    }

    public static void arrow(int n) {
        int nsp = n / 2;
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++) {
                if (row == (n / 2) + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }

            if (row <= n / 2) {
                nst++;
            } else {
                nst--;
            }
            System.out.println("\t");
        }
    }

    public static void nFactorialTillN(int n) {
        // n = 5
        // 1
        // 5 25
        // 125 625 3125
        // 15625 78125 390625 1953125
        // 9765625 48828125 244140625 1220703125 1808548329

        int nst = 1, a = 1;
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= nst; i++) {
                System.out.print(a + "\t");
                int product = a * n;
                a = product;
            }
            nst++;
            System.out.println();
        }

    }

    public static void wPattern(int n) {
        int nst = n;
        for (int row = 1; row <= n; row++) {

            for (int cst = 1; cst <= nst; cst++) {
                if (cst == 1 || cst == n) {
                    System.out.print("*\t");
                }

                else if (row > (n / 2) && (row == cst || row + cst == n + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("\t");
        }
    }

    public static void numberDiamond(int n) {
        int nsp = n / 2;
        int nsd = 1;

        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            int val = row;
            if (row > (n / 2) + 1) {
                val = n - row + 1;
            }
            for (int csd = 1; csd <= nsd; csd++) {
                System.out.print(val + "\t");
                if (csd <= nsd / 2) {
                    val++;
                } else {
                    val--;
                }
            }

            if (row <= n / 2) {
                nsd += 2;
                nsp--;
            } else {
                nsd -= 2;
                nsp++;
            }

            System.out.println("\t");
        }
    }

    public static void numPattern4(int n) {
        int nsp = n - 1;
        int nst = 1;
        // int val = row;

        for (int row = 1; row <= n; row++) {

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            int val = row;

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + "\t");
                if (cst <= nst / 2) {
                    val++;
                } else {
                    val--;
                }
            }
            nsp--;
            nst += 2;
            System.out.println("\t");

        }
    }

    public static void numW(int n) {
        int nst = 1;
        int nsp = ((2 * n) - 3);
        for (int row = 1; row <= n; row++) {
            int val = 1;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val++ + "\t");
            }

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                if (row == n && cst == 1) {
                    val--;
                    continue;
                }
                System.out.print(--val + "\t");
            }

            nst++;
            nsp -= 2;
            System.out.println();
        }
    }

    public static void binomialPattern(int num) {
        // formulae - nCr+1 = ((n - r) * nCr / (r + 1))

        for (int n = 0; n < num; n++) {
            int nCr = 1; // as we know 1st column in each row contains 1 as a digit
            for (int r = 0; r <= n; r++) {
                System.out.print(nCr + "\t");
                int nCr1 = ((n - r) * nCr) / (r + 1);
                nCr = nCr1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        binomialPattern(scn.nextInt());
    }
}
