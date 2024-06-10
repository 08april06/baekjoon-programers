import java.util.Scanner;
public class SwitchExam4 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int m = sc.nextInt();
		switch (m) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 							System.out.println(m+"월은 31일까지 있습니다.");
				break;
			case 4 : case 6 : case 9 : case 11 :												System.out.println(m+"월은 30일까지 있습니다.");
				break;
			case 2 : 
				System.out.println(m+"월은 29일까지 있습니다.");
				break;
		}
	}
}
