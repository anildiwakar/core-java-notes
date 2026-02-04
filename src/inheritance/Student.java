package inheritance;

public class Student {
	private int sid;
	private String sname;
	private int age;
	
	public Student() {
		
	}
	public Student(int studentId, String sname, int age) {
		this.sid = studentId;
		this.sname = sname;
		this.age = age;
	}
	public int getSid() {
		
		return sid;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void writeExam() {
		System.out.println("Writing");
	}
	
	

}
