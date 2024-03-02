import java.util.Scanner;

class Que4{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);


	System.out.println("Enter 9 numbers");	

	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			int n = sc.nextInt();
		
			System.out.print(n+ " ");
		}	
		System.out.println(" ");
		}


	System.out.println("Enter 9 numbers");	
	//int n1 = sc.nextInt();
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			int n1 = sc.nextInt();
		
			System.out.print(n1+ " ");
		}	
		System.out.println(" ");
		}

	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			int result= n+n1;
		
			System.out.print(result);
		}	
		System.out.println(" ");
		}


	}
}
