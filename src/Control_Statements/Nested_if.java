package Control_Statements;

public class Nested_if {
	public static void main(String[] args)
	{
		int no =10;
		if ( no>=1)
		{
			if (no%2==0)
			{
				System.out.println("Given " +no + " number is even");
			}
			else if (no%2==1)
			{
				System.out.println("Given " +no + " number is odd");
			}
			else
			{
				System.out.println("Number is zero");
			}
		}
	}

}
