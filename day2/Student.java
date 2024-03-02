class Student{
	String name;
	int marks1;
	int marks2;
	int marks3;

	void Assign(String n,int m1, int m2, int m3){
		name=n;
		marks1=m1;
		marks2=m2;
		marks3=m3;
			
	}	
	 

	void display(){
		System.out.println("name of the student "+ name);
		System.out.println("Total marks of the student "+ (marks1+marks2+marks3));
	}
	
	void totalAvg(){
		System.out.println("Average: "+ (marks1+marks2+marks3)/3);
	}


	public static void main(String arg[]){
	Student info = new Student();
	info.Assign("Tanvee",60,70,80);
	info.display();
	info.totalAvg();
	}
	
	
}