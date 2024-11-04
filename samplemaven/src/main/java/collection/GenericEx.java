package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List <String> d=new ArrayList<String>();
   d.add("blue");
   d.add("green");
   d.add("white");
   d.add("black");
   d.add("blue");
   d.add("red");
   System.out.println(d);
   d.set(2, "red");
   System.out.println(d);
   System.out.println(d.indexOf("blue"));
   System.out.println(d.lastIndexOf("blue"));
   d.remove(4);
   System.out.println(d);
   System.out.println(d.get(3));
   System.out.println(d.contains("black"));
   System.out.println(d.contains("violet"));
	}

}
