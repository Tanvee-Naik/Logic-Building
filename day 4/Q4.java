class Q4{
	public static void main(String args[]){
	
	int a[][]={{1,2,3},{1,2,3},{1,2,3}};
	int b[][]={{1,2,3},{1,2,3},{1,2,3}};
	int Result[][]=new int[3][3];
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			
			Result[i][j]=a[i][j]+b[i][j];
			System.out.print(Result[i][j]+" ");

		}
	System.out.println(" ");
	}
	}

}