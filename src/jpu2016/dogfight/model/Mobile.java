package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile {

	private int speed;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.speed = speed;
	}
	public Direction getDirection() {
		
	}
	public void setDirection (Direction direction){
		
	}
	public Point getPosition(){
		
	}
	public Dimension getDimension() {
		
	}
	public int getSpeed(){
		return 1;
	}
	public int getWidth(){
		return 1;
	}
	public int getHeight(){
		return 1;
	}
	
	public void move() {
		
	}
	public void placeInArea (IArea area){
		
	}
	public boolean isPlayer (int player){
		
	}
	private void moveUp() {
		
	}
	private void moveRight() {
		
	}
	private void moveDown() {
		
	}
	private void moveLeft() {
		
	}
	public Color getColor() {
		
	}
	public IDogfightModel getDogfightModel() {
		
	}
	public void setDogfightModel(IDogfightModel dogfightModel) {
		
	}
	public boolean hit() {
		
	}
	public boolean isWeapon() {
		
	}
	public Image getImage() {
		
	}
}
