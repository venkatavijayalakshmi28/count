import java.util.*;

public class len5 {
    public static Scanner scn = new Scanner(System.in);

    public static int[][] input(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void display(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int minimum(int[][] arr) {
        int minElem = (int) 1e9, row = arr.length, col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                minElem = Math.min(arr[i][j], minElem);
            }
        }
        return minElem;
    }

    public static int maximum(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int maxElem = -(int) 1e9;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                maxElem = Math.max(maxElem, arr[i][j]);
            }
        }
        return maxElem;
    }


    public static void findDataInMattrix(int[][] arr, int data) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (data == arr[i][j]) {
                    System.out.println("(" + i + " , " + j + ")");
                }
            }
        }
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
    public static void main(String[] args) {
        stateOfWakanda1(input(scn.nextInt(), scn.nextInt()));
    }
}


// input = [6, 3, 9, 0, 4, 2, 10, 8, 7]

// output = [9, 7, 3, 0, 2, 4, 6, 8, 10]
