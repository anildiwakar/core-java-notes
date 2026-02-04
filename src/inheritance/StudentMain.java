package inheritance;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student();
	
		
		
		
		
		BtechStudent s2=new BtechStudent(5,"Viajy",35);
		//s2.setAge(22);
		s2.setDept_name("CSE");
		//s2.setSid(1);
		//s2.setSname("Vijay");
		s2.writeExam();
		System.out.println(s2.getSname());
		System.out.println(s2.getDept_name());

	}

}
