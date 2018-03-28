package controller;

/**
 * initiates turn to 0 so player1's turn is first Also is responsible to change
 * turns when a player moved he's piece
 * 
 * @author Nick Karamessinis csd3335
 * 
 */
public class Turn {
	private int turn;

	public Turn() {
		turn = 1;
	}

	/**
	 * 
	 * @pre a piece should first be moved to trigger changeturn
	 * @post calls a method to hide buttons and enable other buttons to be
	 *       played
	 */
	public void changeturn() {
		if (turn == 1) {
			turn = 2;
		} else {
			turn = 1;
		}
	}

	/**
	 * accessor
	 * 
	 * @pre -
	 * @post returns turn variable
	 */
	public int getTurn() {
		return turn;
	}

	/**
	 * 
	 * @pre turn must be 0 or 1
	 * @post this.turn is set
	 * @param turn
	 */
	public void setTurn(int turn) {
		this.turn = turn;
	}

}
