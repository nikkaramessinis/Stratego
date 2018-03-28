package model;

import javax.swing.JButton;

/**
 * Every card represents a Piece
 * 
 * @author Nick Karamessinis csd3335
 * 
 */
public interface Piece {

	public int getPosition();

	public void setPosition(int position);

	public void move(int first,int second, JButton jButton1, JButton jButton2);

	public void attack();
}
