package jpu2016.dogfight.controller;

import jpu2016.dogfight.controller.Order;

public class UserOrder implements IUserOrder {
	
	private int player;
	
	private Order order;
	
	public UserOrder(Order order, int player) {
			
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return this.order;
	}

	@Override
	public int getplayer() {
		// TODO Auto-generated method stub
		return 1;
	}


}
