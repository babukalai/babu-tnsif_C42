package com.tnsif.day2;

public class EncapsulationDemo {
	//Team RCB
	
	String playerName ;
	int orderNo ;
	int jersyNo ;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo ;
	}

	public int getJersyNo() {
		return jersyNo;
	}

	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}
	

	@Override
	public String toString() {
		return "EncapsulationDemo [playerName = " + playerName + ", orderNo = " + orderNo + ", jersyNo = " + jersyNo + "]";
	}

	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		
		obj.setPlayerName("Virat kohli");
		obj.setJersyNo(18);
		obj.setOrderNo(2);
		
		System.out.println(obj);
	}

}
