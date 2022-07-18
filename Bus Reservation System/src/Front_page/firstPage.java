package Front_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class firstPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstPage frame = new firstPage();
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
	public firstPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ADMIN");
		btnNewButton.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		btnNewButton.setBounds(484, 87, 150, 100);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RIDER");
		btnNewButton_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		btnNewButton_1.setBounds(484, 286, 150, 100);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("CAB AND BUS SERVICE");
		lblNewLabel.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 678, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("OUR REACH");
		lblNewLabel_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(10, 87, 208, 39);
		contentPane.add(lblNewLabel_1);
	}
}
