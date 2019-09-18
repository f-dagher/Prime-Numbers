import java.util.*;

public class primeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number to check if it is Prime: ");
		
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		
		System.out.println(isPrime(test));
		
		
		
	}
	
	public static boolean isPrime(double num) {
		double prime;
		
		for(int i = 2; i < num; i++) 
		{
			prime = num/i;
			if (prime % 1 == 0)
				return false;
		}
		
		return true;
	}
}
