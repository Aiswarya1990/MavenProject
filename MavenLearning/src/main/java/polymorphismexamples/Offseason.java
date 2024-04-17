package polymorphismexamples;

public class Offseason extends Onseason {

	
	public void discount()
	{
		super.discount();
		pay=(price*85)/100;
		System.out.println("Price after 15% discount=" +pay);
	}
	
	public static void main(String[] args) {
		Offseason obj=new Offseason();
		obj.discount();

	}

}
