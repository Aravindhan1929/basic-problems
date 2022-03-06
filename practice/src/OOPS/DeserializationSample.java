package OOPS;
import java.io.*;
public class DeserializationSample {

	public static void main(String[] args) {
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:serialization.txt"));
			Student s=(Student)in.readObject();
			System.out.println(s.id+" "+s.name);
			
		} catch (Exception e) {
			e.printStackTrace();
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
