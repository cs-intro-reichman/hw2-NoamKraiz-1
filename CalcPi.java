// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code

		int number = Integer.parseInt(args[0]);
		double sum=1;
		int i=1;
		double j=3;

		while (i<number) {
			if(i%2==0) sum+=(double)(1/j);
			else sum-=(double)(1/j);
			j+=2;
			i++;	
		}

		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:     "+sum*4 );
	}
}



