import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static Random rand = new Random();
	private static int randomNumber = rand.nextInt(10) + 1;

	private static int maxNum = 100;
	
	private static ArrayList<Integer> guessedNumbers = new ArrayList<Integer>();
	
	private static int pickNumber(String response) {

		int newRandomNumber = guessedNumbers.get(rand.nextInt(guessedNumbers.size() - 1));
		
		ArrayList<Integer> numbersToRemove = new ArrayList<Integer>();
		
		if (response.equals("h")) {
			
			for(int i = 0; i < guessedNumbers.size() - 1; i++) { 
				if(guessedNumbers.get(i) < randomNumber) {
					numbersToRemove.add(guessedNumbers.get(i));
				}
			}
			
			guessedNumbers.removeAll(numbersToRemove);

			if(guessedNumbers.size() == 1) { 
				randomNumber = guessedNumbers.get(0);
			}
			else {
				randomNumber = guessedNumbers.get(rand.nextInt(guessedNumbers.size() - 1));
			}
			
			return 0;
		} 
		else if (response.equals("l")) {

			for(int i = 0; i < guessedNumbers.size(); i++) { 
				if(guessedNumbers.get(i) > randomNumber) {
					numbersToRemove.add(guessedNumbers.get(i));
				}
			}
			
			guessedNumbers.removeAll(numbersToRemove);
			
			if(guessedNumbers.size() == 1) { 
				randomNumber = guessedNumbers.get(0);
			}
			else {
				randomNumber = guessedNumbers.get(rand.nextInt(guessedNumbers.size() - 1));
			}
			
			return 0;
		} 
		
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("Range is: 1 and " + maxNum);
		
		for(int i = 1; i <= maxNum; i++){
			guessedNumbers.add(i);
		}

		//System.out.println(guessedNumbers.toString());
		System.out.println("size: " + guessedNumbers.size());

		while (true) {
			
			if(guessedNumbers.size() == 1) { 
				System.out.println("Your number must be: " + randomNumber);
				break;
			}
			
			System.out.println(guessedNumbers.toString());
			System.out.println("I guess your number is: " + randomNumber);
			System.out.print("Is that higher (h), lower (l) or correct (c): ");
			
			String response = scanner.next();

			//System.out.println(guessedNumbers.toString());
			guessedNumbers.remove(guessedNumbers.indexOf(randomNumber));
			//System.out.println(guessedNumbers.toString());
			
			if (guessedNumbers.size() == 1) {
				randomNumber = guessedNumbers.get(0);
				System.out.println("Your number must be: " + randomNumber);
				break;
			}
			
			if (response.equals("c")) {
				System.out.println("Your number must be: " + randomNumber);
				break;
			}
			else {
				if(response.equals("l") && guessedNumbers.indexOf(randomNumber) == 0) { 
					System.out.println("You must be lying.");
					System.out.println("Your number must be: " + randomNumber);
					break;
				}
				else if (response.equals("h") && randomNumber == maxNum) { 
					System.out.println("You must be lying.");
					System.out.println("Your number must be: " + randomNumber);
					break;
				}
				else {
					pickNumber(response);
				}
			}
		}
	}

}

/*
 * public static int factorialCheck(int factorNum) { double currentFactorNum =
 * factorNum; int i = 2; while(currentFactorNum > 1) { currentFactorNum =
 * currentFactorNum / i;
 * 
 * if (currentFactorNum == 1) { return i; } i++; }
 * 
 * 
 * return -1; }
 */

/*
 * int number = 18; int result = factorialCheck(number); if (result == -1) {
 * System.out.println(number + " NONE"); } else { System.out.println(number +
 * " = " + result + "!"); }
 */
