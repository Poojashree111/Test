package Test;
import java.util.*;

public class Generaterandomnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count, maxRange, i;
		 Scanner in = new Scanner(System.in);
	       System.out.println("Enter Maximum limit of Numbers");
	       maxRange = in.nextInt();
	       System.out.println("Enter number of Random Numbers to generate");
	       count = in.nextInt();
	       System.out.println("Random Numbers:");
	       Random randomGenerator = new Random();
	      
	       for (i = 0; i < count; i++) {
	          System.out.print(randomGenerator.nextInt(maxRange)+" ");
	       }

	}

}
