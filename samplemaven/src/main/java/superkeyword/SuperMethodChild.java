package superkeyword;

public class SuperMethodChild extends SuperMethod{
	
	public void display2()
	{
		System.out.println("This is child class");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperMethodChild obj=new SuperMethodChild();
		obj.display2();

	}

}
