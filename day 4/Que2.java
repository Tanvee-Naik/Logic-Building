class Que2{
	public static void main(String args[]){

	int array[]={5,4,3,9,1,7,9};
	int min=array[0];
	int max=array[0];
	int i;
		for(i=0;i<6;i++)
			if(min>array[i])
				min=array[i];
		
	System.out.println("min "+ min);

		for(i=0;i<6;i++)
			if(max<array[i])
				max=array[i];
		
	System.out.println("max "+max);
	}
}

