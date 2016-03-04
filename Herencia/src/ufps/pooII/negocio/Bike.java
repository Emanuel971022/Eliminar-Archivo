package ufps.pooII.negocio;

public class Bike {
	private int cadence, gear, speed;

	public Bike(int startCadence, int startGear, int startSpeed){
		cadence = startCadence;
		gear = startGear;
		speed = startSpeed;
	}
	
	public int getCadene() {
		return cadence;
	}

	public void setCadene(int cadence) {
		this.cadence = cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void applyBreak(int decrement){
		speed -= decrement;
	}
	
	public void speedUp(int increment){
		speed += increment;
	}
}
