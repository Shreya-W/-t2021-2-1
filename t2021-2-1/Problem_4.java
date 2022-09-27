//Problem-4 Actual calculation is in class MultipleCount

import java.util.ArrayList;
import java.util.Scanner;

class MultipleCount{
	
	void generateCount(ArrayList<Integer> al){
		
		int[] a1={1,2,3,4,5,6,7,8,9};			//array of already given numbers to divide
		int[] a2=new int[a1.length];			//array of counts for each number
		
		for(int i=0,count=0;i<a1.length;i++){	
			count=0;
			for(int j=0;j<al.size();j++){		
				if(al.get(j)%a1[i]==0){			//checking if given i/p number is divisible by each of a1 element
					count++;
				}
			}
			a2[i]=count;						// storing their count
		}
		
		//Just printing the o/p
		System.out.print("\n{");
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]+":"+a2[i]+", ");
		}
		System.out.print("}");
		
	}
}

class Problem_4 {

	public static void main(String[] args) {
		
		//objs creation
		Scanner s=new Scanner(System.in);
		MultipleCount mc=new MultipleCount();
		ArrayList<Integer> al=new ArrayList<>();
		
		//Taking i/ps
		System.out.println("Enter the number of elements");
		int size=s.nextInt();
		
		System.out.println("Enter the numbers");
		
		for(int i=0;i<size;i++){
			al.add(s.nextInt());
		}
		
		//initializing the calculation
		mc.generateCount(al);
		
	}

}
