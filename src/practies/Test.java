package practies;

public class Test {
	
	public static void main(String[] args) {
		
		double d= 1223454566d;
		
		int count = 0;
		
		while(d>0) {
			
			d= d/10;
			count++;
		}
		
		System.out.println(count);
		
	}

}
