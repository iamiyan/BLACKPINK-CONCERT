import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//create class for LoginPage
public class loginPage extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textUsername;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginPage frame = new loginPage();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginPage() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 404);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
        //create new label for (USERNAME)
		JLabel lblUsername = new JLabel("USERNAME : ");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblUsername.setForeground(new Color(239,141,174));
		lblUsername.setBounds(242, 155, 82, 13);
		contentPane.add(lblUsername);
		
		//create new PasswordField
		passwordField = new JPasswordField();
		passwordField.setBounds(322, 178, 160, 19);
		contentPane.add(passwordField);
		
		//create new label for (PASSWORD)
		JLabel lblPassword = new JLabel("PASSWORD :  ");
		lblPassword.setForeground(new Color(239, 141, 174));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPassword.setBounds(242, 181, 82, 13);
		contentPane.add(lblPassword);
		
		//create new TextField
		textUsername = new JTextField();
		textUsername.setBounds(322, 152, 160, 19);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		//create new Button for (LOGIN)
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//create staff ID
				
				String staffName = textUsername.getText();
				int password = Integer.parseInt(passwordField.getText());				
				
					if (staffName.equalsIgnoreCase("imran") && password == 461) {
						custInfo_Seat a = new custInfo_Seat();
						a.show();
						dispose();
					}
					else if (staffName.equalsIgnoreCase("ilyas") && password == 423) {	
						custInfo_Seat a = new custInfo_Seat();
						a.show();
						dispose();
					}
					else if (staffName.equalsIgnoreCase("zikry") && password == 523) {	
						custInfo_Seat a = new custInfo_Seat();
						a.show();
						dispose();
					}
					else if (staffName.equalsIgnoreCase("azib") && password == 973) {	
						custInfo_Seat a = new custInfo_Seat();
						a.show();
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Wrong Username or Password");
					}
					
				}
			});
		btnNewButton.setFont(new Font("Mongolian Baiti", Font.BOLD, 10));
		btnNewButton.setBackground(new Color(239, 141, 174));//Setting background Color
		btnNewButton.setBounds(332, 207, 85, 21);
		contentPane.add(btnNewButton);
			
	}
}

