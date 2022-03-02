package OOPS;
import java.util.Scanner;
public class any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    
	        int b=input.nextInt();
	        int c=input.nextInt();
	        int d=input.nextInt();
	        int e=any.car(b,d);
	        int f=any.bus(b,c,d);
	        if(e>f){
	            System.out.println(f);
	        }else{
	            System.out.println(e);
	        }
	        input.close();
	    
	}
	public static int car(int a,int b){
	    int count=0;
	    while(a>0){
	        a=a-4;
	        count++;
	    }
	    return count*b;
	}
	public static int bus(int a,int b,int d){
	    int count=0;
	    int c=0;
	    while(a>0){
	        a=a-100;
	        if(a<100 && a>0){
	            c=any.car(a,d);
	        }
	        count++;
	    }
	    if(c<b && c>0){
	        count=count-1;
	    }
	    return count*b+c;
	}

}
