package TypeCasting;

public class NarrowingCasting
{

	public static void main(String[] args)
	{
		
		double d = 200.06;
		long l =(long)d;
		int i = (int)l;
	
		
		System.out.println("Double Data type value="+d);
		
		System.out.println("long Data type value="+l);

		System.out.println("int Data type value="+i);
		
		
// Second code
		byte b = 70;
		int p = b;
		
		p = (int)(p*2);
		System.out.println(p);
	}

}
