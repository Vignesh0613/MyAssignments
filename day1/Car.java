package homeassignment.day1;

public class Car {

	public void applyBreak() {
		System.out.println("Applied break");
	}
 public void soundHorn() {
	 System.out.println("Soundhorn");
 }
 
 public static void main(String[] args) {
	Car Cobj=new Car();
	Cobj.applyBreak();
	Cobj.soundHorn();
}
}