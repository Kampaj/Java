package domain;

import java.util.Random;

public class Player {
	private int points[] = {0,1,10,30,50};
	private final int pointsToWin = 301;
	private int pointsOfPlayer;
	private String name;
	
	Player(String name){
		this.name = name;
		this.pointsOfPlayer = this.pointsToWin;
	}
	
	public boolean subtractPoints(int pointsToSubtract) {
		if(pointsOfPlayer - pointsToSubtract < 0 ) {
			return false;
		}
		else {
			pointsOfPlayer -= pointsToSubtract;
			return true;
		}
	}
	
	public boolean throwDart() {
		Random generator = new Random();
		int pointsOfThrow = points[generator.nextInt(points.length)];
		if(subtractPoints(pointsOfThrow)==false) {
			return false;
		}
		return true;
	}
	
	public void playerTurn() {
		for(int i=0; i<3; i++) {
			if(this.throwDart() == false) {
				break;
			}
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getPointsOfPlayer() {
		return this.pointsOfPlayer;
	}
}
