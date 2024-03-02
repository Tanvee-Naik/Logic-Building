class Vehicle{
	int price;
	String color;
	String model;

	Vehicle(){
		price= 40000;
		color= "Blue";
		model= "A";
	}

	Vehicle(int p, String c, String m){
		price= p;
		color= c;
		model= m;
	}

	void display(){
		System.out.println("price "+ price);	
		System.out.println("color "+ color);
		System.out.println("model "+ model);
	}
	
	public static void main(String arg[]){
		Vehicle v1 = new Vehicle();
		v1.display();  
		Vehicle v2 = new Vehicle(50000,"red","B");
		v2.display();        
	}
}