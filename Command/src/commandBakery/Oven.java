package commandBakery;

public class Oven {
	int temp = 0;
	boolean power = false;
			
	public Oven() {
	}
	
	public void setTemp(int temp2) {
		//Checks if oven is off it its off oven preheats to entered temp. 
		if (power==false) {
			power = true;
			temp = temp2;
			System.out.println("Oven is preheating to " + temp2 + " degrees.");
			System.out.println("...");
			System.out.println("Oven is preheated.");
		}
		//If oven is on checks to see if current temp is different then entered temp. If is then changes it
		else if (temp != temp2) {
			temp=temp2;
			System.out.println("Oven temperature is changing to " + temp2 + " degrees.");
			System.out.println("...");
			System.out.println("Oven is preheated.");
		}
		//If oven is on and temp is same as enter temp it les the user know its ready.
		else {
			System.out.println("Oven is preheated.");
		}
	}
	
	//Turns oven off and set temp to zero.
	public void turnOvenOff() {
		temp = 0;
		System.out.println("Oven is off.");
	}
	
	//Turn on oven light
	public void ovenLightOn() {
		System.out.println("Oven light is on.");
	}
	
	//Turns off oven light
	public void ovenLightOff() {
		System.out.println("Oven light is off.");
	}
	
	//Shows oven temp.
	public void seeOvenTemp() {
		System.out.println(temp);
	}
}
