package com.encaps;

public class Emplooyes {
	private int empid;
	private String name;
	private String designation;
	
	public void setEmpId(int empid) {
		this.empid=empid;
		
	}
	public int getEmpId() {
		return empid;
	}
	public void  setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setDes(String designation) {
		this.designation=designation;
	}
	public String getDes() {
		return designation;
	}
	public static void main(String[] args) {
		Emplooyes emp= new Emplooyes();
		emp.setEmpId(100);
		emp.setName("Aman");
		emp.setDes("Satara");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getDes());
}

}
