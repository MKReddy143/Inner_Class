package Inner_class;

public class Member_inner_class {

	private int data = 30;

	public static void main(String args[]) {
		Member_inner_class obj = new Member_inner_class();
		// Object creation of inner class by using outer class object reference
		Member_inner_class.Inner in = obj.new Inner();
		// Calling inner class method
		in.msg();
		System.out.println(obj.data);
	}

	class Inner {
		void msg() {
			System.out.println("data is " + data);
			Member_inner_class obj = new Member_inner_class();
			System.out.println(obj.data);
		}
	}
}

//In above example, we are creating a msg() method in the member inner class 
//that is accessing the private data member of the outer class.
