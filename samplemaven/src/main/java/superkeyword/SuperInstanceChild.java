package superkeyword;

public class SuperInstanceChild extends SuperInstance {
    String color="violet";
    public void display()
    {
    	System.out.println(color);
    	System.out.println(super.color);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperInstanceChild obj=new SuperInstanceChild();
		obj.display();

	}

}
