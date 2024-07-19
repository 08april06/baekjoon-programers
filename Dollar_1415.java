import java.util.Scanner;
public class Dollar_1415 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위:원) : ");
		double m = sc.nextInt();
		double w = m / 1260;
		double l = (int)(w * 100 + 0.5) / 100.0;
		System.out.println(m+"원은 $"+l+"입니다.");
	}
}
		
