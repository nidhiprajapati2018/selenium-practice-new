package day22;

public class Test {
	
	
	
	public static String reversedString(String str) {
		
		String reStr = "";
		
		for(int i=0; i< str.length(); i++) {
	
			reStr =  str.charAt(i) + reStr;
		}
		return reStr;
		
	}
	
	public boolean ispalindrome(String str) {
		
		String result = Test.reversedString(str);
		
		if(str.equals(result)) {
			System.out.print("String Plindrome");
			return true;
		} 
			System.out.print("String is NOT Plindrome");
			return false;
			
	}
		

	public static void main(String[] args) {
	  
		Test t = new Test();
		t.ispalindrome("Nidi");
	    
		
	
	}

}
