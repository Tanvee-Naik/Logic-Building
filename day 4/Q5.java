class Q5{
	public static void main(String args[]){
	
	int a[][]={{1,2,3},{1,2,3},{1,2,3}};
	int b[][]={{1,2,3},{1,2,3},{1,2,3}};
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++)
			if(a[i][j]==b[i][j])
				System.out.println("Matrices are equal");
			

			else
				System.out.println("Matrices are not equal");
	}
	}
}
