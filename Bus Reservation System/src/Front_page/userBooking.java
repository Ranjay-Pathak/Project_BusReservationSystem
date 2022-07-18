package Front_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class userBooking extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userBooking frame = new userBooking();
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
	public userBooking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("BUS BOOKING");
		rdbtnNewRadioButton.setFont(new Font("Open Sans SemiBold", Font.BOLD, 17));
		rdbtnNewRadioButton.setBounds(5, 5, 246, 52);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("PRIVATE CAB BOOKING");
		rdbtnNewRadioButton_2.setFont(new Font("Open Sans SemiBold", Font.BOLD, 18));
		rdbtnNewRadioButton_2.setBounds(307, 5, 246, 52);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("PICKUP POINT : ");
		lblNewLabel.setFont(new Font("Open Sans SemiBold", Font.BOLD, 14));
		lblNewLabel.setBounds(5, 74, 193, 37);
		contentPane.add(lblNewLabel);
		
		String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" };
		JComboBox comboBox = new JComboBox(s1);
		comboBox.setFont(new Font("Open Sans SemiBold", Font.BOLD, 12));
		comboBox.setBounds(149, 74, 115, 37);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("DROPPING POINT : ");
		lblNewLabel_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 14));
		lblNewLabel_1.setBounds(5, 140, 193, 37);
		contentPane.add(lblNewLabel_1);
		
		String s2[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" };
		JComboBox comboBox_1 = new JComboBox(s2);
		comboBox_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 12));
		comboBox_1.setBounds(191, 140, 115, 37);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("DATE : ");
		lblNewLabel_2.setFont(new Font("Open Sans SemiBold", Font.BOLD, 14));
		lblNewLabel_2.setBounds(5, 204, 50, 37);
		contentPane.add(lblNewLabel_2);
		
		String s3[] = { "1", "2", "3", "4", "5" , "6" , "7" , "8" , "9" , "10" , "11" , "12" , "13" , "14", "15" , "16" , "17" , "18" , "19" , "20", "21" , "22" , "23" , "24" , "25" , "26" , "27" , "28" , "29" , "30", "31"};
		JComboBox comboBox_2 = new JComboBox(s3);
		comboBox_2.setBounds(99, 213, 46, 21);
		contentPane.add(comboBox_2);
		
		String s4[] = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };
		JComboBox comboBox_2_1 = new JComboBox(s4);
		comboBox_2_1.setBounds(162, 213, 67, 21);
		contentPane.add(comboBox_2_1);
		
		String s5[] = { "2022" };
		JComboBox comboBox_2_2 = new JComboBox(s5);
		comboBox_2_2.setBounds(239, 213, 67, 21);
		contentPane.add(comboBox_2_2);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		btnNewButton.setBounds(191, 280, 175, 47);
		contentPane.add(btnNewButton);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
