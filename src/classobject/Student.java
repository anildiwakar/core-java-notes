package classobject;

public class Student {
	private int sid;   //attributes
	private String sname;
	private int age;
	private String branch;
	private int fee;
	public Student() {
		
	}
	public Student(int sid,String sname,int age,String branch,int fee)
	{
		this.sid=sid;
		this.sname=sname;
		this.age=age;
		this.branch=branch;
		this.fee=fee;
	}
	public Student(String sname,int age,String branch,int fee)
	{
		this.sname=sname;
		this.age=age;
		this.branch=branch;
		this.fee=fee;
	}
	public Student(int sid)
	{
		this.sid=sid;
	}
	protected void writeExam()    // methods
	{
		System.out.println("writing exam");
	}
	private void abc()
	{
		for(int i=0;i<10;i++)
		{
			
		}
		writeExam();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
}
