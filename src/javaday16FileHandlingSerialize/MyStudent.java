package javaday16FileHandlingSerialize;

import java.beans.Transient;
import java.io.Serializable;

public class MyStudent implements Serializable
{

	private static final long serialVersionUID =1234567890L;
	
	private int rno;
	private String sname;
	private double per;
	private String gender;
	
	private transient int mp;
	
	static String coachName="Gambhir";
	
	public MyStudent() {}

	public MyStudent(int rno, String sname, double per, String gender, int mp) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.per = per;
		this.gender = gender;
		this.mp = mp;
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
	
	
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getMp() {
		return mp;
	}





	public void setMp(int mp) {
		this.mp = mp;
	}





	@Override
	public String toString() {
		return "MyStudent [rno=" + rno + ", sname=" + sname + ", per=" + per + ", gender=" + gender + ", mp=" + mp
				+ "]";
	}




	public void displayCoachName()
	{
		System.out.println("Coach Name "+coachName);
	}
	


	
	
	
}
