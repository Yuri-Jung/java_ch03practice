package ch03;

public class Forgugu {

	public static void main(String[] args) {
     int j=0;
     int i=0;
     for(i=1; i<=9;i++) {
    	
    	 for(j=1; j<=9; j++) {
    		 System.out.println(i+"*"+j+"="+(i*j)); 
    	 }
    	 System.out.println("===="+(i+1)+"단====");
//    	 System.out.println();
     }
	}
}
