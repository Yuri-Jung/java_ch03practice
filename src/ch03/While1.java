
package ch03;
import java.util.Scanner;
//while문을 사용하여 1~10까지 화면에 출력하는 프로그램 작성하세요
public class While1 {
	
	public static void main(String[] args) {
//	int num=1;	
//	while(num<10) {
//		System.out.print(num);
//		num++;
//	 }
//		
		
//		1부터 10까지의 합
//		int i = 1;
//		int sum=0;
//		while(i<11) {
//			sum = sum+i;
//			i++;
//		}
//		System.out.println("합계: "+sum);
		
//		구구단 만들자.
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sec = 1;
		System.out.println("단을 선택하세요");
		while(sec<10) {
			System.out.println(num+"*"+sec+"="+(num*sec));
			sec++;
		}
	
  }

}
