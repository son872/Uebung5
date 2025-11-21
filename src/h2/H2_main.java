package h2;

public class H2_main {

	public static void main(String[] args) {
	int n = 1000, digits = 2;
	int [] a;
	a = new int [9];
	
	if (n == 0) {
	    digits = 1;
	} else {
	    digits = (int) Math.log10(n) + 1;
	}
	int b[] = new int[digits];
	for (int i = 0; i < b.length; i++) {
		b[i] = (int) (n / Math.pow(10, digits - i - 1) % 10);
	}
	for (int i = a.length - digits; i < a.length; i++) {
		a[i] = b[i - (a.length - digits)];

	}

}
}
