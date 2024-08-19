import java.util.Scanner;

public class ForTest_4 {
	public static void main(String args[ ]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10 이하의 정수를 입력하세요 : ");
		int msg = sc.nextInt();
		if (msg > 10) {
			System.out.println("해당 범위에 값이 들어있지 않습니다.");
		} else {
			for (int i = 0; i < msg; i++) {
				System.out.println("MSG");
			}
		}
	}
}
