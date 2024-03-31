package sample;

public class Addnumbers {
	
	int sum;
	int a;
	int b;
	
	public  Addnumbers(int a,int b)
	{
	sum=a+b;
	}
	public void print()
	{
		
		System.out.println("Total=" +sum);
	}

	public static void main(String[] args) {
		
		Addnumbers obj=new Addnumbers(20,30);
		obj.print();
		
	}

}
