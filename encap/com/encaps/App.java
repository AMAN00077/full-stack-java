package com.encaps;
import java.util.Scanner;
public class App {
	static Scanner sc =new Scanner(System.in);
	static Emp em=new Emp();
	public static void setdata() {
		System.out.println("Enter Employee Id:");
		int id =sc.nextInt();
		em.setEmpId(id);
		System.out.println("Enter Employee name:");
		em.setName(sc.next());
		System.out.println("Enter Employee designation:");
		em.setDes(sc.next());
	}
	public static void getdata() {
		System.out.println("Employee Id:"+em.getEmpId());
		System.out.println("Employee Name"+em.getName());
		System.out.println("Employee Designation:"+em.getDes());}

}
