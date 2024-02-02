package com.encaps;
import java.util.Scanner;
public class myapp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Press 1. Set Employee data");
		System.out.println("Press 2. Get Employee data");
		switch(sc.nextInt()) {
		case 1:
			App.setdata();
			break;
		case 2:
			App.getdata();
			break;
		}}
	}

}
