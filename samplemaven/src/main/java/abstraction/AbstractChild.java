package abstraction;

public class AbstractChild extends AbstractParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj= new AbstractChild();
		obj.add();
		obj.display();
		obj.display2();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=2+3;
		System.out.println(a);
	}
	public void display2()
	{
		System.out.println("Abstract child");
	}

}
