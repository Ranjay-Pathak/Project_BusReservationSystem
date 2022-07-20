package Front_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class admin_options extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_options frame = new admin_options();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public admin_options() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD BUS");
		btnNewButton.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		btnNewButton.setBounds(139, 69, 193, 116);
		contentPane.add(btnNewButton);
		
		JButton btnRemoveBus = new JButton("REMOVE BUS");
		btnRemoveBus.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		btnRemoveBus.setBounds(546, 69, 193, 116);
		contentPane.add(btnRemoveBus);
		
		JButton btnAddCity = new JButton("ADD CITY");
		btnAddCity.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		btnAddCity.setBounds(139, 325, 193, 116);
		contentPane.add(btnAddCity);
		
		JButton btnRemoveCity = new JButton("REMOVE CITY");
		btnRemoveCity.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		btnRemoveCity.setBounds(546, 325, 193, 116);
		contentPane.add(btnRemoveCity);
	}
}
