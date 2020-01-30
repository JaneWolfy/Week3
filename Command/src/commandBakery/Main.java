package commandBakery;

public class Main {

	public static void main(String args[]) {
		//Creates appliances
		Oven oven = new Oven();
		Mixer mixer = new Mixer();
		Refrigerater displayCase = new Refrigerater();
		Refrigerater fridge = new Refrigerater();
		
		fridge.turnOn();
		fridge.setTemp(35);
		fridge.seeTemp();
		fridge.setTemp(37);
		fridge.setTemp(37);
		
		displayCase.turnOn();
		displayCase.setTemp(33);
		
		oven.setTemp(340);
		oven.seeOvenTemp();
		oven.setTemp(350);
		oven.setTemp(350);
		oven.ovenLightOn();
		oven.ovenLightOff();
		oven.turnOvenOff();
		
		mixer.turnMixerON();
		mixer.increaseSpeed();
		mixer.increaseSpeed();
		mixer.increaseSpeed();
		mixer.increaseSpeed();
		mixer.increaseSpeed();
		mixer.decreaseSpeed();
		mixer.getSpeed();
		mixer.decreaseSpeed();
		mixer.decreaseSpeed();
		mixer.turnOff();
		
		displayCase.turnOff();
	}
}
