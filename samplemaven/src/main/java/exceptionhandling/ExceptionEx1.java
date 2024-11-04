package exceptionhandling;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=10;
      int b=0;
     // System.out.println("hello");
      try {
    	  
      
      int d=a/b;
      }
      catch(ArithmeticException ae)
      {
    	  b=5;
       int  e=a/b;
       System.out.println(e);
      }
      finally
      {
    	System.out.println("End of the program");  
      }
      }
      //System.out.println("hello");
      //System.out.println(d);
	}


