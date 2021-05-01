package jpu2016.dogfight.model;

import java.util.ArrayList;

public interface IDogfightModel {
	
	public IArea getArea();
	
	public void (Dimension dimension);
	
	public void addMoblie (IMobile Mobile);
	
	public void removeMobile (IMobile Mobile);
	
	public ArrayList<IMobile> getMobiles();
	
	public IMobile getIMobileBtPlayer (int player);
	
	public void setMobilesHavesMoved();
}