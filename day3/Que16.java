import java.util.Scanner;

class Que16{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number: ");
	int a = sc.nextInt();

	if(a%a==0)
		System.out.print("Number is prime number: ");
	else
		System.out.print("Number is non-prime number: ");


	}
}