package h1;

public class H1_main {

	public static void main(String[] args) {
		int []myArray = {5,6,7,10};
		int []ArrayCopy = new int[myArray.length];
		
		for (int i=0;i<myArray.length;i++) {
			ArrayCopy[i] = myArray[i];
		}
		
		for (int i=0;i<myArray.length;i++) {
			myArray[i] = ArrayCopy [myArray.length-i-1];
			
		}
		for (int i=0; i<myArray.length;i++) {
		System.out.println(myArray[i]);

	}

}
}
