package hust.soict.globalict.lab01.part2;
import java.util.Scanner;
public class LinearSystemSolver {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coefficients of the first equation: ");
        System.out.print("Enter the value of a11: ");
        double a11 = input.nextDouble();
        System.out.print("Enter the value of a12: ");
        double a12 = input.nextDouble();
        System.out.print("Enter the value of b1: ");
        double b1 = input.nextDouble();

        System.out.println("Enter the coefficients of the second equation: ");
        System.out.print("Enter the value of a21: ");
        double a21 = input.nextDouble();
        System.out.print("Enter the value of a22: ");
        double a22 = input.nextDouble();
        System.out.print("Enter the value of b2: ");
        double b2 = input.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("The solution of the system is x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
