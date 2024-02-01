package inher;
import java.util.*;
public class car {
	static int b;
	public void carr() {

	 {
		System.out.println("choose car company..");
		System.out.println("Press 1: Tata");
		System.out.println("Press 2: BMW");
		System.out.println("Press 3: Mahindera");
	}}
		
	public static void main(String[] args) {
//		System.out.println("choose car company..");
//		System.out.println("Press 1: Tata");
//		System.out.println("Press 2: BMW");
//		System.out.println("Press 3: Mahindera");
		car obj=new car();
		obj.carr();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("Wellcome to tata");
			tata.setTata();
			break;
		    
		case 2:
			System.out.println("Wellcome to BMW");
			bmw.setbmw();
			break;
		case 3:
			System.out.println("Wellcome to Mahindera");
			mahindera.setman();
			break;
		
		
		
		default:
			System.out.println("Invalid option....");
			break;
		
		}
	}

}
