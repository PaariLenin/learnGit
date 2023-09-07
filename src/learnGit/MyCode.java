package learnGit;
import java.util.Scanner;
// Learning Git repository in local system
public class MyCode {

	public static void main(String[] args) {
		MyCar mycar = new MyCar();
		new MyCar(1);//Just to call a constructor of day with 1 parameter
		try (Scanner getUserInput = new Scanner(System.in)) {
			System.out.println("What your the model of your car ? ");
			mycar.carModel = getUserInput.nextLine();
			System.out.println("What your the Age of your car ? ");
			mycar.carAge = getUserInput.nextInt();
			System.out.println("How much did you pay for your car ? ");
			mycar.carCost = getUserInput.nextInt();
		} catch (Exception e) {
		System.out.println("Oops! Its an invalid input from user : "+e);
		}
		
		//Call all other classes I have created via other lessons
	       carMethods(mycar); 
	}
	
	private static void carMethods(MyCar inCar)
	{
		inCar.dueCare();
		inCar.maintenanceCost();
		inCar.carValue(inCar.carCost);
	}
}

