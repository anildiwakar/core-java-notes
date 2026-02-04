package inheritance;

public class BtechStudent extends Student{
	private String dept_name;
	
	public BtechStudent(int studentId, String sname, int age){
		super(studentId, sname, age);
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	public void writeExam() {
		super.writeExam();
		//System.out.println("Btech students Writing exam");
	}
	
}
