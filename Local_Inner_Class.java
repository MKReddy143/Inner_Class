package Inner_class;

public class Local_Inner_Class {
	private int num;

	public Local_Inner_Class(int n) {
		this.num = n;
	}

	public static void main(String[] args) {
		Local_Inner_Class inner_Class = new Local_Inner_Class(53);
		inner_Class.Calculator();
	}

	public void Calculator() {
		class Arethametic {
			public int Adition(int n) {
				return n + num;
			}

			public int subtraction(int n) {
				return num - n;
			}

			public int multiplication(int n) {
				return n * num;
			}

			public void Table(int n) {
				for (int i = 1; i <= n; i++)
					System.out.println(n + " * " + i + " = " + n * i);
			}
		}
		Arethametic arithmetic = new Arethametic();

		System.out.println("Addition: " + arithmetic.Adition(5));
		System.out.println("Subtraction: " + arithmetic.subtraction(3));
		System.out.println("Multiplication: " + arithmetic.multiplication(4));
		arithmetic.Table(8);
	}

}
