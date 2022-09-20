package java_examples;
import java.util.*;
public class Multiples {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the value");
		int value= s.nextInt();
				if(value%3==0&&value%6==0) {
					System.out.println("The entered value is multiple by both 3 and 6");
				}
				else
					System.out.println("The entered value is not multiple by both 3 and 6");
					
    	
		
		// TODO Auto-generated method stub

	}

}
