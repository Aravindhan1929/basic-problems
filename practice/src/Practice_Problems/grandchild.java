package Practice_Problems;
import java.util.Scanner;
import java.util.ArrayList;
public class grandchild {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
        System.out.println("Enter array size: ");
        int arraySize = input.nextInt();
        String[][] array = new String[arraySize][2];
        System.out.println("Enter the values: ");
        for(int i = 0; i < arraySize; i++) {
            array[i][0] = input.next();
            array[i][1] = input.next();
        }
        System.out.println("Enter whose number of grandchildren to be found: ");
        String grandpa = input.next();
        System.out.println("The no of grandchildren for " + grandpa + " is: " + findGrandSon(array, grandpa));
	}
	static int findGrandSonCount(String[][] array, String son) {
        int count = 0;
        for(int i = 0; i< array.length; i++) {
            if(array[i][1].equals(son)) count++;
        }
        return count;
    }
	static int findGrandSon(String[][] array, String granddad) {
        ArrayList<String> sonList = new ArrayList<String>();
        for(int i = 0; i < array.length; i++) {
            if(array[i][1].equals(granddad)) sonList.add(array[i][0]);
        }
        int count = 0;
        for(String son : sonList) {
            count += findGrandSonCount(array, son);
        }
        return count;
    }

}
