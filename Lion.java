package CrittersFinal;

import CrittersFinal.Critter.Action;
import java.awt.*;
import java.util.Random;
//Jewel Rahman 4/12/22 CS 211
//This class extends Critter to make a Lion
public class Lion extends Critter {
		
		private int l_moves; // counts moves 
		private Color starting_color;
		
		//constructor 
		public Lion() {
			this.l_moves = 0;
		}
	
		//Identifies Lion as "L" in GUI
		public String toString() {
			return "L";
		}
		
		// The given moments to Lion
		public Action getMove(CritterInfo info) {
			if (info.getFront() == Neighbor.OTHER) { // if a enemy is in front, it gets infected
				return Action.INFECT;
			}
			else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) { // if there's a wall in the front or right, Lions take a left
				return Action.LEFT;
			}
			else if (info.getFront() == Neighbor.SAME) { // if there is another Lion in front, Lion takes a right
				return Action.RIGHT;
			}
			else {
				return Action.HOP; //otherwise just hop
			}
		}
		// Random Color Generator
		private Color getRandomColor() {
			double rand_num = Math.random();
			if (rand_num < (1.0 / 3)) {
				return Color.RED;
			} else if (rand_num > (2.0 / 3)) {
				return Color.GREEN;
			} else {
				return Color.BLUE;
			}
		}
		
		// This method changes the color of Lion Every 3 moves to a random color
				public Color getColor() {
					this.l_moves = l_moves +1;
					if ((this.l_moves - 1) % 3 == 0) {
						Color changingColor = getRandomColor();
						this.starting_color = changingColor;
						return changingColor;
					} 
					else {
						return this.starting_color;
					}
				}
}	
