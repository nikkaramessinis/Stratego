package view;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Turn;
import model.Player;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * Makes Board and sets actionListeners
 * 
 * @author Nick Karamessinis csd3335
 * 
 */
public class Board {
	public ArrayList<JButton> table = new ArrayList<JButton>(80);
	public JFrame frame;
	public JButton jbut1, jbut2;
	public boolean but1Pressed = false;
	int temp;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Board(Player first, Player second) {
		initialize(first, second);
		@SuppressWarnings("unused")
		View b = new View(first, second, table);

		// ama evaza orismata ta first kai second

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final Player first, final Player second) {
		final Turn t = new Turn();
		frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(8, 10, 0, 0));
		frame.getContentPane().add(panel);
		frame.setSize(10 * 80, 8 * 100);
		frame.setResizable(false);
		for (int i = 0; i < 80; i++) {
			JButton btnNewButton = new JButton("");
			table.add(btnNewButton);

			final int k = i;
			/*
			 * ama ein to prwto button pou patietai ston guro tote markarete h
			 * eikona kai sto deutero metakinhte ama exei allh eikona ekei p
			 * paei energopoiei attack mallon xreiazetai pinaka gia na
			 * anapodogyrizw kartes otn ein h seira to enos h tou allou
			 */
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (but1Pressed == false) {// ama ein drakos kanei both or
						temp = k; // sth
						jbut1 = table.get(k);
						but1Pressed = true;
					} else {
						jbut2 = table.get(k);
						if (jbut2.getIcon() != null) {
							if (t.getTurn() == 1) {
								first.Deck.get(k).move(temp, k,
										table.get(temp), table.get(k));
							} else {second.Deck.get(k).move(temp, k,
									table.get(temp), table.get(k));
							}

						} else {// attacking

						}
					}
					t.changeturn();
					but1Pressed = false;
				}

			});

			panel.add(btnNewButton);
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
