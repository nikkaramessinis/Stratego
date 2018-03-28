package view;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import model.Player;

/**
 * 
 * @author Nick Karamessinis csd3335
 * 
 */
public class View {
	private URL imageURL;
	private ClassLoader cldr;
	static Player p1;
	static Player p2;

	/*
	 * making board instance and calling buttons and listeners
	 */
	public View(Player p1, Player p2, ArrayList<JButton> table) {
		cldr = this.getClass().getClassLoader();
		for (int i = 0; i < 30; i++) {
			p1.Deck.get(i).setPosition(i);
			System.out.println("/RedPieces/" + p1.Deck.get(i) + "R.png");
			imageURL = cldr
					.getResource("RedPieces/" + p1.Deck.get(i) + "R.png");
			Image im = new ImageIcon(imageURL).getImage().getScaledInstance(80,
					100, Image.SCALE_SMOOTH);
			table.get(i).setIcon(new ImageIcon(im));

		}
		for (int i = 50; i < 80; i++) {
			
			int k = i - 50;
			p2.Deck.get(k).setPosition(k);
			if (p2.Deck.get(k).toString() == "lavaBeast") {
				imageURL = cldr.getResource("bluePieces/yeti.png");
			} else {
				imageURL = cldr.getResource("bluePieces/" + p2.Deck.get(k)
						+ "B.png");
			}
			Image im = new ImageIcon(imageURL).getImage().getScaledInstance(80,
					100, Image.SCALE_SMOOTH);

			table.get(i).setIcon(new ImageIcon(im));

		}
	}

	/*
	 * whenever doing an illegal move buzzing is triggered
	 */
	void buzzing() {
	}

}
