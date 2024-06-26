import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        String output = "";
        int temp;
        input = sc.nextLine();
        
        for (int i = 0; i < input.length(); i++) {
            temp = (int)input.charAt(i);
            if ((65 <= temp) && (temp <= 90)) {
                output += (char)(temp + 32);
            } else if ((97 <= temp) && (temp <= 122)) {
                output += (char)(temp - 32);
            } else {
                output += (char)temp;
            }
        }
        System.out.print(output);
    }
}