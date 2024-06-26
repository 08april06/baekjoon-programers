import java.util.Scanner;
public class SwitchOp {
    	public static void main(String args[]) {
       		Scanner sc = new Scanner(System.in);
        	System.out.print("수식 입력(수와 연산자 사이는 공백을 둘 것) : ");
       		int a = sc.nextInt();
        	char o = sc.next().charAt(0);
        	int b = sc.nextInt();
        	String answer = " ";

        	switch ( o ) {
        	   	case '+' : answer = Integer.toString(a+b); 
        	   	break;
        	   	case '-' : answer = Integer.toString(a-b);
        	   	break;
        	   	case '*' : answer = Integer.toString(a*b);
        	   	break;
        	   	case '/' : answer = Integer.toString(a/b);
        	   	break;
        	   	default : System.out.print("사칙연산자가 아닙니다.");
		   	return;
        	}
        	System.out.print(a+" "+o+" "+b+" "+" = "+answer);
    	}	
}
