class Room{


	static int a;
	float b;
	Room(){
		a=10;
		b=5.5f;
		
	}
	Room(int a1, float b2){
		a=a1;
		b=b2;
		
	}
	
	public static void main(String arg[]){
		Room obj = new Room();
		Room obj1 = new Room(11,1.1f);

		System.out.println(obj.a);
		System.out.println(obj.b);

		System.out.println(obj1.a);
		System.out.println(obj1.b);
	}
}