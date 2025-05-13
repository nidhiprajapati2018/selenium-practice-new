package day42;

public class TestM {
	
	public static  int number = 12;
	

	
	public static void testModifier() {
		System.out.println("I can accessable");
	}

	public static void main(String[] args) {
		TestM tm = new TestM();
		
		tm.testModifier();
		System.out.println(tm.number);

	}

}



