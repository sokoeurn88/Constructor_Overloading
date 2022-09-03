class Casio{
	int num1;
	int num2;
	String operation;
	
	public Casio() {
		int num1;
		int num2;
		String operation = "nothing";
	}
	
	public Casio(int i) {
		num1 = i;
		num2 = 0;
		String operation = "nothing";
	}
	
	public Casio(int i, int j) {
		num1 = i;
		num2 = j;
		String operation = "nothing";
	}
	public Casio(int i, int j, String op) {
		int num1 = i;
		int num2 = j;
		String operation = "op";
	}
}


public class ConstructorOverlaoding {

	public static void main(String[] args) {

		Casio c = new Casio(4, 6);
		System.out.println(c.num1);
		System.out.println(c.num2);

	}

}
