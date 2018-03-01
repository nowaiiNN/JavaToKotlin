package java;

public class Immutability {
	
	private int a = 1;
	private final int b = 3; // Only way to be immutable
	
	public Immutability() {
		a = 2;
		b = 1;
	}

}
