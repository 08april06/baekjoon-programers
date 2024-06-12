import java.util.Scanner;
public class Salary_Switch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double currentSalary;
		String rating;
		double raise = 0.0;
		double newSalary;
		
		System.out.print("현 연봉을 입력하세요 : ");
		currentSalary = sc.nextDouble();

		sc.nextLine();

		System.out.print("근무평가등급을 입력하세요 : ");
		rating = sc.nextLine();

		switch ( rating ) {
			case "우수" : 
				raise = (currentSalary * 0.06);
				break;
			case "보통" : 
				raise = (currentSalary * 0.04);
				break;
			case "불량" : 
				raise  = (currentSalary * 0.02);
				break;
			default : System.out.println("없는 등급입니다.");
		
			}
			newSalary = currentSalary + raise; 
			System.out.println("연봉인상액 : " + (int)raise);
			System.out.println("새 연봉인상액 : " + (int)newSalary);
	}
}
