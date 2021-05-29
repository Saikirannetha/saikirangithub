package qsp;

public class VariableTypes {

	//global variables
	//instance variables
	int m=100;
	
	//static variables
	static String tname="maths teacher";
	
	//instance method
	public void stud1()
	{ int m=300;
		int m1=60;
		String sname="sai";
		System.out.println(m1);
		System.out.println(sname);
		System.out.println(m);
		//System.out.println(this.m);
		
	}
	
	//static method
	public static void stud2()
	{
		int m2=70;
		String sname="littu";
		System.out.println(m2);
		System.out.println(sname);
	
	}
	
	
	public static void main(String[] args) {
		 VariableTypes a = new VariableTypes();
		 System.out.println(a.m);
		 System.out.println(tname);
//		 
		 a.stud1();
		 stud2();
		 
	}

}
