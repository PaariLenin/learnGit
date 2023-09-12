package learnGit;

public class MyCar {

	String carModel;
	int carAge;
	String carColor;
	String carLength; // This is the length of the car - commit 5
	int carCost; //The car cost - Commit 4

	void dueCare() {
		System.out.println("\nCar Advice: \"Your car needs to serviced if more than 1 year old\"\n");
	}

	void maintenanceCost() {
		System.out.println("Total maintenance on your car is about " + carAge * 400+ " for your car");
	}

	float carValue(int carCost) {
		System.out.println("You bought it for "+ carCost);
		float carValueNow;
		if (carAge < 3) {
			carValueNow = carCost*0.75f;
			System.out.println("But now it costs about :" + carValueNow);
		} else if (carAge <= 5) {
			carValueNow = carCost*0.5f;
			System.out.println("But now it costs about :" + carValueNow);
		} else {
			carValueNow = carCost * 0.25f;
			System.out.println("But now it costs about :" + carValueNow);
		}
		return carValueNow;
	}
	
	MyCar(){
		System.out.println("Your car is created now");
	};

	MyCar(int i){
		System.out.println("Your car is created now. But if you want more cars");
	};
	
	MyCar(String i){
		System.out.println("Your car is created now. But if you want more cars");
	};
}
