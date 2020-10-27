// Test_PaulsPRNG

public class Test_PaulsPRNG {
	
	public void Test_PaulsPRNG() {
	}
	
	public void runTests( PaulsPRNG testObj ) {
		for (int i=0; i<1000; i++) {
			System.out.println( i + " Random Number = " + testObj.getRandomNumber() );
		}
	}
}
