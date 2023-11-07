package cm.gl.q1;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BalancingBrackets {
	
	public boolean isBalancedBracket(String input) {
		
		if(input == null || input.isBlank()) {
			System.out.println("Empty String");
			return false;
		}
		
		Stack<Character> stack = new Stack<Character>();
		Set<Character> acceptedChars = new HashSet<Character>();
		acceptedChars.add('(');
		acceptedChars.add(')');
		acceptedChars.add('[');
		acceptedChars.add(']');
		acceptedChars.add('{');
		acceptedChars.add('}');
		
		for(char ch: input.toCharArray()) {
			if(!acceptedChars.contains(ch)) {
		//		System.out.println("Invalid character");
				return false;
			}
			else {
				
				if(ch == '{' || ch == '[' || ch == '(') {
					stack.push(ch);
					continue;
				}
			
				if(stack.isEmpty()) {
					return false;
				}
				
				switch(ch) {
				case '}': 
					if(stack.pop() != '{') {
							return false;
					}
					break;
				case ']': 
					if(stack.pop() != '[') {
							return false;
					}
					break;
				case ')': 
					if(stack.pop() != '(') {
							return false;
					}
					break;
					
				default: System.out.println("The entered Strings do not contain Balanced Brackets");
						return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
