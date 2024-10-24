package aggregation;

public class AggregationEx2 {
	
	int rollno;
	String city;
	AggregationEx1 ref; //aggregation
	
	
	public AggregationEx2(int rollno,String city,AggregationEx1 ref)
	{
		this.rollno=rollno;
		this.city=city;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.name+ref.age);
		System.out.println(rollno +city);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationEx1 object=new AggregationEx1("lilly",23);
		AggregationEx2 obj=new  AggregationEx2(02,"kollam",object);
		 obj.display();
		
		

	}


}
