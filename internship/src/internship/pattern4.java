package internship;
import java.util.Scanner;
public class pattern4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		for(int i=1;i<a*2-1;i++) {
			for(int j=1;j<a*2-1;j++) {
				if (j > a) {
                    if (i > a) {
                        if (((2 * a) - j) > ((2 * a) - i))
                            System.out.print(((2 * a) - i) + " ");
                        else
                            System.out.print(((2 * a) - j) + " ");
                        continue;
                    }
                    if (((2 * a) - j) > i)
                        System.out.print(i + " ");
                    else
                        System.out.print(((2 * a) - j) + " ");
                }
				else {
                    if (i > a) {
                        if (j > ((2 * a) - i))
                            System.out.print(((2 * a) - i) + " ");
                        else
                            System.out.print(j + " ");
                        continue;
                    }
                    if (j > i)
                        System.out.print(i + " ");
                    else
                        System.out.print(j + " ");
                }
            }
            System.out.println();
			}
		}

	}


