package commandBakery;

public class Mixer {

	int speed = 0;
	
	public Mixer() {
	}
	
	//Turns mixer on to lowest setting
	public void turnMixerON() {
		System.out.println("Mixer is on.");
		speed = 1;
	}
	
	//Checks mixer speed and if it can turns it up.
	public void increaseSpeed() {
		if (speed >= 5) {
			System.out.println("Mixer cannot go any faster.");
		}
		else {
			speed++;
			System.out.println("Mixer speed is now " + speed + ".");
		}
	}
	
	//Checks mixer speed and if it can turns it down. Otherwise turns it off.
	public void decreaseSpeed() {
		if (speed ==1) {
			speed--;
			System.out.println("Mixer is now off");
		}
		else if (speed == 0) {
			System.out.println("Mixer is now off");
		}
		else {
			speed--;
			System.out.println("Mixer speed is now " + speed + ".");
		}
	}
	
	//turn mixer off
	public void turnOff() {
		speed = 0;
		System.out.println("Mixer is off");
	}
	
	//Shows mixer speed
	public void getSpeed() {
		System.out.println("Mixer speed is " + speed + ".");
	}

}
