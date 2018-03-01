package java;

public class TypeInference {

	public void test() {
		int a = 1; // Must specify int type
		boolean b = isTrue(); // Must specify boolean type
	}
	
	public static boolean isTrue() {
		return true;
	}
	
}
