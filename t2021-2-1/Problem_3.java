//Problem-3. Actual calculation is in class OddForOdd

import java.util.Scanner;

class OddForOdd{
	void generateOdds(int count){ 
		if(count%2!=0){                          // checking if given number is odd
			for(int c=1,i=1;c<=count;i++){      //generating numbers via i
				if(i%2!=0){                    // checking if i is odd
					System.out.print(i+", ");
					c++;                      //increasing only if i is odd && printed
				}//inner if end
			}//for end
		}// outer if end
		else{
			generateOdds(count-1);
		}//else end
	
	}
}

class Problem_3 {

	public static void main(String[] args) {
		
		//objs creation
		Scanner s=new Scanner(System.in);
		OddForOdd oo=new OddForOdd();
		
		//taking i/p
		System.out.println("Enter the number");
		int a=s.nextInt();
		
		//starting calculation
		oo.generateOdds(a);
	}

}
