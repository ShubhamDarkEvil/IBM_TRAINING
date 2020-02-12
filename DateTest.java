class Date{
	private int day,month,year;
	
	public Date()
	{
		this.day=0;
		this.month=0;
		this.year=0;
	}
	public Date(int date,int month,int year)
	{
		this.day=date;
		this.month=month;
		this.year=year;
	}
	
	public int getDay()
	{
		return day;
	}
	public int getmonth()
	{
		return month;
	}
	public int getyear()
	{
		return year;
	}
	
	public void setDate(int day)
	{
		this.day=day;
	}
	public void setMonth(int month)
	{	
		this.month=month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	
	public void print()
	{
		System.out.println("DD/MM/YYYY : "+this.day+"/"+this.month+"/"+this.year);
	}
	public static void swap(Date d1, Date d2)
	{
		Date temp=new Date();
		temp.day=d1.day;
		temp.month=d1.month;
		temp.year=d1.year;
		
		d1.day=d2.day;
		d1.month=d2.month;
		d1.year=d2.year;
		
		d2.day=temp.day;
		d2.month=temp.month;
		d2.year=temp.year;
		
	}
}
public class DateTest
{
	public static void main(String args[])
	{
		Date d1=new Date(14,5,1998);
		Date d2=new Date(16,12,2002);
		System.out.println("Before Swapping");
		System.out.println("Date 1 : ");
		d1.print();
		System.out.println("Date 2 : ");
		d2.print();
		
		d1.swap(d1,d2);
		System.out.println("After Swapping");
		System.out.println("Date 1 : ");
		d1.print();
		System.out.println("Date 2 : ");
		d2.print();
		
	}
}
		
		
	
	
	
	
	