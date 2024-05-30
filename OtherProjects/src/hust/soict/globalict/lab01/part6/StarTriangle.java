package hust.soict.globalict.lab01.part6;
import java.util.Scanner;
public class StarTriangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print(" n = "); 
		int n = keyboard.nextInt();
		 
		for (int i=0; i<n; i++) {
			for (int j=n-i; j>1; j--){
	            System.out.print(" ");
	        }
			for (int j=0; j<=2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
