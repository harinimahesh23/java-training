package java_examples;
import java.util.Scanner;

public class Average {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int sum=0, num ,count=0;
		System.out.println("Enter 5 numbers");
		while(count<5)
		{
			num=sc.nextInt();
			sum=sum+num;
			count++;
		}
		System.out.println(sum);
		float avg = sum/count;
		System.out.println("Average is : "+avg);
		
	}

}
