package main;

import controller.Switcher;
import entity.Lamp;

public class UnderstandingLambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Switcher switcher = new Switcher();
		Lamp lamp = new Lamp();
		
		switcher.switchOn();
		lamp.lightOn();
		
	}

}
