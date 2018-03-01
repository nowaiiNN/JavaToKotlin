package java;

public class NullSafety {
	
	public void test() {
		String result = concat("toto", "titi");
		System.out.println(result.length()); // Null pointer exception on runtime
		
		int length = getLength(null); // Null pointer exception on runtime
	}
	
	public String concat(String a, String b) {
		return null;
	}
	
	public int getLength (String word) {
		return word.length();
	}

}
