package classobject;



public class StudentMain {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("Vijay");
		s1.setBranch("ECE");
		s1.setAge(22);
		s1.setFee(10000);
		Student s2=new Student();
		s2.setSid(2);
		s2.setSname("rahul");
		s2.setBranch("CSE");
		s2.setAge(22);
		s2.setFee(10000);
		Student s3=new Student();
		System.out.println(s2.getSname());
		
		System.out.println(s2.getSname());
		System.out.println(s1.getSname());
		System.out.println(s1.getSid());
		s1.writeExam();


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
