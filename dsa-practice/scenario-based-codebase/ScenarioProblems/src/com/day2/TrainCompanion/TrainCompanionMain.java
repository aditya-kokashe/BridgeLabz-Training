package com.day2.TrainCompanion;

public class TrainCompanionMain {
	public static void main(String[] args) {
		
		Train train = new Train();
		
		train.addCompartment("WiFi");
		train.addCompartment("Pantry");
		train.addCompartment("Music");
		train.addCompartment("Sleeper");

		train.traverseForward();
		train.traverseBackward();
		
		train.removeCompartment("Music");
		
		train.traverseForward();
//		train.traverseBackward();
		
		train.showAdjacent("Pantry");
	}

}
