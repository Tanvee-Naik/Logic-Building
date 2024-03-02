class Room1{
	float h;
	float w;
	float b;
	
	Room1(){}
	Room1(float h1, float w1, float b1){
		h=h1;
		w=w1;
		b=b1;


	}

	void volume(){
		System.out.println("Volume is:"+ h*w*b);
	}
	
	public static void main(String arg[]){
		Room1 room = new Room1(8f,3f,2f);
		room.volume();
		
	}
}