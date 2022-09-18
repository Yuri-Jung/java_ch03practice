package ch03;

public class Break {

	public static void main(String[] args) {
//		0부터 시작해 숫자를 1씩 늘림ㄴ서 합을 계산할 때 숫자를 몇 까지 더하면 100이 넘는지 알고 싶다.
		
		int i=0;
		int sum=0;
		
		for(i=0; ; i++) {
			sum=sum+i;
			if(sum>=100)
				break;
		}
	System.out.println("sum: "+sum);
	System.out.println("i: "+i);
 }
}
