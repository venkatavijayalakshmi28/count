import java.util.*;

public class sort6 {
    public static Scanner scn = new Scanner(System.in);

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int[] oddLeftEvenRyt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] *= -1;
            }
        }

        Arrays.sort(arr);

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] < 0) {
        // arr[i] *= -1;
        // }
        // }

        int idx = 0;
        while (arr[idx] < 0) {
            arr[idx] *= -1;
            idx++;
        }

        return arr;
    }


    public static void stateOfWakanda1(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i][j] + "\t");
                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void stateOfWakanda2(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void stateOfWakanda3(int[][] arr) { // diagonals of half matrix
        int n = arr.length, m = arr[0].length;
        for (int gap = 0; gap < m; gap++) {
            for (int i = 0, j = gap; i < n && j < m; i++, j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
     
    public static void stateOfWakanda5Spiral(int[][] arr) {
        int n = arr.length, m = arr[0].length, tnel = n * m;
        int rmin = 0, rmax = n - 1;
        int cmin = 0, cmax = m - 1;

        while (tnel > 0) {
            for (int r = rmin; r <= rmax && tnel > 0; r++) {
                System.out.print(arr[r][cmin] + " ");
                tnel--;
            }
            System.out.println();
            cmin++;

            for (int c = cmin; c <= cmax && tnel > 0; c++) {
                System.out.print(arr[rmax][c] + " ");
                tnel--;
            }
            System.out.println();
            rmax--;

            for (int r = rmax; r >= rmin && tnel > 0; r--) {
                System.out.print(arr[r][cmax] + " ");
                tnel--;
            }
            System.out.println();
            cmax--;

            for (int c = cmax; c >= cmin && tnel > 0; c--) {
                System.out.print(arr[rmin][c] + " ");
                tnel--;
            }
            System.out.println();
            rmin++;
        }

    }

    public static void main(String[] args) {
        display(oddLeftEvenRyt(input(scn.nextInt())));
    }
}

// 6 3 9 0 4 2 10 8 7
