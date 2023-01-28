package entity;

import controller.ElectricityConsumer;

public class Radio implements ElectricityConsumer{
	
	
	public void playMusic(){
		System.out.println("Radio is: ON");
	}

	public void electricityOn() {
		this.playMusic();
	}
}
