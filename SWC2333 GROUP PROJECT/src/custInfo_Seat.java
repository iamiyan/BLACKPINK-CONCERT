import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

//create class for custInfo seat
public class custInfo_Seat extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField ICtextField;
	/**
	 * Create the frame.
	 */
	
	public custInfo_Seat() {
		setTitle("BLACKPINK CONCERT"); //set title of the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 384); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0)); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
        // create new label (NAME)
		JLabel lblNameLabel = new JLabel("NAME");
		lblNameLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNameLabel.setForeground(new Color(239,141,174));
		lblNameLabel.setBounds(5, 10, 426, 13);
		contentPane.add(lblNameLabel);
		
		// create new textfield
		nameTextField = new JTextField(); 
		nameTextField.setForeground(Color.PINK);
		nameTextField.setBackground(Color.BLACK);
		nameTextField.setBounds(5, 22, 426, 19);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		// create new label (IC)
		JLabel lblICLabel = new JLabel("IC"); 
		lblICLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblICLabel.setForeground(new Color(239,141,174));
		lblICLabel.setBounds(5, 50, 45, 13);
		contentPane.add(lblICLabel);
		
		//create new textfield
		ICtextField = new JTextField(); 
		ICtextField.setForeground(Color.PINK);
		ICtextField.setBackground(Color.BLACK);
		ICtextField.setBounds(5, 62, 426, 19);
		contentPane.add(ICtextField);
		ICtextField.setColumns(10);
		
		//create new label (PREFERRED SEAT)
		JLabel lblSeatLabel = new JLabel("PREFERRED SEAT"); 
		lblSeatLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSeatLabel.setForeground(new Color(239,141,174));
		lblSeatLabel.setBounds(5, 91, 110, 13);
		contentPane.add(lblSeatLabel);
		
		// price according to seat color
		String seat[] = {"","YELLOW - RM1499.00","BLUE - RM1299.00","DARK GREEN - RM899.00","PINK - RM799.00","RED - RM699.00","MAGENTA - RM599.00","GREY - RM499.00","ORANGE - RM399.00", "LIGHT GREEN - RM299.00", "CYAN - RM199.00"};
		final JComboBox comboBox = new JComboBox(seat);
		comboBox.setBackground(Color.BLACK);
		comboBox.setForeground(new Color(239,141,174));
		comboBox.setBounds(5, 106, 426, 21);
		contentPane.add(comboBox);
		
		//create new panel
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setForeground(new Color(239,141,174));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CUSTOMER INFORMATION    ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 153, 204)));
		panel.setBounds(5, 154, 426, 103);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//create new label
		JLabel lblCustName = new JLabel(""); 
		lblCustName.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCustName.setForeground(new Color(255, 153, 204));
		lblCustName.setBounds(10, 21, 406, 13);
		panel.add(lblCustName);
		
		//create new label
		JLabel lblCustIC = new JLabel("");
		lblCustIC.setForeground(new Color(255, 153, 204));
		lblCustIC.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCustIC.setBounds(10, 44, 406, 13);
		panel.add(lblCustIC);
		
		//create new label
		JLabel lblCustSeat = new JLabel("");
		lblCustSeat.setForeground(new Color(255, 153, 204));
		lblCustSeat.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCustSeat.setBounds(10, 67, 406, 13);
		panel.add(lblCustSeat);
		
		//create new Button (OK)
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String custName = nameTextField.getText();
				String custIC = ICtextField.getText();
				String custSeat = (String)comboBox.getSelectedItem();
				
				lblCustName.setText("NAME : " + custName);
				lblCustIC.setText("IC NUMBER : " + custIC);
				lblCustSeat.setText("SEAT : " + custSeat);
				
			}
		});
		
		btnNewButton.setBackground(new Color(239,141,174));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(10, 298, 253, 39);
		contentPane.add(btnNewButton);
		
		//create new Jbutton (NEXT) 
		JButton btnOkButton = new JButton("NEXT");
		btnOkButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnOkButton.setBackground(new Color(239,141,174));
		btnOkButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String name = nameTextField.getText();
				String IC = ICtextField.getText();
				String seat = (String)comboBox.getSelectedItem();
				double price = 0.0;
				
				
				if (((String)comboBox.getSelectedItem()).equals("YELLOW - RM1499.00")){
					price = 1499.00;	
					seat = "YELLOW";
				}
				else if(((String)comboBox.getSelectedItem()).equals("BLUE - RM1299.00")) {
					price = 1299.00;		
					seat = "BLUE";
				}
				else if(((String)comboBox.getSelectedItem()).equals("DARK GREEN - RM899.00")) {					 
					price = 899.00;	
					seat = "DARK GREEN";
				}
				else if(((String)comboBox.getSelectedItem()).equals("PINK - RM799.00")) {					 
					price = 799.00;	
					seat = "PINK";
				}
				else if(((String)comboBox.getSelectedItem()).equals("RED - RM699.00")) {				 
					price = 699.00;	
					seat = "RED";
				}
				else if(((String)comboBox.getSelectedItem()).equals("MAGENTA - RM599.00")) {					 
					price = 599.00;
					seat = "MAGENTA";
				}	
				else if(((String)comboBox.getSelectedItem()).equals("GREY - RM499.00")) {					 
					price = 499.00;	
					seat = "GREY";
				}
				else if(((String)comboBox.getSelectedItem()).equals("ORANGE - RM399.00")) {					 
					price = 399.00;	
					seat = "ORANGE";
				}	
				else if(((String)comboBox.getSelectedItem()).equals("LIGHT GREEN - RM299.00")) {					 
					price = 299.00;
					seat = "LIGHT GREEEN";
				}
				else if(((String)comboBox.getSelectedItem()).equals("CYAN - RM199.00")) {					 
					price = 199.00;
					seat = "CYAN";
				}
	
				double LSprice = 0;
				double PCprice = 0;
				
				LightStick_PC a = new LightStick_PC(price, name, IC, LSprice, PCprice, seat);
				a.show();
				dispose();
			}
		});
		
		btnOkButton.setBounds(532, 298, 249, 39);
		contentPane.add(btnOkButton);
		
		//create new button (CLEAR)
		JButton btnCloseButton = new JButton("CLEAR");
		btnCloseButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCloseButton.setBackground(new Color(239,141,174));
		btnCloseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTextField.setText("");
				ICtextField.setText("");
				comboBox.setSelectedIndex(0);
				lblCustName.setText("");
				lblCustIC.setText("");
				lblCustSeat.setText("");
			}
		});
		
		btnCloseButton.setBounds(273, 298, 249, 39);
		contentPane.add(btnCloseButton);
		
		//create new label
		JLabel lblSeating = new JLabel("");
		Image seating = new ImageIcon(this.getClass().getResource("/seatingedited.png")).getImage();
		lblSeating.setIcon(new ImageIcon(seating));
		lblSeating.setBounds(452, 10, 377, 334);
		contentPane.add(lblSeating);
		
		
		
	}
}
