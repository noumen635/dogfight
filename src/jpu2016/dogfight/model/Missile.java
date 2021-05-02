package jpu2016.dogfight.model;

import org.graalvm.compiler.loop.InductionVariable.Direction;

import jpu2016.dogfight.model.Dimension;

public class Missile {

	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private static int distanceTraveled = 0;
	
	public  Missile (Direction direction, Dimension dimension) {
		
	}
	public static int getWIDTHWITHADIRECTION (Direction direction) {
		return 1;
	}
	public static int getHEIGHTWITHADIRECTION (Direction direction) {
		return 1;
	}
	public void move() {
		
	}
	public boolean isWeapon() {
		
	}
}
