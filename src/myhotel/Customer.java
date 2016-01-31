package myhotel;

import java.awt.EventQueue;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.mysql.fabric.xmlrpc.base.Array;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import static org.junit.Assert.*;


public class Customer {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer window = new Customer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Customer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("myhotel");
		frame.setBounds(100, 100, 708, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(76, 11, 102, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(10, 14, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblNewLabel = new JLabel("Room type");
		lblNewLabel.setBounds(10, 39, 63, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("View"); // NOPMD by jflem on 30/1/2016 2:33 ??
		lblNewLabel_1.setBounds(10, 67, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("room servise");
		lblNewLabel_2.setBounds(10, 92, 70, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel3 = new JLabel("late check in out");
		lblNewLabel3.setBounds(10, 116, 87, 14);
		frame.getContentPane().add(lblNewLabel3);
		
		JComboBox<?> comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u039C\u03BF\u03BD\u03BF\u03BA\u03BB\u03C5\u03BD\u03BF", "\u0394\u03AF\u03BA\u03BB\u03C5\u03BD\u03BF", "\u03A4\u03B5\u03C4\u03C1\u03AC\u03BA\u03BB\u03C5\u03BD\u03BF"}));
		comboBox.setToolTipText("yhhhhh");
		comboBox.setBounds(124, 42, 124, 20);
		frame.getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(124, 63, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(124, 88, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBounds(124, 112, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JLabel lblDate = new JLabel("date");
		lblDate.setBounds(10, 141, 46, 14);
		frame.getContentPane().add(lblDate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 141, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnOk = new JButton("ok"); // NOPMD by jflem on 30/1/2016 2:32 ??
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] properties = new String[6];
				
				//Initialize properties array.
				properties[0] = textField.getText();
				properties[1] = (String) comboBox.getSelectedItem();
				if( chckbxNewCheckBox.isSelected()){
					 properties[2] = "OK";
				}
				else{
					 properties[2] = "null";

				}
				if( chckbxNewCheckBox_1.isSelected()){
					 properties[3] = "OK";
				}
				else{
					 properties[3] = "null";

				}
				if( chckbxNewCheckBox_2.isSelected()){
					 properties[4] = "OK";
				}
				else{
					 properties[4] = "null";

				}
				properties[5] = textField_1.getText();
				
				Database.insert(properties);
			}
		});
		btnOk.setBounds(132, 195, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ( (textField_2.getText().equals("admin")) && (passwordField.getText().equals("admin")) ){
					//System.out.println("ok");
					Admin.setVisible();
				}
			}
		});
		btnLogIn.setBounds(500, 195, 89, 23);
		frame.getContentPane().add(btnLogIn);
		
		textField_2 = new JTextField();
		textField_2.setBounds(503, 113, 124, 17);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(500, 151, 127, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(401, 116, 80, 20);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(401, 154, 56, 17);
		frame.getContentPane().add(lblPassword);
		
		
		
	}
	
	//To do - Unit testing.
	public String returnName(){
	}
	}
}
