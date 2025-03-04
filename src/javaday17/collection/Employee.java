package javaday17.collection;

public class Employee {
		private int eno;
		private String ename;
		private double salary;
		private String dname;
		public Employee() {}
		public Employee(int eno, String ename, double salary, String dname) {
			this.eno = eno;
			this.ename = ename;
			this.salary = salary;
			this.dname = dname;
		}
		public int getEno() {
			return eno;
		}
		public void setEno(int eno) {
			this.eno = eno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		@Override
		public String toString() {
			return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", dname=" + dname + "]";
		}
		
		
}
