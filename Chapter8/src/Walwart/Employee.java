package Walwart;

public abstract class Employee 
{
	private String firstName;
	private String lastName;
	
	public Employee(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
	}
	
	public String toString()
	{
		return(firstName + " "+ lastName);
	}
	
	abstract double pay(double period);
}
