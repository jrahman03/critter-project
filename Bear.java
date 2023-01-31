package CrittersFinal;
// Jewel Rahman 4/12/22 CS 211
// This class extends Critter to make a Bear

import java.awt.*;

public class Bear extends Critter { 
	
	private int move_num; //to keep count of each move bears make
	private boolean isPolar; //boolean variable determining whether they are polar or not
	
	
	// constructor - fix this, if you remove the parameters it will run but no bears will be polar
	public Bear() {
		this.isPolar = isPolar;
		this.move_num = move_num;
	}
	//this method is also overidden from critter (determines given movements bear does)
	public Action getMove(CritterInfo info) {
		if(info.getFront() == Neighbor.OTHER) { // if a enemy is in the front, the bear will infect it
			return Action.INFECT;
		}
		else if(info.getFront() == Neighbor.EMPTY) { // Otherwise if there is no neighbor hop
			return Action.HOP;
		}
		else {						// Otherwise turn left
			return Action.LEFT;
		}    
	}
	// If polar = True then the Bear Color will be white, If false then it will be black
	// this method is overidden from Critter
	public Color getColor() {
		if(isPolar) {
			return Color.WHITE;
		} else {
			return Color.BLACK;
		}
    }
	//this method is also overridden from critter
	//Alternates between "/" and "\" after every step
	public String toString() {
		this.move_num += 1;
		if (this.move_num % 2 == 0) { // occurs if move_num is odd 
				return "\\";
		} else { // since every other number will be even this else clause will execute
				return "/";
		}
	}	
}
