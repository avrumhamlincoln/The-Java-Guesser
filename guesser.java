import java.util.*;

public class Guesser{
	public static void main(String[] args){
		String choice = Menu();

		bool keepGoing = true;

		while (keepGoing){
		String choice = menu();

        		if (choice == "0") {
            			keepGoing = false;
            			System.out.println("Exiting program ...");
        		}

			else if (choice == "1"){
            			Human();
        		}

			else if (choice == "2") {
           			Computer();
			}
		}
	}

	public Menu(){
		System.out.println("MENU");
		System.out.println("0. Exit");
		System.out.println("1. Human Guesser");
		System.out.println("2. Computer Guesser");
		String choice = input.nextLine();
     		return choice;
	}

	public Human(){
	
	}

	public Computer(){
		int low = 1;
        	int high = 100;
        	int tries = 0;
        	boolean correct = false;
		
		System.out.println("Think of a number between 1 and 100.");

		while (!correct){
			
		}
	}
}
