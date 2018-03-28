package model;

import javax.swing.JButton;

/**
 * A piece that that can be moved
 * 
 * @author Nick Karamessinis csd3335
 * 
 */
public class MoveablePiece implements Piece {
	private int rank;
	private int position;

	/**
	 * constructor sets this.rank equal to rank
	 * 
	 * @param rank
	 */
	public MoveablePiece(int rank) {
		setRank(rank);
	}

	/**
	 * (accessor) gets position of Piece
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * sets Position of Piece
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * 
	 * @pre two buttons whose icon isn't null are pressed
	 * @post the moveablePiece of the player playing is attacking the other
	 *       Piece
	 */
	public void attack() {
	}

	/**
	 * 
	 * @pre second button is null
	 * @post the moveable player pressed moves to pressed button if this is
	 *       elligible
	 */

	public void move(int firstbut, int secondbut,JButton first,JButton second) {second.setIcon(first.getIcon());
		if (secondbut <= firstbut + 1 && firstbut - 1 <= secondbut
				|| secondbut == firstbut + 10 || secondbut == firstbut - 10) {second.setIcon(first.getIcon());
				first.setIcon(null);
		}else{/*throw exception*/}
	}

	/**
	 * 
	 * @pre -
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * 
	 * @pre rank is between 0-10
	 * @post this.rank equals param
	 * @param rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * According to rank toString returns different monster
	 */
	public String toString() {
		if (rank == 1) {
			return "slayer";
		} else if (rank == 2) {
			return "scout";
		} else if (rank == 3) {
			return "dwraf";
		} else if (rank == 4) {
			return "elf";
		} else if (rank == 5) {
			return "lavaBeast";
		} else if (rank == 6) {
			return "sorceress";
		} else if (rank == 7) {
			return "beastRider";
		} else if (rank == 8) {
			return "knight";
		} else if (rank == 9) {
			return "mage";
		} else {
			return "dragon";
		}

	}

	

}
