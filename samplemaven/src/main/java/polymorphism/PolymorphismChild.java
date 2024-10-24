package polymorphism;

public class PolymorphismChild extends Polymorphism1 {
	
	
	public void display(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
		super.display(34, 23);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolymorphismChild  obj=new PolymorphismChild();
				obj.display(20, 10);;
		

	}

}
