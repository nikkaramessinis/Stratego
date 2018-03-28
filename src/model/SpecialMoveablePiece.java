package model;

import javax.swing.JButton;

/**
 * SpecialMoveablePiece has overriden attack() and move()
 * 
 * @author Nick Karamessinis csd3335
 * 
 */
public class SpecialMoveablePiece extends MoveablePiece {
	public SpecialMoveablePiece(int rank, String Specialpower) {
		super(rank);
		this.SpecialPower = Specialpower;
	}

	private String SpecialPower;

	/**
	 * According to each monster SpecialPower move is different
	 */
	public void move(int firstbut, int secondbut, JButton b1, JButton b2) {
		int tmp = firstbut - secondbut;
		int tmp2 = firstbut / 10;
		if (SpecialPower == "Throw") {
			// mporei na kounithei opoudhpote katheta h orizontia oxi diagwnia
			// && button2prepei na nai adio
			if ((tmp % 10) == 0
					|| ((tmp2 * 10) <= secondbut && ((tmp2 * 10) + 9) <= secondbut)) {
				b2.setIcon(b1.getIcon());
				b1.setIcon(null);
			} else {// throw exception
			}
		} else if (SpecialPower == "Speed") {
			if ((tmp % 10 == 0) && (firstbut - 20 <= secondbut)
					&& (secondbut <= firstbut + 20) || (tmp2 * 10 <= secondbut)
					&& ((tmp2 * 10) + 9) >= secondbut
					&& ((firstbut + 2) >= secondbut)
					&& ((firstbut - 2) <= secondbut)) {
				b2.setIcon(b1.getIcon());
				b1.setIcon(null);
			} else {/* thow exceptio */
			}

		} else {
			super.move(firstbut, secondbut, b1, b2);
		}
	}

	/**
	 * According to each monster SpecialPower attack is different
	 */
	public void attack() {

		if (SpecialPower == "Arrows") {
		}
		if (SpecialPower == "Magic") {
		}
	}

	/**
	 * 
	 * @pre -
	 * @return specialPower
	 */

	public String getSpecialPower() {
		return SpecialPower;
	}

	/**
	 * 
	 * @pre special power must be throw or speed or arrows
	 * @post this.speciapower equals specialpower
	 * @param SpecialPower
	 */
	public void setSpecialPower(String SpecialPower) {
		this.SpecialPower = SpecialPower;
	}

	// public String toString(){
	// return SpecialPower;}
}
