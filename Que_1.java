//Q1: Merge two arrays by satisfying given constraints
//Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
//merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

import java.util.*;

public class Que_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total size of array X (including vacant spaces):");
        int sizeX = sc.nextInt();
        System.out.println("Enter the number of non-vacant elements in array X:");
        int m = sc.nextInt(); 
        System.out.println("Enter the size of array Y:");
        int n = sc.nextInt(); 

        int[] X = new int[sizeX];
        int[] Y = new int[n];

        //input from array x
        System.out.println("Enter the elements of array X (use 0 for vacant spaces):");
        for (int i = 0; i < m; i++) { 
            X[i] = sc.nextInt();
        }

        // Input for elements of array Y
        System.out.println("Enter the elements of array Y:");
        for (int i = 0; i < n; i++) {
            Y[i] = sc.nextInt();
        }

        moveToEnd(X, m + n);
        merge(X, Y, m, n);

        System.out.println("Merged array:");
        for (int i = 0; i < sizeX; i++) {
            System.out.print(X[i] + " ");
        }
    }

    public static void moveToEnd(int[] X, int size) {
        int j = size - 1;
        for (int i = size - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[j] = X[i];
                if (j != i) {
                    X[i] = 0; 
                }
                j--;
            }
        }
    }

    public static void merge(int[] X, int[] Y, int m, int n) {
        int i = n; 
        int j = 0; 
        int k = 0; 

        while (j < n && i < m + n) {
            if (i >= m + n || Y[j] < X[i]) {
                X[k++] = Y[j++];
            } else {
                X[k++] = X[i++];
            }
        }

    }
}
