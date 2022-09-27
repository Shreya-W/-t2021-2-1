//Problem-2. Actual calculation is in class OddSeries

import java.util.Scanner;

class OddSeries{
	void generateOdds(int count){
		
		for(int i=0,x=1;i<count;x++)
			if(x%2!=0){ 					//checking if x is odd
				System.out.print(x+", ");
				i++;
			}//if end
		
	}//method end
}

class Problem_2 {

	public static void main(String[] args) {
		//objs creation
		Scanner s=new Scanner(System.in);
		OddSeries os=new OddSeries();
		
		//Taking i/p
		System.out.println("Enter the number");
		int a=s.nextInt();
		
		//starting the calculation
		os.generateOdds(a);
	}

}
