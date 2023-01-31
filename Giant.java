package CrittersFinal;
//Jewel Rahman 4/12/22 CS 211
//This class extends Critter to create Giant

//import CrittersJR.Critter.Action;
//import CrittersJR.Critter.Neighbor;
import java.awt.*;

public class Giant extends Critter {
	// variable measures the number of moves committed by Giant as well as an array that carries the words that change
	private int g_moves;
	private String initialName;
	private final String[] giantStrings = {"fee", "fie", "foe", "fum"};
	private int giantIndex;
	
	//constructor
	public Giant() {
		this.g_moves = 0;
		this.giantIndex = 0;
	}
	
	// Giant uses the color gray
	public Color getColor() {
		return Color.GRAY;
	}
	
	// ToString alternates between fee for the first 6 moves, fie for another, then fum, keep repeating
	public String toString() {
		this.g_moves = this.g_moves + 1;
		if ((this.g_moves - 1) % 6 == 0) {
			if (this.giantIndex == 4) {
				this.giantIndex = 0;
			}
			this.giantIndex = this.giantIndex + 1;
			return giantStrings[giantIndex - 1].toString();
		} else {
			this.initialName = giantStrings[giantIndex - 1];
		}
		return this.initialName;
	}
	
	//Defines Lions actions
	public Action getMove(CritterInfo info) {
		if(info.getFront() == Neighbor.OTHER) { // if a enemy is in the front, the giant will infect it
			return Action.INFECT;
		} 
		else if(info.getFront() == Neighbor.EMPTY) {// if nothing is there it will hop 
			return Action.HOP;
		}
		else {
			return Action.RIGHT;
		}
	}	
}
