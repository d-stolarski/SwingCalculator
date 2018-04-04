import java.math.BigDecimal;
import java.math.BigInteger;

public class Testowa {
	public static void main(String[] args) {
	
		double a = 0.7;
		double b = 0.3;
		double sum = a - b;
		System.out.println(sum);
		
		BigDecimal aB = BigDecimal.valueOf(a);
		BigDecimal bB = BigDecimal.valueOf(b);
		BigDecimal sumB = aB.subtract(bB);
		System.out.println(sumB);
	}
}
