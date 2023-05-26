package Class_object_methods;

public class Main_method_1 
{
	public static void main(String[] args)
	{
		program_1 emp = new program_1();
		emp.eid = 100;
		emp.ename = "Rakshit";
		emp.job = "STE";
		emp.sal = 500000.00;
		
		emp.employee();
		
		program_1 emp1 = new program_1();
		emp1.eid = 101;
		emp1.ename = "Rahul";
		emp1.job = "SDE";
		emp1.sal = 600000.00;
		
		emp1.employee();
	}
}
