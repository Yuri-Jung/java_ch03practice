package ch03;

public class For {

	public static void main(String[] args) {
//		for문을 사용하여 1부터 10까지 더해라
		int i =0;
		int sum=0;
		for(i=1; i<=10; i++ ) {
			sum=sum+i;
			System.out.print(i);
			if(i<=9) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.println(sum);
			}
		
		}
		
	}

}
