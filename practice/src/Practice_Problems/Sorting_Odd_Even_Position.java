package Practice_Problems;
import java.util.Scanner;
public class Sorting_Odd_Even_Position {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arraySize; i++) array[i] = input.nextInt();
        sortEvenAscending(array);
        sortOddDescending(array);
        System.out.println("elements after sorting: ");
        for(int i : array) {
            System.out.print(i + " ");
        }
	}
	static void sortEvenAscending(int[] array) {
        if(array.length < 4) return;
        boolean toCheck = true;
        while(toCheck) {
            toCheck = false;
            for(int i = 1; i < array.length - 2; i+=2) {
                if(array[i] > array[i+2]) {
                    toCheck = true;
                    swap(array,i,i+2);
                }
            }
        }
    }
	static void swap(int[] array, int index1, int index2) {
        array[index1] = array[index1] + array[index2];
        array[index2] = array[index1] - array[index2];
        array[index1] = array[index1] - array[index2];
    }
	static void sortOddDescending(int[] array) {
        if(array.length < 3) return;
        boolean toCheck = true;
        while(toCheck) {
            toCheck = false;
            for(int i = 0; i < array.length - 2; i+=2) {
                if(array[i] < array[i+2]) {
                    toCheck = true;
                    swap(array,i,i+2);
                }
            }
        }
    }

}
