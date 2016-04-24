package acadgild;
import java.util.Scanner;

public class PrimeNumber {
	int num;
	
	public int calculatePrime(){
		int notPrime=0;
		for (int i=2; i<num; i++){
			if(num%i == 0 ){
				notPrime = 1;
				break;
			}
		}
		return notPrime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num;
		int notPrime = 0;
		System.out.print("Enter the number to determine it is prime or not  :: ");
		PrimeNumber p1 = new PrimeNumber();
		p1.num = in.nextInt();
		notPrime = p1.calculatePrime();
		
		if(notPrime == 0) {
			System.out.println("Given number "+p1.num+" is prime number");
		} else {
			System.out.println("Given number "+p1.num+" is not prime number");
		}
	}

}
