package Lavel1;

import java.util.Scanner;

public class q2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int p = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Sam’s average mark in PCM is ___"+(m + p + c)/ 3);
        sc.close();
    }
}
