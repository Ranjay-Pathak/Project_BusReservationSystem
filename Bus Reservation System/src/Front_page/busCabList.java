package Front_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class busCabList extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					busCabList frame = new busCabList();
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
	public busCabList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 677, 144);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BUS_NUMBER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblNewLabel.setBounds(128, 0, 181, 60);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("(AC/NON-AC)");
		lblNewLabel_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 14));
		lblNewLabel_1.setBounds(303, 17, 107, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TIME1");
		lblNewLabel_2.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2.setBounds(180, 50, 63, 27);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("---");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(239, 54, 17, 21);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("TIME2");
		lblNewLabel_2_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(268, 47, 86, 32);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("COST : ");
		lblNewLabel_2_2.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(222, 98, 56, 36);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("SEATS AVAIL : ");
		lblNewLabel_2_3.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2_3.setBounds(180, 70, 119, 36);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_4 = new JLabel("(total time)");
		lblNewLabel_4.setBounds(331, 50, 97, 23);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("no");
		lblNewLabel_5.setBounds(320, 85, 45, 13);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Rs. SMTH");
		lblNewLabel_6.setBounds(294, 109, 71, 21);
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		btnNewButton.setBounds(463, 50, 119, 62);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 145, 677, 144);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_7 = new JLabel("BUS_NUMBER");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblNewLabel_7.setBounds(128, 0, 181, 60);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1_1 = new JLabel("(AC/NON-AC)");
		lblNewLabel_1_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(303, 17, 107, 33);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("TIME1");
		lblNewLabel_2_4.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2_4.setBounds(180, 50, 63, 27);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("---");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(239, 54, 17, 21);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("TIME2");
		lblNewLabel_2_1_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2_1_1.setBounds(268, 47, 86, 32);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("COST : ");
		lblNewLabel_2_2_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2_2_1.setBounds(222, 98, 56, 36);
		panel_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("SEATS AVAIL : ");
		lblNewLabel_2_3_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2_3_1.setBounds(180, 70, 119, 36);
		panel_1.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("(total time)");
		lblNewLabel_4_1.setBounds(331, 50, 97, 23);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("no");
		lblNewLabel_5_1.setBounds(320, 85, 45, 13);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Rs. SMTH");
		lblNewLabel_6_1.setBounds(294, 109, 71, 21);
		panel_1.add(lblNewLabel_6_1);
		
		JButton btnNewButton_1 = new JButton("BOOK");
		btnNewButton_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		btnNewButton_1.setBounds(463, 50, 119, 62);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 284, 677, 144);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_8 = new JLabel("BUS_NUMBER");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblNewLabel_8.setBounds(128, 0, 181, 60);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_1_2 = new JLabel("(AC/NON-AC)");
		lblNewLabel_1_2.setFont(new Font("Open Sans SemiBold", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(303, 17, 107, 33);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_5 = new JLabel("TIME1");
		lblNewLabel_2_5.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2_5.setBounds(180, 50, 63, 27);
		panel_2.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("---");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(239, 54, 17, 21);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("TIME2");
		lblNewLabel_2_1_2.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2_1_2.setBounds(268, 47, 86, 32);
		panel_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("COST : ");
		lblNewLabel_2_2_2.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2_2_2.setBounds(222, 98, 56, 36);
		panel_2.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("SEATS AVAIL : ");
		lblNewLabel_2_3_2.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		lblNewLabel_2_3_2.setBounds(180, 70, 119, 36);
		panel_2.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("(total time)");
		lblNewLabel_4_2.setBounds(331, 50, 97, 23);
		panel_2.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("no");
		lblNewLabel_5_2.setBounds(320, 85, 45, 13);
		panel_2.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("Rs. SMTH");
		lblNewLabel_6_2.setBounds(294, 109, 71, 21);
		panel_2.add(lblNewLabel_6_2);
		
		JButton btnNewButton_2 = new JButton("BOOK");
		btnNewButton_2.setFont(new Font("Open Sans SemiBold", Font.BOLD, 16));
		btnNewButton_2.setBounds(463, 50, 119, 62);
		panel_2.add(btnNewButton_2);
	}
}
