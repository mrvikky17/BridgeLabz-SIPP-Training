package Methods;

import java.util.Scanner;

public class AthleteRun {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000;
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a ");
        double a = sc.nextDouble();
        System.out.print("Enter side b ");
        double b = sc.nextDouble();
        System.out.print("Enter side c");
        double c = sc.nextDouble();
        double rounds = calculateRounds(a, b, c);
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to cover 5 km.");
        sc.close();
    }
}
