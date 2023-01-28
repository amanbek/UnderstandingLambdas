package controller;

import java.util.List;
import java.util.ArrayList;

public class Switcher {
	private List<ElectricityConsumer> consumers = new ArrayList<ElectricityConsumer>();
	
	public void switchOn(){
		System.out.println("Switcher: ON\n");
		for (ElectricityConsumer consumer : consumers) {
			consumer.electricityOn();
		}
		
	}
	
	public void switchOff(){
		System.out.println("Switcher: OFF\n");
	}

	public void addElectricityConsumer(ElectricityConsumer consumer){
		this.getConsumers().add(consumer);
	}

	public void removeElectricityConsumer(ElectricityConsumer consumer){
		this.getConsumers().remove(consumer);
	}
	
	
	/****************Gettes and Setters*********************/
	 
		public void setConsumers(List<ElectricityConsumer> consumers) {
		this.consumers = consumers;
	}

	public List<ElectricityConsumer> getConsumers() {
		return consumers;
	}
	

}
