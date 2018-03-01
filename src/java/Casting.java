package java;

public class Casting {
	
	public void demo(Object object) {
		if (object instanceof User) {
			System.out.println(((User)object).getName()); // We must cast the object in user after the condition
		}
	}

}
