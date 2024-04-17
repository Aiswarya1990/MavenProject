package abstraction;

public class AbstractSub extends AbstractExample {

	public AbstractSub(int age, String name) {
		super(25, "Aishu");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AbstractSub obj= new AbstractSub(25,"Aishu");
			obj.display();
			obj.print();
			AbstractExample.printname();
			
			

	}

	@Override
	public void display() {
		System.out.println("Goodnight");
		
	}

	
}
