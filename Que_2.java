//Q2:Find maximum sum path involving elements of given arrays
//Given two sorted arrays of integers, find a maximum sum path involving elements of both arrays whose sum is maximum. 
//We can start from either array, but we can switch between arrays only through its common elements.
import java.util.*;

public class Que_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for array X
        System.out.println("Enter the size of array X:");
        int sizeX = sc.nextInt();
        int[] X = new int[sizeX];
        System.out.println("Enter the elements of array X:");
        for (int i = 0; i < sizeX; i++) {
            X[i] = sc.nextInt();
        }

        // Input for array Y
        System.out.println("Enter the size of array Y:");
        int sizeY = sc.nextInt();
        int[] Y = new int[sizeY];
        System.out.println("Enter the elements of array Y:");
        for (int i = 0; i < sizeY; i++) {
            Y[i] = sc.nextInt();
        }

        // Calculate the maximum sum path
        int maximumSum = maxSumPath(X, Y);
        System.out.println("The maximum sum path is: " + maximumSum);
    }

    public static int maxSumPath(int[] X, int[] Y) {
        int sumX = 0, sumY = 0;
        int result = 0, i = 0, j = 0;

        while (i < X.length && j < Y.length) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            } else if (X[i] > Y[j]) {
                sumY += Y[j++];
            } else {
                result += Math.max(sumX, sumY) + X[i];
                sumX = sumY = 0; 
                i++; j++;
            }
        }

        // Add remaining elements of X[]
        while (i < X.length) {
            sumX += X[i++];
        }
        // Add remaining elements of Y[]
        while (j < Y.length) {
            sumY += Y[j++];
        }

        // Add the maximum of remaining sums to the result
        result += Math.max(sumX, sumY);

        return result;
    }
}
