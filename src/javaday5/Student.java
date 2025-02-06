package javaday5;

public class Student {

	private int rno;
	private String sname;
	private double per;
	private boolean isPnrActive;
	public Student() {}
//	public Student()  //No Args Constructor - Non Parameterise constructor
//	{
//		this.rno=1;
//		this.sname="Alice";
//		this.per=40.0;
//		this.isPnrActive=true;
//	}
	
//	public Student(int a,String b,double c, boolean d)  //All Args Constructor - Parameterise constructor
//	{
//		this.rno=a;
//		this.sname=b;
//		this.per=c;
//		this.isPnrActive=d;
//	}
//	
	public Student(int a,String b,boolean d,double c)  //All Args Constructor - Parameterise constructor
	{
		this.rno=a;
		this.sname=b;
		this.per=c;
		this.isPnrActive=d;
	}
	
	
//	public Student(Student st)  //Copy Constructor
//	{
//		this.rno=st.rno;
//		this.sname=st.sname;
//		this.per=st.per;
//		this.isPnrActive=st.isPnrActive;
//	}
	
	public Student(int rno, String sname, double per, boolean isPnrActive) {
	this.rno = rno;
	this.sname = sname;
	this.per = per;
	this.isPnrActive = isPnrActive;
}

	public void displayStudent()
	{
		System.out.println("Rno is "+this.rno);
		System.out.println("Name is "+this.sname);
		System.out.println("Per is "+this.per);
		System.out.println("Pnr Active status is "+this.isPnrActive);
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public boolean isPnrActive() {
		return isPnrActive;
	}

	public void setPnrActive(boolean isPnrActive) {
		this.isPnrActive = isPnrActive;
	}
	
	
}
