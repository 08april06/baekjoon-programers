import java.util.Scanner;
public class Tax_calculate {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근로소득을 입력하세요(만 원 단위) : ");
		int salary = sc.nextInt();
		int n = salary * 10000;
		int m = 0;

		if (n <= 20000000) {
            		m = (int)(salary * 0.05);
		} else if (n > 20000000 && n <= 40000000) {
			m = (int)(salary * 0.15);
        	} else if (n > 40000000 && n <= 80000000) {
           		 m = (int)(salary * 0.25);
       	 	} else {
            		m = (int)(salary * 0.4);
		}
		System.out.println("소득세 : "+m+"만 원");
	}
}
