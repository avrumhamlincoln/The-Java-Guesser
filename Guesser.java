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
		System.out.println("MENU");			
		System.out.println("0. Exit");
		System.out.println("1. Human Guesser");
		System.out.println("2. Computer Guesser");
		String choice = input.nextLine();
     		return choice;
	}

	public void Human(){

	}

	public void Computer(){
		int low = 1;
       		int high = 100;
       		int tries = 0;
       		boolean correct = false;
		
		System.out.println("Think of a number between 1 and 100.");

		while (!correct){
		
		}
	}
}
