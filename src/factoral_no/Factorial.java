package factoral_no;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner(System.in);
		
		System.out.println("Enter input no:");
		input=in.nextInt();
		
		int result=1;
		
		while(input!=0){
			
			result=result*input;
			input=input--;
			
		}
		
		System.out.println("Factorial of given number is" +result);
	}

}
