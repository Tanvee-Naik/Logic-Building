import java.util.Scanner;

class Que3{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number: ");
	int n = sc.nextInt();
	int sum=0;
	int i;
	for(i=0;i<n;i++){
		int t;
		t = 2*(i-1);
		if(t%3==0){
			sum=sum+i;
	}
	}
	System.out.println(sum);
			
	}

}
	