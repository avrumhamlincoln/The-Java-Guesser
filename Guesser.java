import java.util.*;

public class Guesser{
	java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args){
		new Guesser();
	}

	public Guesser(){

		boolean keepGoing = true;

		while (keepGoing){
		String choice = Menu();

        		if (choice.equals("0")) {
            			keepGoing = false;
            			System.out.println("Exiting program ...");
        		}

			else if (choice.equals("1")){
            			Human();
        		}

			else if (choice.equals("2")) {
           			Computer();
			}
		}
	}

	public String Menu(){
		System.out.println("\nMENU");			
		System.out.println("0. Exit");
		System.out.println("1. Human Guesser");
		System.out.println("2. Computer Guesser");
		String choice = input.nextLine();
     		return choice;
	}

	public void Human(){
		System.out.println("\nGuess a number between 1 and 100!");

		int guess = 999;
		boolean keepGoing = true;
		int turns = 0;

		java.util.Random rand = new java.util.Random();

		int correct = rand.nextInt(100) + 1;

		while(keepGoing){
			System.out.print("\nPick a number: ");

			String userString = input.nextLine();
			guess = Integer.parseInt(userString);

			turns = turns + 1;

			if (guess > correct){
				System.out.println("Too high!");
			}

			else if (guess < correct){
				System.out.println("Too low!");
			}

			else{
				System.out.println("YOU GOT IT RIGHT!");
				keepGoing = false;
			}
		}

		if (turns < 7) {
			System.out.println("Very good ;)");
		}

		else if (turns == 7){
			System.out.println("average :/");
		}

		else{
			System.out.println("You didn't do so good :[");
		}
	}

	public void Computer(){
		int low = 1;
       		int high = 100;
       		int tries = 0;
		int guess = 999;
       		boolean correct = false;
		
		System.out.println("Think of a number between 1 and 100.");

		while (!correct){
			guess = ((low + high) / 2);

			System.out.println("\nHere is my guess: " + guess);
			System.out.println("How did I do?");
			System.out.println("Too (H)igh, too (L)ow, or (C)orrect?");
			String feedback = input.nextLine();

			if (feedback.equals("H")){
				high = guess + 1;
			} 

			else if (feedback.equals("h")){
				high = guess + 1;
			}

			else if (feedback.equals("L")){
				low = guess - 1;
			}

			else if (feedback.equals("l")){
                                low = guess - 1;
                        }

			else {
				System.out.println("Look at me go!");
				correct = true;
                        }
		}
	}
}
