package jpu2016.dogfight.model;

import jpu2016.dogfight.model.Direction;

public class Plane {

	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;
	
	public Plane(int player, Direction direction, Positin potion, String image){
		this.player = player;
	}
	public boolean isPlayer (int player) {
		this.player = player;
	}
	public boolean hit() {
		
	}
}
