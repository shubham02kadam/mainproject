package practies;

public class CountnoDigits {
	
	public static void main(String[] args) {
		
		long a= 1234567879L;
		
		int count =0;
		
		while(a>0) {
			
			a=a/10;
			count++;
		}
		
		System.out.println(count);
		
	}

}
