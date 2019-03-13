import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number n: ");
		int n = scanner.nextInt();
		System.out.print("Enter the value 'number' in which the value opposite to number will be return: ");
		int number = scanner.nextInt();
		
		System.out.format("The number opposite %1$d in a circle with %2$d numbers is %3$d.", number, n, number + n/2);

	}

}
