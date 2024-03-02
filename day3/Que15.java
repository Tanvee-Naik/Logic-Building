class Que15{
	public static void main(String arg[]){
		int Number=123;
		int sum;
		
		for(sum=0;Number>0;Number=Number/10)
			
			sum=sum+Number%10;
		
		
		System.out.println("Sum is: "+ sum);
		
	}

}