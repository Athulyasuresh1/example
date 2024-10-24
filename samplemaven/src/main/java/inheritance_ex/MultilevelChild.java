package inheritance_ex;

public class MultilevelChild extends MultilevelIntermediate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChild obj=new MultilevelChild();
		  obj.display3();
		  obj.display2();
		  obj.display1();
	}
  public void display3()
  {
	  System.out.println("child of B");
  }
}
