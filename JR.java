package CrittersFinal;
//Jewel Rahman 4/12/22 CS 211
//This class extends Critter to make my initials
// This is you decide Critter class
import java.awt.*;
import CrittersFinal.Critter.Action;

public class JR extends Critter {
	//My Color will be green
	public Color getColor() {
		return Color.RED;
	}
	
	//This shows the capable movements of JR
	public Action getMove(CritterInfo info) {
		if(info.getFront() == Neighbor.OTHER) { // if a enemy is in front, it will be eaten
			return Action.INFECT;
		}
		else if(info.getFront() != Neighbor.EMPTY) { // if no enemy is in front, turn left
			return Action.LEFT;
		}
		else {
			return Action.HOP; //otherwise hop
		}
	}
	
	//JR will appear as my initials in the GUI
	public String toString() {
		return "JR";
	}	
}
