import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LightStick_PC extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroupLS = new ButtonGroup();
	private final ButtonGroup buttonGroupPC = new ButtonGroup();
	public JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public LightStick_PC(double price, String name, String IC, double LSprice, double PCprice, String seat) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 797);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JLabel lblNewLabel = new JLabel("DOES THE CUSTOMER ALSO WANT TO INCLUDE A LIGHTSTICK WITH THE PURCHASE? (5% OFF)");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setForeground(new Color(239,141,174));
		lblNewLabel.setBounds(10, 10, 593, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblLS = new JLabel("");
		Image lightstick = new ImageIcon(this.getClass().getResource("/lightstick.jpeg")).getImage();
		lblLS.setIcon(new ImageIcon(lightstick));
		lblLS.setBounds(165, 37, 169, 156);
		contentPane.add(lblLS);
		
		JRadioButton rdbtnYes = new JRadioButton("YES");
		buttonGroupLS.add(rdbtnYes);
		rdbtnYes.setBackground(new Color(239,141,174));
		rdbtnYes.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnYes.setForeground(new Color(0, 0, 0));
		rdbtnYes.setBounds(30, 199, 195, 21);
		contentPane.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("NO");
		buttonGroupLS.add(rdbtnNo);
		rdbtnNo.setBackground(new Color(239,141,174));
		rdbtnNo.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnNo.setBounds(283, 199, 200, 21);
		contentPane.add(rdbtnNo);
		
		JLabel lblaskPC1 = new JLabel("DOES THE CUSTOMER ALSO WANT THE LIMITED EDITION PHOTOCARD? ");
		lblaskPC1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblaskPC1.setForeground(new Color(239,141,174));
		lblaskPC1.setBounds(10, 226, 682, 13);
		contentPane.add(lblaskPC1);
		
		JLabel lblaskPC2 = new JLabel("(CAN ONLY CHOOSE ONE MEMBER PHOTOCARD PER CUSTOMER)");
		lblaskPC2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblaskPC2.setForeground(new Color(239,141,174));
		lblaskPC2.setBounds(10, 239, 682, 13);
		contentPane.add(lblaskPC2);
		
		JLabel lblJisoo = new JLabel("");
		Image jisoo = new ImageIcon(this.getClass().getResource("/jisoo.jpg")).getImage();
		lblJisoo.setIcon(new ImageIcon(jisoo));
		lblJisoo.setBounds(30, 262, 195, 195);
		contentPane.add(lblJisoo);
		
		JLabel lblJennie = new JLabel("");
		Image jennie = new ImageIcon(this.getClass().getResource("/jennie.jpg")).getImage();
		lblJennie.setIcon(new ImageIcon(jennie));
		lblJennie.setBounds(288, 262, 195, 195);
		contentPane.add(lblJennie);
		
		JLabel lblRose = new JLabel("");
		Image rose = new ImageIcon(this.getClass().getResource("/rose.jpg")).getImage();
		lblRose.setIcon(new ImageIcon(rose));
		lblRose.setBounds(70, 501, 140, 195);
		contentPane.add(lblRose);
		
		JLabel lblLisa = new JLabel("");
		Image lisa = new ImageIcon(this.getClass().getResource("/lisa.jpg")).getImage();
		lblLisa.setIcon(new ImageIcon(lisa));
		lblLisa.setBounds(321, 501, 140, 195);
		contentPane.add(lblLisa);
		
		JCheckBox chckbxJisoo = new JCheckBox("JISOO");
		buttonGroupPC.add(chckbxJisoo);
		chckbxJisoo.setBackground(new Color(239,141,174));
		chckbxJisoo.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxJisoo.setBounds(97, 463, 93, 21);
		contentPane.add(chckbxJisoo);
		
		JCheckBox chckbxJennie = new JCheckBox("JENNIE");
		buttonGroupPC.add(chckbxJennie);
		chckbxJennie.setBackground(new Color(239,141,174));
		chckbxJennie.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxJennie.setBounds(340, 463, 93, 21);
		contentPane.add(chckbxJennie);
		
		
		JCheckBox chckbxRose = new JCheckBox("ROSE'");
		buttonGroupPC.add(chckbxRose);
		chckbxRose.setBackground(new Color(239,141,174));
		chckbxRose.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxRose.setBounds(97, 702, 93, 21);
		contentPane.add(chckbxRose);
		
		JCheckBox chckbxLisa = new JCheckBox("LISA");
		buttonGroupPC.add(chckbxLisa);
		chckbxLisa.setBackground(new Color(239,141,174));
		chckbxLisa.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxLisa.setBounds(340, 702, 93, 21);
		contentPane.add(chckbxLisa);
		
		JButton btnProceed = new JButton("PROCEED");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double LSprice =  0.0;
				double PCprice = 0.0; 
				String PCmember = "";
				
				if (rdbtnYes.isSelected()) {
					LSprice = 170*0.95;
				}
				if (rdbtnNo.isSelected()) {
					LSprice = 0;
				}
				
				if (chckbxJisoo.isSelected()) {
					PCprice = 80.00;
					PCmember = "JISOO";
				}
				if (chckbxJennie.isSelected()) {
					PCprice = 80.00;
					PCmember = "JENNIE";
				}
				if (chckbxRose.isSelected()) {
					PCprice = 80.00;
					PCmember = "ROSE'";
				}
				if (chckbxLisa.isSelected()) {
					PCprice = 80.00;
					PCmember = "LISA";
				}
				
				double total = 0.0;
				double balance = 0.0;
				double amountPayed = 0.0;
				String paymentMethod = "";
				
				total_payment b = new total_payment(price, name, IC, LSprice, PCprice, seat, total, balance, amountPayed, paymentMethod , PCmember);
				b.show();
				dispose();
			}
		});
		btnProceed.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnProceed.setForeground(new Color(0, 0, 0));
		btnProceed.setBackground(Color.PINK);
		btnProceed.setBounds(188, 729, 146, 21);
		contentPane.add(btnProceed);
	
	}
}
