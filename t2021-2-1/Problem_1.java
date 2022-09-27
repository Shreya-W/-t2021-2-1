//Problem-1. Actual calculation is in class Calculator

import java.util.Scanner;

class Calculator {
	
	double Addition(double a,double b){
		return a+b;
	} 
	
	double Subtraction(double a,double b){
		return a-b;
	} 
	
	double Multiplication(double a,double b){
		return a*b;
	}  
	
	double Division(double a,double b){
		return a/b;
	}
}

class Problem_1 {

	public static void main(String[] args) {
		//objs creation
		Scanner s=new Scanner(System.in);
		Calculator c=new Calculator();
		
		while(true){
			System.out.println("Enter 1st number");
			double a=s.nextDouble();
			
			System.out.println();
			
			System.out.println("Enter 2nd number");
			double b=s.nextDouble();
			
			System.out.println();

			System.out.println("Select the type of operation from below :");
			System.out.println("Add");
			System.out.println("Sub");
			System.out.println("Mul");
			System.out.println("Div");
			System.out.println("Press anything to exit");
			
			System.out.println();
			
			System.out.println("Enter the type of operation");
			String o=s.next().toLowerCase(); // converted to all lowercase, for the ease of typing
			
			System.out.println();
			
			switch(o){
				case "add" : System.out.println("Addition is "+ c.Addition(a,b) + "\n");
								break;
				case "sub" : System.out.println("Subtraction is "+ c.Subtraction(a,b) + "\n");
								break;
				case "mul" : System.out.println("Multiplication is "+ c.Multiplication(a,b)+ "\n");
								break;
				case "div" : System.out.println("Division is "+ c.Division(a,b) + "\n");
								break;
				default    : System.exit(0);
			}//switch end
			
		}//while end
		
	}//method end

}
