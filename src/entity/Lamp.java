package entity;

import controller.ElectricityConsumer;

public class Lamp implements ElectricityConsumer{
		
	
	public void lightOn(){
		System.out.println("Lamp is: ON");
	}
	
	public void lightOff(){
		System.out.println("Lamp is: OFF");
	}

	
	public void electricityOn() {
		this.lightOn();
	}
	
}
