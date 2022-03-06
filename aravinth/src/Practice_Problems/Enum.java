package Practice_Problems;

public class Enum {

	public static void main(String[] args) {
		for (Season s : Season.values()){  
			System.out.println(s); 
		}System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
		System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
		System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal()); 
	}
	public enum Season { WINTER, SPRING, SUMMER, FALL }  
}
