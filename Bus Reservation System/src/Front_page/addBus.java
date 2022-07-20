package Front_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class addBus extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblType;
	private JComboBox comboBox;
	private JLabel lblSpeed;
	private JSpinner spinner;
	private JLabel lblNewLabel_1;
	private JSpinner spinner_1;
	private JLabel lblBaseStation;
	private JComboBox comboBox_1;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JButton btnAdd;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addBus frame = new addBus();
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
	public addBus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BUS NAME : ");
		lblNewLabel.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblNewLabel.setBounds(35, 28, 130, 44);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(175, 23, 220, 49);
		contentPane.add(textField);
		
		lblType = new JLabel("TYPE : ");
		lblType.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblType.setBounds(492, 28, 130, 44);
		contentPane.add(lblType);
		
		String s1[] = {"AC" , "Non-AC"};
		comboBox = new JComboBox(s1);
		comboBox.setFont(new Font("Open Sans SemiBold", Font.BOLD, 15));
		comboBox.setBounds(603, 21, 77, 49);
		contentPane.add(comboBox);
		
		lblSpeed = new JLabel("SPEED (In km/hrs) : ");
		lblSpeed.setFont(new Font("Open Sans SemiBold", Font.BOLD, 17));
		lblSpeed.setBounds(35, 123, 179, 44);
		contentPane.add(lblSpeed);
		
		spinner = new JSpinner();
		spinner.setBounds(241, 129, 122, 40);
		contentPane.add(spinner);
		
		lblNewLabel_1 = new JLabel("NO OF SEATS : ");
		lblNewLabel_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblNewLabel_1.setBounds(443, 123, 167, 44);
		contentPane.add(lblNewLabel_1);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(603, 127, 122, 40);
		contentPane.add(spinner_1);
		
		lblBaseStation = new JLabel("BASE STATION : ");
		lblBaseStation.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblBaseStation.setBounds(47, 221, 167, 44);
		contentPane.add(lblBaseStation);
		
		String s2[] = {"CITY1" , "CITY2" , "----"};
		comboBox_1 = new JComboBox(s2);
		comboBox_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 15));
		comboBox_1.setBounds(241, 221, 152, 49);
		contentPane.add(comboBox_1);
		
		panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(0, 337, 843, 222);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_2 = new JLabel("Added \"BUS NAME\" , type \"AC\" , speed \" x km/hr \" , \"25\" seats , based at \"station1\"");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(99, 10, 667, 43);
		panel.add(lblNewLabel_2);
		
		btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		btnAdd.setBounds(505, 221, 175, 47);
		contentPane.add(btnAdd);
		
		lblNewLabel_3 = new JLabel("done / any error message");
		lblNewLabel_3.setFont(new Font("Open Sans SemiBold", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(231, 295, 310, 31);
		contentPane.add(lblNewLabel_3);
	}

}
