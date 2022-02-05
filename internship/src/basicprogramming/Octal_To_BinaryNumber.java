package basicprogramming;
import java.util.Scanner;
public class Octal_To_BinaryNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int octalNumber = input.nextInt();
        int result = converter(octalNumber);
        System.out.println("Binary equivalent value is: "+ result);
	}
	public static int converter(int octalValue)
    {
        int i = 0;
        int decimalValue = 0;
        int binaryValue = 0;
        while (octalValue != 0) {
            decimalValue+= (octalValue % 10) * Math.pow(8, i);
            ++i;
            octalValue /= 10;
        }
        i = 1;
        while (decimalValue != 0) {
            binaryValue += (decimalValue % 2) * i;
            decimalValue /= 2;
            i *= 10;
        }
        return binaryValue;
    }

}
