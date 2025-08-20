package Methods;

import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] f = findFac(n);
        for (int x : f) {
            System.out.println(x + " ");
        }
        System.out.println("Sum of factors: " + sum(f));
        System.out.println("Product of factors: " + prod(f));
        System.out.println("Sum of squares of factors: " + sumSq(f));
        sc.close();
    }
    
    public static int[] findFac(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) c++;
        }
        int[] f = new int[c];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                f[j] = i;
                j++;
            }
        }
        return f;
    }

    public static int sum(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    public static long prod(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    public static int sumSq(int[] f) {
        int s = 0;
        for (int x : f) s += Math.pow(x, 2);
        return s;
    }
}
