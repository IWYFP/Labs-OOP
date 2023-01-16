package Lab2OOP;

import java.util.Arrays;

/**
 * Task: C5 = 1 (C = B(T)); C7 = 2 (short); C11 = 1 (sum of min elements of every row)
 * rows - number of rows of a matrix; columns - number of columns of a matrix; B - matrix B; C - matrix C
 * sum - sum of min elements of a matrix; min - min element of a row of a matrix
 */

public class Lab2OOP {
    public static void main(String[] args) {
        try {
            final short rows = 5;
            final short columns = 3;
            short[][] B = new short[rows][columns];
            short[][] C = new short[columns][rows];
            System.out.println("\nThe matrix B is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    B[i][j] = (short) (Math.random() * 65536 - 32768);
                    C[j][i] = B[i][j];
                }
                System.out.println(Arrays.toString(B[i]));
            }
            int sum = 0;
            System.out.println("\nThe matrix C is:");
            for (short[] i: C) {
                short min = i[0];
                for (int j = 0; j < rows; j++) if (min > i[j]) min = i[j];
                System.out.println(Arrays.toString(i));
                sum += min;
            }
            System.out.println("\nThe sum of minimum elements of every row of the matrix C is: " + sum);
        } catch (Exception e) {
            System.out.println("Error: something went wrong!");
        }
    }
}
