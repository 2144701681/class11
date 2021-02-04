package exercise;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// this is lesson for know how to generate Random numbers
	
       
//below the code for random num we search the google and copy everything except For LOOP
 // Print random integers 5 times it will print 5 random but if u want to 500 make For Lup
       /* System.out.println(rand.nextInt(1000)); 
        System.out.println(rand.nextInt(1000)); 
        System.out.println(rand.nextInt(1000)); 
        System.out.println(rand.nextInt(1000)); 
        System.out.println(rand.nextInt(1000)); */
        
        for(int i =0; i<500 ;i++) {
        	System.out.println(getRandomNumberInRange(100,999));
        }
        
  
        
		

	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
