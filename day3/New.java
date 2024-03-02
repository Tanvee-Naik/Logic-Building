class New{
	int a;
	float b;
	static int i;

	New(){
		i=2;
		a=10;
		b=1.1f;
		System.out.println("inside parameterless");
	}

	New(int a1, float b1){
		a=a1;
		b=b1;
		System.out.println("inside parametrize");
	}
	
	//init
	{
		a=11;
		b=1.2f;
		System.out.println("inside init");
	}

	static
	{
		i=25;
		System.out.println("inside static");
	}

	public static void main(String arg[]){
		New obj = new New();
		New obj2 = new New(4,4.4f);
		System.out.println(i);
		System.out.println(obj.a);
		System.out.println(obj2.a);
		System.out.println(obj.a);
		System.out.println("inside main");
	}

}