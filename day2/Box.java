class Box{
	int height;
	int width;
	int breadth;
	
	Box(){
		height=2;
		width=2;
		breadth=2;
	}

	Box(int h, int w, int b){
		height=h;
		width=w;
		breadth=b;
	}


	int getVolume(){
		return((height*width*breadth));

	}
	
	int getArea(){
		return(((2*height)*(2*width)*(2*breadth)));

	}


	public static void main(String arg[]){
		Box obj= new Box();
		Box obj1= new Box(3,3,3);
		System.out.println("volume "+ obj.getVolume());
		System.out.println("Area "+obj.getArea());
	}
}
