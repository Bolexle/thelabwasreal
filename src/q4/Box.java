package q4;

/**
 * <p>This program creates the Box class and makes variables that can be changed and stored
 * using BoxTest.java.</p>
 *
 * @author Alex Holmes
 * @version 1.0
 */
public class Box {
	private int x, y, z;
	private boolean full;
	
	public Box(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.full = false;
	}
	
	public Box() {
		x = 10;
		y = 12;
		z = 13;
		full = false;
	}
	
	public int getx() {
		return x;
	}
	
	public void setx(int x) {
		this.x = x;
	}
	
	public int gety() {
		return y;
	}
	
	public void sety(int y) {
		this.y = y;
	}
	
	public int getz() {
		return z;
	}
	
	public void setz(int z) {
		this.z = z;
	}
	
	public String toString() {
		return ("x: " + x + " -- y: " + y + " -- z: " + z + " -- The box is full: " + full + "\n");
	}
};