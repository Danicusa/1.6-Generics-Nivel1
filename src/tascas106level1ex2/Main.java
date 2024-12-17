package tascas106level1ex2;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person("Frodo", "Bolson", 50);
		
		GenericMethods meth1 = new GenericMethods();
		
		meth1.showGenericArguments(person1, "Hobbit", 5);
	}
}
