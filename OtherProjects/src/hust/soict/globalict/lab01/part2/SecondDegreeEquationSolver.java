package hust.soict.globalict.lab01.part2;
import java.util.Scanner;
public class SecondDegreeEquationSolver {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("The equation has one root: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots: x1 = " + x1 + " and x2 = " + x2);
        }
    }
}
