package model;

/**
 * if flag is captured game ends
 * 
 * @author Nick Karamessinis csd3335
 * 
 */
public class Flag extends ImmovablePiece implements Piece {
	boolean captured = false;

	/**
	 * 
	 * @pre -
	 * @post changes boolean captured to true
	 */
	void flagcapture() {
		captured = true;
	}

	public String toString() {
		return "flag";
	}
}
