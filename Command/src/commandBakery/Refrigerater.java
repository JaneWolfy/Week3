package commandBakery;

public class Refrigerater {
	int temp = 0;
	boolean power = false;
	
	public Refrigerater() {
	}
	
	//Turns on Refrigeater
	public void turnOn() {
		power = true;
		System.out.println("Refrigerater is now on");
	}
	
	//Turns off Refrigerator 
	public void turnOff() {
		power = false;
		System.out.println("Refrigerater is now off");
	}
	
	public void setTemp(int temp2) {
		//Checks if fridge is off it its off sets it to entered temp.
		if (power==false) {
			power = true;
			temp = temp2;
			System.out.println("Fridge is set to " + temp2 + " degrees.");
		}
		//If oven is on checks to see if current temp is different then entered temp. If is then changes it
		else if (temp != temp2) {
			temp=temp2;
			System.out.println("Fridge is set to " + temp2 + " degrees.");
		}
		//If fridge is on and temp is same as enterd temp it lest the user know its ready.
		else {
			System.out.println("Fridge is set");
			}
	}
	
	//Shows fridge temp.
	public void seeTemp() {
		System.out.println(temp);
	}
}
