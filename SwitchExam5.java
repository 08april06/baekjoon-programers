import java.util.Scanner;
public class SwitchExam5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		
		switch (input) {
			case 1 : case 2 : case 3 : case 4 : System.out.println("뉴미디어 소프트웨어과");
			break;
			case 5 : case 6 : System.out.println("뉴미디어 디자인과");
			break;
		}
	}
}
