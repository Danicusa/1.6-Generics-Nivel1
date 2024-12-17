package tascas106level1ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoGenericMethods try1 = new NoGenericMethods("A", "B", "C");
		System.out.println(try1.toString());
		
		NoGenericMethods try2 = new NoGenericMethods("B", "C", "A");
		System.out.println(try2.toString());
		
		try1.setArg1("newB");
		try1.setArg2("newA");
		System.out.println(try1.toString());
	}

}
