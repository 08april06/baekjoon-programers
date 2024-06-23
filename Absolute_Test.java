import java.util.Scanner;
public class Absolute_Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int num = n * -1;
		if (n > 0) {
			System.out.print(n+"의 절대값은 "+n+"입니다."); 
		} else {
			System.out.print(n+"의 절대값은 "+num+"입니다.");
		}
	}
}
