import java.util.*;
public class NumberRepresentationInBinaryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Do you want to convert from binary to decimal (Option 1) or from decimal to binary? (Enter 1 or 2)");
		int option = keyboard.nextInt();
		if (option==1) {
			System.out.println ("What nonnegative integer would you like to convert from binary to decimal?");
			String binaryInput = keyboard.next();
			long sum = 0;
			for (int i=binaryInput.length(); i>0; i--) {
				int placeValue = Integer.parseInt(binaryInput.substring(i-1, i));
				sum = sum+(long) (Math.pow(2, binaryInput.length()-i)*placeValue);
			}
			System.out.println(sum);
		}else if (option==2) {
			System.out.println ("What nonnegative integer would you like to convert from decimal to binary?");
			String decimalInput = keyboard.next();
			String binary = "";
			long decimal = Long.parseLong(decimalInput);
			while (decimal>0) {
				binary = ""+(decimal%2)+binary;
				decimal = decimal/2;
			}
			System.out.println(binary);
		}else {
			System.out.println ("Please try again!");

		}
	}

}
