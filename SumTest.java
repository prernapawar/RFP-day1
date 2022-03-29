package javapractice;

public class SumTest {
 public static void main(String[] args) {
	int sum = 0;
	System.out.println("Calculate Sum for below integers");
	for(int i=0; i<values.lenght;i++) {
		System.out.println(values[i]);
		try {
		sum = sum + Integer.parseInt(values [i]);
		}catch (NumberFormatException e) {
		System.out.println("invalid integer command line argument:" + e.toString());
	}
}
	System.out.println("Sum:" + Sum);
	
}
}
