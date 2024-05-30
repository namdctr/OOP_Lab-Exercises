package hust.soict.globalict.lab01.part6;
//Write a program to display the number of days of a month, 
// which is entered by users (both month and year). 
// If it is an invalid month/year, ask the user to enter again.

import java.util.Scanner;
public class DisplayDaysOfMonths {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 0;
        int days = 0;
        String month = "";
        boolean validInput = false;
        
        // Validate year input
        while (!validInput) {
            System.out.print("Enter a year (non-negative integer): ");
            String yearStr = input.nextLine();
            try {
                year = Integer.parseInt(yearStr);
                if (year >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid year entered. Please enter a non-negative integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid year entered. Please enter a non-negative integer.");
            }
        }
        
        validInput = false;
        
        // Validate month input
        while (!validInput) {
            System.out.print("Enter a month (full name, abbreviation, in 3 letters, or in number): ");
            month = input.nextLine().toLowerCase();
            switch (month) {
                case "january":
                case "jan.":
                case "jan":
                case "1":
                    validInput = true;
                    
                    break;
                case "february":
                case "feb.":
                case "feb":
                case "2":
                    validInput = true;
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case "march":
                case "mar.":
                case "mar":
                case "3":
                    validInput = true;
                    days = 31;
                    break;
                case "april":
                case "apr.":
                case "apr":
                case "4":
                    validInput = true;
                    days = 30;
                    break;
                case "may":
                case "5":
                    validInput = true;
                    days = 31;
                    break;
                case "june":
                case "jun":
                case "6":
                    validInput = true;
                    days = 30;
                    break;
                case "july":
                case "jul":
                case "7":
                    validInput = true;
                    days = 31;
                    break;
                case "august":
                case "aug.":
                case "aug":
                case "8":
                    validInput = true;
                    days = 31;
                    break;
                case "september":
                case "sept.":
                case "sep":
                case "9":
                    validInput = true;
                    days = 30;
                    break;
                case "october":
                case "oct.":
                case "oct":
                case "10":
                    validInput = true;
                    days = 31;
                    break;
                case "november":
                case "nov.":
                case "nov":
                case "11":
                    validInput = true;
                    days = 30;
                case "december":
                case "dec.":
                case "dec":
                case "12":
                    validInput = true;
                    days = 31;
                    break;
                default:
                    System.out.println("Invalid month entered. Please enter a valid month.");
            }
        }
        
        System.out.printf("There are %d days", days);
        
        input.close();
    }
}
