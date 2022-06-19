package binarydecimaldigital;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int binary ,decimal=0,x=1 ,res;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter the Binary Number: ");
	      binary= sc.nextInt();
	      
	      while(binary!=0)
	      {
	         res = binary%10;
	         decimal = decimal + (res*x);
	         x = x*2;
	         binary = binary/10;
	      }
	      
	      System.out.println("the decimal number = " +decimal);
	      
	      System.out.println("the decimal number in digital");
	      int dec = decimal;
	      
	      
	      

	      	for(int i=0;i<dec;i++) {
			if(i== 0||i==2||i==3||i==5||i==6||i==7||i==8||i==9) {
			System.out.println(" _ ");
			}else {
			System.out.println(" ");
			}

			
			if(i==0||i==4||i==5||i==6||i==8||i==9) {
			System.out.print("|");
			}else {
			System.out.print(" ");
			}


			if(i==2||i==3||i==4||i==5||i==6||i==8||i==9) {
			System.out.print("_");
			}else {
			System.out.print(" ");
			}


			if(i==0||i==1||i==2||i==3||i==4||i==7||i==8||i==9) {
			System.out.println("|");
			}else {
			System.out.println(" ");
			}




			if(i==0||i==2||i==6||i==8) {
			System.out.print("|");
			}else {
			System.out.print(" ");
			}
			
			if(i==0||i==2||i==3||i==5||i==6||i==8||i==9) {
			System.out.print("_");
			}else {
			System.out.print(" ");
			}


			if(i==0||i==1||i==3||i==4||i==5||i==6||i==7||i==8||i==9) {
			System.out.println("|");
			}else {
			System.out.println(" ");
			}
			
			
			
			
	      	}

	}

}
