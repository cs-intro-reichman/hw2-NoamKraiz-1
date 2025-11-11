// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code

		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int count =1;
		if(mode.charAt(0) == 'c') { 
			int times =seed;
			String concise = seed+" ";
			do {
				if(seed%2==0) seed /=2;
				else seed = seed*3 +1;
				concise += seed+" ";
				count++;
			} while (seed>1);
			System.out.println(concise+"("+count+")");
			seed=times;
		}
		else { 
			int times =1;
		    for(int i=2; i<=seed+1; i++){
			    String concise = times+" ";
			
			    do {
				    if(times%2==0) times /=2;
				    else times = times*3 +1;
				    concise += times+" ";
					count++;
			    } while (times>1);
			    System.out.println(concise+"("+count+")");
				times =i;
				count =1;
		    }
	    }   
		System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
	}
}



