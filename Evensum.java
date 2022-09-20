package java_examples;

public class Evensum {

	public static void main(String[] args) {
		int i=1;
		int n=100;
		int sum=0;
		for(i=1;i<=n;i++) {
			if(i%2==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
