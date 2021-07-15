import java.util.*;

class Stack {
    int MAX = 1000;
    char a[] = new char[MAX];
    int top = -1;
    
    boolean isEmpty() {
        return top < 0;
    }
    
    char getTop() {
        if(top < 0) {
            return '0';
        }
        return a[top];
    }
    
    void push(char c) {
        if(top >= MAX - 1) { 
            System.out.println("Stack Overflow");
        }
        else {
            a[++top] = c;
        }
    }
        
    char pop() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return '0';
        }
        else {
            return a[top--]; 
        }
    }
}
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(checkStack(input));
            
		}
		
	}
    
    public static boolean checkStack(String input) {
        Stack s = new Stack();
        for(int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if(x == '(' || x == '[' || x == '{') {
                s.push(x);  
                continue;   
            }
            
            if(s.isEmpty()) {
                return false;
            }
            char check;
            switch(x) {
                
                case ')':
                    check = s.pop();
                    if(check == '}' || check == ']')
                        return false;
                    break;
                case '}':
                    check = s.pop();
                    if(check == ')' || check == ']')
                        return false;
                    break;
                case ']':
                    check = s.pop();
                    if(check == ')' || check == '}')
                        return false;
                    break;
            }
            
        }
        
        return s.isEmpty();
    }
    
    
}



