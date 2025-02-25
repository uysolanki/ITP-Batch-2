package javaday16FileHandlingSerialize;

public class ExStudent {
	private int rno;
	private String sname;
	private double per;
	
	public ExStudent() {}
	public ExStudent(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
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
	@Override
	public String toString() {
		return "MyStudent [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}

}
