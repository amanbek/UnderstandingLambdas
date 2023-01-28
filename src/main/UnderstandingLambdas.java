package main;

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
//		switcher.setConsumer(lamp); при данной архитектуре программы добавлять к электрической сети 
								//  потребителя можно только одного
								//  с целью избежать такую функциональную недостаточность создается 
								//  список ссылок типа интерфейса на 
								//  объекты потребителей в классе-контроллере 
		
		switcher.addElectricityConsumer(lamp);
		switcher.addElectricityConsumer(radio);
		switcher.addElectricityConsumer(tvSet);
		
		switcher.switchOn();
	
	}

}
