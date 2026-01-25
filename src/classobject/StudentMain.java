package classobject;

class Student {
	public int sid;   //attributes
	public String sname;
	public int age;
	public String branch;
	public int fee;
	public void writeExam()    // methods
	{
		System.out.println("writing exam");
	}
}

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.sid =1;
		s1.sname = "Vijay";
		s1.branch = "ECE";
		s1.age = 22;
		s1.fee = 100000;
		Student s2=new Student();
		s2.sid =2;
		s2.sname = "rahul";
		s2.branch = "CSE";
		s2.age = 22;
		s2.fee = 100000;
		
		System.out.println(s2.sname);
		System.out.println(s1.sname);
		
		Box b1=new Box();
		b1.length = 10;
		b1.height = 10;
		b1.width = 10;
		System.out.println(b1.areaOfBox());
		Box b2=new Box();
		b2.length = 20;
		b2.height = 10;
		b2.width = 10;
		System.out.println(b2.areaOfBox());
		
		
	}

}
