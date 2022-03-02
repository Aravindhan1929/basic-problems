package Practice_Problems;
import java.util.Scanner;
public class LargestFourNumbers {

	public static void main(String[] args) {
		// getting the input from the user
		Scanner input=new Scanner(System.in);
		// getting the array size of the array
		int size=input.nextInt();
		int[] array=new int[size];
		// getting the array elements as input
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		//arranging the elements in descending order
        int temp=0;
        for (int i = 0; i < size; i++) {     
            for (int j = i+1; j < size; j++) {     
               if(array[i] < array[j]) {    
                   temp = array[i];    
                   array[i] = array[j];    
                   array[j] = temp;    
               }     
            }     
        } 
        // printing first four largest number
        for(int i=0;i<4;i++) {
        	System.out.println(array[i]);
        }

	}

}
