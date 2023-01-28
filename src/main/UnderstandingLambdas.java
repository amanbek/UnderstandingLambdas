package main;

import controller.ElectricityConsumer;
import controller.Switcher;
import entity.Lamp;
import entity.Radio;
import entity.TVSet;

public class UnderstandingLambdas {
	
	public static void main(String[] args) {
		Switcher switcher = new Switcher();
		Lamp lamp = new Lamp();
		Radio radio = new Radio();
		TVSet tvSet = new TVSet();
		
		//Event Subscribe
//		switcher.setConsumer(lamp); //with this architecture of the program, only one consumer can be added to the electrical network 
									//in order to avoid such functional insufficiency
									//we created list of interface type references containing links to
									//consumer objects in the controller [Switcher] class
									
		
		switcher.addElectricityConsumer(lamp);
		switcher.addElectricityConsumer(radio);
		switcher.addElectricityConsumer(tvSet);
		
		class Fire implements ElectricityConsumer{
			public void electricityOn() {
				System.out.println("--** Fire Alarm **--");
			}
		}
		
		//It is irrational to create an entire class just to call a given message
		
		switcher.addElectricityConsumer(new Fire());
		
		switcher.switchOn();
	
	}

}
