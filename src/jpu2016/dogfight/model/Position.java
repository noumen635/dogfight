package jpu2016.dogfight.model;

public class Position {
	
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	Position (double x, double y, double maxX, double maxy){
		
	}
	Position (Position position){
		
	}
	Position (){
		
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	public void setMaxY(double maxY) {
		this.maxY = maxY;
	}
}
