package ufps.pooII.negocio;

public class MountainBike extends Bike{
	private int seatHeight;
	
	public MountainBike(int cadence, int gear, int speed, int seatHeight){
		super(cadence, gear, speed);
		this.seatHeight = seatHeight;
	}
}
