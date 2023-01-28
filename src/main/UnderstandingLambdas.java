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
//		switcher.setConsumer(lamp); ��� ������ ����������� ��������� ��������� � ������������� ���� 
								//  ����������� ����� ������ ������
								//  � ����� �������� ����� �������������� ��������������� ��������� 
								//  ������ ������ ���� ���������� �� 
								//  ������� ������������ � ������-����������� 
		
		switcher.addElectricityConsumer(lamp);
		switcher.addElectricityConsumer(radio);
		switcher.addElectricityConsumer(tvSet);
		
		switcher.switchOn();
	
	}

}
