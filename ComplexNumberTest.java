class ComplexNumber{
	 double real;
	 double imaginary;

	public ComplexNumber(double real,double imaginary){
	this.real=real;
	this.imaginary=imaginary;
   }

	public ComplexNumber add(ComplexNumber c){
	double sreal=this.real+c.real;
	double simaginary=this.imaginary + c.imaginary;
	ComplexNumber temp =new ComplexNumber(sreal,simaginary);
	return temp;
  }
  
  public ComplexNumber sub(ComplexNumber c){
	double sreal=this.real-c.real;
	double simaginary=this.imaginary - c.imaginary;
	ComplexNumber temp2 =new ComplexNumber(sreal,simaginary);
	return temp2;	
  }
 
	public ComplexNumber mun(ComplexNumber c){
	double sreal=this.real*c.real;
	double simaginary=this.imaginary * c.imaginary;
	ComplexNumber temp3 =new ComplexNumber(sreal,simaginary);
	return temp3;
  }
	

 public double getReal()
 {
	 return real;
	 
}

public double getImg()
{
	return imaginary;
}

public String toString()
{
	return this.getReal()+"+"+this.getImg()+"i";
}
}
public class ComplexNumberTest{
	public static void main(String args[]){
		ComplexNumber c1=new ComplexNumber(5,4);
		ComplexNumber c2=new ComplexNumber(7,3);
		ComplexNumber temp=c1.add(c2);
		ComplexNumber temp2=c1.sub(c2);
		ComplexNumber temp3=c1.mun(c2);

		System.out.println("ADDITION RESULT ->  "+temp);
		System.out.println("SUBTRACTION RESULT ->  "+temp2);
		System.out.println("MULTIPLICATION RESULT ->  "+temp3);
}
}