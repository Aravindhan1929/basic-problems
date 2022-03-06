package OOPS;
import java.io.*;
public class SerializationSample {

	public static void main(String[] args) {
		Student obj=new Student(55,"Aravinth");
		try {
			FileOutputStream fout=new FileOutputStream("D:serialization.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(obj);
			out.flush();
			System.out.println("Success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("completed successfully");
		}
	}
}
class Student implements Serializable{
	int id;
	String name;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
