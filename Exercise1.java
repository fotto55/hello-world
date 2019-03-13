import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter nChildren: ");
		int nChildren = scanner.nextInt();
		System.out.print("Enter nChocolate: ");
		int nChocolate = scanner.nextInt();
		
		System.out.format("Total number of chocolate eaten = %d", nChocolate - nChocolate%nChildren);

	}

}
