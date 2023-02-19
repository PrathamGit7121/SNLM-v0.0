import java.util.Scanner;
class Employee
{
	int EmpId;
	String name;
	public Employee()
	{}
	public Employee(int EmpId, String name)
	{
		this.EmpId=EmpId;
		this.name=name;
	}
	public String getData()
	{
		return " EmpID = "+EmpId + "\n Name = "+name;
	}
	
}
public class EmployeeDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID : ");
		int id = sc.nextInt();
		
		System.out.print("Enter Employee Name : ");
		String name = sc.next();

		Employee e1= new Employee(id,name);
		
		String obj=e1.getData();
		System.out.println(obj);

	}

}
