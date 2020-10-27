// Lab9.java

public class Lab9 {
    public static void main(String[] args) {
        System.out.println("Lab9 - IT 6780");
		try {
			PaulsPRNG generator = new PaulsPRNG();
			Test_PaulsPRNG testSuite = new Test_PaulsPRNG();
			testSuite.runTests( generator );

		} catch (Exception exp) {
			System.out.println( exp.toString() );
		}
    }
}