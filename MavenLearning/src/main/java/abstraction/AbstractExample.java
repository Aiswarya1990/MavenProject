package abstraction;

public abstract class AbstractExample {

	int age;
	String name;
	
	public AbstractExample(int age,String name)
	{
		
	
	this.age=age;
	this.name=name;
}

	public abstract void display();
	
	public void print()
	{
		System.out.println("Good Morning");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
	}
	
	public static void printname()
	{
		System.out.println("Aiswarya");
	}
}


