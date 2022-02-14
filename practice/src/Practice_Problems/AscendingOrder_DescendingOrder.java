package Practice_Problems;
import java.util.Scanner;
public class AscendingOrder_DescendingOrder {

	public static void main(String[] args) {
//		getting the input from the user
		Scanner input=new Scanner(System.in);
// getting the array size of the array
		int size=input.nextInt();
		int[] array=new int[size];
// getting the array elements as input
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
// arranging the elements in ascending order
		int temp=0;
		for (int i = 0; i < size; i++) {     
            for (int j = i+1; j < size; j++) {     
               if(array[i] > array[j]) {    
                   temp = array[i];    
                   array[i] = array[j];    
                   array[j] = temp;    
               }     
            }
	}
		// printing the ascending order elements
        for(int i=0;i<size;i++) {
        	System.out.print(array[i]+" ");
        }
        System.out.println();
      //arranging the elements in descending order
        temp=0;
        for (int i = 0; i < size; i++) {     
            for (int j = i+1; j < size; j++) {     
               if(array[i] < array[j]) {    
                   temp = array[i];    
                   array[i] = array[j];    
                   array[j] = temp;    
               }     
            }     
        } 
        //printing the descending order elements
        for(int i=0;i<size;i++) {
        	System.out.print(array[i]+" ");
        }
	}
}
