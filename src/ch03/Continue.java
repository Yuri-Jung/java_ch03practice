package ch03;
//import java.util.Scanner;
public class Continue {
//5개의 정수를 받고 양수 합을 구하여 출력하라.
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("다섯 개의 정수를 입력하세요");
//		
//		int sum=0;
//		for(int i=0; i<5; i++) {
//			int n=scanner.nextInt();
//			if(n<=0) continue;
//			else sum=sum+n;
//		}
//	    System.out.println("양수의 합은"+sum+"입니다.");
		
//		1부터 100까지의 수를 더할 때 홀수일 때만 더하고 짝수일 때는 더하지 않는 프로그램을 continue문으로 만들어보자.
		int i=0;
		int sum=0;
		for(i=1; i<=100; i++) {
			if(i%2==0) continue;
			sum=sum+i;
		}
		System.out.println("1부터 100까지 홀수의 합은 ㅋ"+sum+"입니다.");
	}
}
