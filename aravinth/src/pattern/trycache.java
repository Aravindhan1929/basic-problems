package pattern;

public class trycache {

	public static void main(String[] args) {try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[10]);
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");
	    }
	 finally {
	      System.out.println("The 'try catch' is finished.");
	    }

	}
//	public static void checkNum(int num) {  
//        if (num < 1) {  
//            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
//        }  
//        else {  
//            System.out.println("Square of " + num + " is " + (num*num));  
//        }  
//    }  

}
