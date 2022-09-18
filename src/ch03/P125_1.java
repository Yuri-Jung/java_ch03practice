package ch03;
import java.util.Scanner;
public class P125_1 {
	public static void main(String[] args) {
		System.out.println("알파벳 문자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		
		for(int i='a'; i<=c; i++) {
			if(i<=c) {
				System.out.println((char)i);
			}
		}
		
	}
	
}
