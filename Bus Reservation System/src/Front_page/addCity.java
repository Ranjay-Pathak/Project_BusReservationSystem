package Front_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Scrollbar;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JButton;

public class addCity extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCity frame = new addCity();
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
	public addCity() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CITY NAME : ");
		lblNewLabel.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblNewLabel.setBounds(28, 41, 130, 44);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(168, 41, 220, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblConnectedWith = new JLabel("CONNECTED WITH");
		lblConnectedWith.setFont(new Font("Open Sans SemiBold", Font.BOLD, 25));
		lblConnectedWith.setBounds(314, 142, 253, 44);
		contentPane.add(lblConnectedWith);
		
		String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" };
		JComboBox comboBox = new JComboBox(s1);
		comboBox.setFont(new Font("Open Sans SemiBold", Font.BOLD, 14));
		comboBox.setBounds(49, 269, 143, 31);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("CITY NAME");
		lblNewLabel_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(28, 215, 190, 44);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("DISTANCE( IN Km)");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(286, 215, 190, 44);
		contentPane.add(lblNewLabel_1_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(309, 268, 143, 35);
		contentPane.add(spinner);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(518, 226, 373, 334);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Added \"CITY NAME\" , \"x KM\" away!!");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 28, 334, 43);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Open Sans SemiBold", Font.BOLD, 15));
		btnNewButton.setBounds(184, 361, 135, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CONFIRM");
		btnNewButton_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 15));
		btnNewButton_1.setBounds(425, 43, 130, 44);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("done / already exist!");
		lblNewLabel_2.setFont(new Font("Open Sans SemiBold", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(618, 56, 190, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("done / already exist!");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Open Sans SemiBold", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(150, 464, 190, 23);
		contentPane.add(lblNewLabel_2_1);
	}
}
