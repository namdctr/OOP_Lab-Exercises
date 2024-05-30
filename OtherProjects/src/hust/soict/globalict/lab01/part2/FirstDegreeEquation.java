package hust.soict.globalict.lab01.part2;

//ax + b = 0
import java.util.Scanner;
public class FirstDegreeEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinite solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("The solution of the equation is x = " + x);
        }
    }
}

