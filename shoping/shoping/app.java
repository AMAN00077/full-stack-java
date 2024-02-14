package shoping;
import java.util.*;
public class app {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
//	public static void m1() {	
	while(true) {
		System.out.println("*******Wellcome to Rathod's Bangles*******");
		System.out.println("Press 1.Product "+"\nPress 2.getdata"+"\nPress 3.Update"+"\nPress 4.Billing");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			data.setdata();
			prodata.setinfo();
			break;
			
		case 2:
			data.getdata();
			break;
		case 3:
			data.updatedata();
			break;
		case 4:
			prodata.getinfo();
			break;
		}
		
	}}
	
	

}
