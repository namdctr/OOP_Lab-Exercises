package hust.soict.globalict.lab01.part6;
import java.util.Scanner;
public class SortSumAverage {
	public static void main(String[] args) {        
        //Initialize array     
    	int m;
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of elements of the array: ");
		m = input.nextInt();
	    int array[] = new int[m];       
	    System.out.print("Input elements of the array: ");
	    for (int i = 0 ; i < m ; i++)
	    	array[i] = input.nextInt();
            
        //Displaying elements of original array    
        System.out.println("Elements of the array: ");    
        for (int i = 0; i < m; i++) {     
            System.out.print(array[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < array.length; i++) {     
        	for (int j = i+1; j < array.length; j++) {     
        		if(array[i] > array[j]) {    
        			int temp;
        			temp = array[i];    
        			array[i] = array[j];    
        			array[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < array.length; i++) {     
            System.out.print(array[i] + " ");    
        }    
        
        System.out.println(); 
        
        //Calculate sum and the average of the array elements
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
        	sum += array[i];
        }
        double avg = (double)sum/(double)m;
        System.out.println("Sum of the array elements: " + sum);
        System.out.print("The average value of the array elements: " + avg);
        
    }    
}
