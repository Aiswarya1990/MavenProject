package polymorphismexamples;

public class Onseason {

	float price= 10000;
	float pay;
	
	public void discount()
	{
		System.out.println("Price="+price);
		pay=(price*60)/100;
		System.out.println("Price after 40% discount =" +pay);
	}
}
