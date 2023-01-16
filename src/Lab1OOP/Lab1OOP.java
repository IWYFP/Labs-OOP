package Lab1OOP;

import java.util.Scanner;

/**
 * Task: C2 = 1 (O1 = -); C3 = 1 (C = 1); C5 = 1 (O2 = /); C7 = 2 (int)
 * a, b - lower borders; n, m - upper borders; S - the result of calculation of value of function
 */

public class Lab1OOP {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            final short C = 1;
            float S = 0;
            System.out.println("\nInput a, b, n and m as integers:");
            int a = reader.nextInt();
            int b = reader.nextInt();
            int n = reader.nextInt();
            int m = reader.nextInt();
            if ((a <= C && C <= n) || (b <= 0 && 0 <= m)) throw new ArithmeticException();
            if ((a < n) || (b < m)) for (int i = a; i <= n; i++) for (int j = b; j <= m; j++) S += ((float) i / j) / (i - C);
            System.out.println("The result is: " + String.format("%.4f", S));
        } catch (java.util.InputMismatchException e1) {
            System.out.println("Error: the input is incorrect!");
        } catch (ArithmeticException e2) {
            System.out.println("Error: division by zero!");
        } catch (Exception e3) {
            System.out.println("Error: something went wrong!");
        }
    }
}
