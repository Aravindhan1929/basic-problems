package OOPS;
import java.util.*;
public class contest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		input.nextLine();
        String b=input.nextLine();
        List<String> c = new  ArrayList<String>();
        for(int j=0;j<size;j++){
            StringBuilder sb = new StringBuilder(b);
            sb=sb.deleteCharAt(j);
            System.out.println(sb);
            String e=sb.toString();
            if(!c.contains(e)) {
                 c.add(e);
            }
        }
        int ans=c.size();
        System.out.println(ans);

	}

}
