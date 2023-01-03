package countstringchar;

public class countstringchar {
	
	public static void main(String[] args) {
		
		String s= new String("I am shubham");
		
		int count= 1;
		
		
		for(int i=1;i<s.length();i++) {
			
			if(s.charAt(i)==' ') {
				
				count++;
			}
			System.out.println(count);
			
		}
	}

}
