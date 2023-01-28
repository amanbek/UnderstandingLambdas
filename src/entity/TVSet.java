package entity;

import controller.ElectricityConsumer;

public class TVSet implements ElectricityConsumer{

	public void tvOff(){
		System.out.println("TV-Set is: OFF");
	}
	
	public void tvOn(){
		System.out.println("TV-Set is: ON");
	}
	
	public void electricityOn() {
		this.tvOn();
	}
	
}
