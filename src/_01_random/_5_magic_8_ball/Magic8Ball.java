//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

public class Magic8Ball {
	public static void main(String[] args) {
	// 1. Make a main method that includes all the steps below
	Random randomMaker = new Random();
	for(int i=0; i<1; i++) {
		int randomNumber = randomMaker.nextInt(4);
	// 2. Get the user to enter a question for the 8 ball to answer
		System.out.println(randomNumber);

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
		if (randomNumber==0) {
			System.out.println("yes so what");
		}
	
	// 4. If the random number is 0
		if (randomNumber==1) {
			System.out.println("no duh");
		}
		if (randomNumber==2) {
			System.out.println("I think you should ask the wonderful place called google");
		}
	// -- tell the user "Yes"
		if (randomNumber==3) {
			System.out.println("I believe the awnser you could just see it if you think for a bit");
		}
	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
}
}