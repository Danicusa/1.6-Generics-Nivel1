package tascas106level1ex2;

public class GenericMethods {
	
	public <T, U, V> void showGenericArguments(T arg1, U arg2, V arg3) {
		System.out.println(arg1+ "" + arg2 + ", " + arg3);
	}
}
