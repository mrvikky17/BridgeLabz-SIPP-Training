package Lavel1;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = 125000;
        int discount = 10;
        System.out.println(fee - (fee*(discount/100)));
        sc.close();
    }
}
