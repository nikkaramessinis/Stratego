package model;

import javax.swing.JButton;

/**
 * A piece that can't be moved
 * 
 * @author Nick Karamessinis csd3335
 * 
 */
public class ImmovablePiece implements Piece {
	private int position;

	/**
	 * variable move is set to false so it throws exception when you try to move
	 * it in the game
	 */
	public ImmovablePiece() {
	}

	/**
	 * returns position of Piece
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * sets position
	 */
	public void setPosition(int position) {
		this.position = position;

	}

	public void move(int first,int second,JButton b1,JButton b2) {//throw error
	}

	public void attack() {

	}
}
