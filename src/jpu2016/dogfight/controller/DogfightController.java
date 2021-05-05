package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.*;

import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {
	
	private static int TIME_SLEEP =30;
	
	private IViewSystem viewSystem;
	
	private IDogfightModel dogfightModel;
	
	
	public DogfightController(IDogfightModel dogfightModel) {
		
	}
	
	public void play() {
		
	}
	
	public void setViewSystem(IViewSystem viewSystem) {
		
	}
	
	private void launchMissile(int player) {
		
	}
	
	private void gameLoop() {
		
	}

	@Override
	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub
		
	}

	public IDogfightModel getDogfightModel() {
		return dogfightModel;
	}

	public void setDogfightModel(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}

	public IViewSystem getViewSystem() {
		return viewSystem;
	}

}
