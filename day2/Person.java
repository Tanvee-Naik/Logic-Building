class Person {
	int age;
	float height;
	int weight;

	Person(){
		age=23;
		height=150f;
		weight=46;
	}

	Person(float h,int w){
		age=24;
		height=h;
		weight=w;
	}
	
	Person(int a,float h,int w){
		age=a;
		height=h;
		weight=w;
	}

	void display(){
		System.out.println("age "+ age);	
		System.out.println("height "+ height);
		System.out.println("weight "+ weight);
	}

	public static void main(String arg[]){
		Person p1 = new Person();
		p1.display();
		Person p2 = new Person(165f,60);
		p2.display();
		Person p3 = new Person(26,160.5f,50);
		p3.display();
	}


}