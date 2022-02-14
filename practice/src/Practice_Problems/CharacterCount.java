package Practice_Problems;
import java.util.Scanner;
public class CharacterCount {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		for(int i=0;i<name.length()-1;i++) {
			int count=1;
			if(name.charAt(name.length()-1)==name.charAt(i)) {
				if(name.charAt(name.length()-2)==name.charAt(name.length()-1)) {
					count++;
				}
			}else {
			for(char j=name.charAt(i);j==name.charAt(i+1);j++) {
				count++;
			}
			}
			System.out.print(name.charAt(i)+" "+count+" ");
		}

	}

}
