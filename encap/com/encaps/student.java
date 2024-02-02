package com.encaps;

public class student {
	int rollno;
	String name;
	String dept;
	
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", dept=" + dept + "]";
	}

	public static void main(String[] args) {
		student st=new student();
		st.name="Aman";
		st.rollno=10;
		st.dept="CSE";
		System.out.println(st);
	
	}
	

}
