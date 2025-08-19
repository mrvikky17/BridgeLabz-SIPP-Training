package Methods;

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();
        int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);
        System.out.println("Each child gets = " + result[0]);
        System.out.println("Remaining chocolates = " + result[1]);
        sc.close();
    }
    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2];
        result[0] = numberOfChocolates / numberOfChildren;
        result[1] = numberOfChocolates % numberOfChildren;
        return result;
    }
}
