package controller;

import java.awt.EventQueue;
import java.util.Collections;
import view.Board;
import model.Bomb;
import model.Dwarf;
import model.Flag;
import model.MoveablePiece;
import model.Player;

/**
 * Unites all functions from Model and View so that the program can work
 * properly making instances for Board/Cards/Players initiating Turn with rand
 * and set Cards in deck either randomly or by view with listeners
 * 
 * @author Nick Karamessinis csd3335
 * 
 */
public class Controller {
	public static void main(String[] args) {
		final Player first = new Player();
		final Player second = new Player();
		DeckMaker(first);
		DeckMaker(second);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board a = new Board(first, second);
					a.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Making a Deck for particular player ,adds Cards in Players
	 * Deck(arraylist) and finally shuffling the deck
	 * 
	 * @param p
	 */
	static void DeckMaker(Player p) {
		for (int i = 0; i < 6; i++) {
			Bomb bomb = new Bomb();
			p.Deck.add(bomb);
		}
		MoveablePiece Mage = new MoveablePiece(9);
		MoveablePiece Dragon = new MoveablePiece(10);
		MoveablePiece Slayer = new MoveablePiece(1);
		Flag Flag = new Flag();
		p.Deck.add(Dragon);
		p.Deck.add(Mage);
		p.Deck.add(Slayer);
		p.Deck.add(Flag);
		for (int i = 0; i < 2; i++) {
			MoveablePiece Sorceress = new MoveablePiece(6);
			MoveablePiece Knight = new MoveablePiece(8);
			MoveablePiece LavaBeastYeti = new MoveablePiece(5);
			MoveablePiece Elf = new MoveablePiece(4);
			p.Deck.add(LavaBeastYeti);
			p.Deck.add(Knight);
			p.Deck.add(Sorceress);
			p.Deck.add(Elf);
		}
		for (int i = 0; i < 4; i++) {
			MoveablePiece Scout = new MoveablePiece(2);
			p.Deck.add(Scout);
		}
		for (int i = 0; i < 3; i++) {
			MoveablePiece BeastRider = new MoveablePiece(7);
			p.Deck.add(BeastRider);
		}
		for (int i = 0; i < 5; i++) {
			Dwarf Dwarf = new Dwarf(3);
			p.Deck.add(Dwarf);
		}
		Collections.shuffle(p.Deck);
	}
}
