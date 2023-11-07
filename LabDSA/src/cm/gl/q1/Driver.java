package cm.gl.q1;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string of brackets: \n");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		BalancingBrackets balance = new BalancingBrackets(); 
		
		if(balance.isBalancedBracket(input) == true)
			System.out.println("The entered String has Balanced Brackets");
		if(balance.isBalancedBracket(input) == false)
			System.out.println("The entered Strings do not contain Balanced Brackets");
		sc.close();
	}

}
