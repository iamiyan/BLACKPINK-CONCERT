import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

//create class for totalPayment extends
public class total_payment extends JFrame {

	private JPanel contentPane;
	public JLabel lblTicketPrice;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textAmountPayed;


	/**
	 * Create the frame.
	 */
	public total_payment(double price, String name, String IC, double LSprice, double PCprice ,String seat ,double total, double balance, double amountPayed, String paymentMethod, String PCmember) {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 504);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
      //create new panel
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(239,141,174));//Setting background Color
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "PAYMENT INFORMATION    ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 153, 204)));
		panel.setBounds(10, 10, 662, 447);//Setting the size and location of the label
		contentPane.add(panel);
		panel.setLayout(null);
		
		//create new label for (TOTAL)
		JLabel lblTotal = new JLabel("TOTAL : ");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 30));//Setting font properties
		lblTotal.setForeground(new Color(239,141,174));//Setting foreground Color
		lblTotal.setBounds(332, 221, 133, 50);//Setting the size and location of the label
		panel.add(lblTotal);
		
		//create new label
		JLabel lblTotalDis = new JLabel("");
		lblTotalDis.setForeground(new Color(239,141,174));//Setting foreground Color
		lblTotalDis.setFont(new Font("Tahoma", Font.BOLD, 30));//Setting font properties
		lblTotalDis.setBounds(459, 221, 193, 50);//Setting the size and location of the label
		panel.add(lblTotalDis);
		
		//create new label for (TICKET PRICE)
		JLabel lblTicket = new JLabel("TICKET PRICE : ");
		lblTicket.setForeground(new Color(239,141,174));//Setting foreground Color
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 20));//Setting font properties
		lblTicket.setBounds(10, 22, 159, 50);//Setting the size and location of the label
		panel.add(lblTicket);
		
		//create new label for (RM)
		lblTicketPrice = new JLabel("RM" + formatter.format(price));
		lblTicketPrice.setForeground(new Color(239,141,174));//Setting foreground Color
		lblTicketPrice.setFont(new Font("Tahoma", Font.BOLD, 20));//Setting font properties
		lblTicketPrice.setBounds(179, 22, 159, 50);//Setting the size and location of the label
		panel.add(lblTicketPrice);
		
		//create new label for (LIGHTSTICK PRICE)
		JLabel lblLightstick = new JLabel("LIGHTSTICK PRICE : ");
		lblLightstick.setForeground(new Color(239,141,174));//Setting foreground Color
		lblLightstick.setFont(new Font("Tahoma", Font.BOLD, 20));//Setting font properties
		lblLightstick.setBounds(10, 82, 217, 50);//Setting the size and location of the label
		panel.add(lblLightstick);
		
		//create new label for (PHOTOCARD PRICE)
		JLabel lblPhotocard = new JLabel("PHOTOCARD PRICE : ");
		lblPhotocard.setForeground(new Color(239,141,174));//Setting foreground Color
		lblPhotocard.setFont(new Font("Tahoma", Font.BOLD, 20));//Setting font properties
		lblPhotocard.setBounds(10, 142, 217, 50);//Setting the size and location of the label
		panel.add(lblPhotocard);
		
		//create new label for (RM)
		JLabel lblLightstickPrice = new JLabel("RM" + formatter.format(LSprice));
		lblLightstickPrice.setForeground(new Color(239,141,174));//Setting foreground Color
		lblLightstickPrice.setFont(new Font("Tahoma", Font.BOLD, 20));//Setting font properties
		lblLightstickPrice.setBounds(237, 82, 159, 50);//Setting the size and location of the label
		panel.add(lblLightstickPrice);
		
		//create new label for (RM)
		JLabel lblPhotocardPrice = new JLabel("RM" + formatter.format(PCprice));
		lblPhotocardPrice.setForeground(new Color(239,141,174));//Setting foreground Color
		lblPhotocardPrice.setFont(new Font("Tahoma", Font.BOLD, 20));//Setting font properties
		lblPhotocardPrice.setBounds(237, 142, 159, 50);//Setting the size and location of the label
		panel.add(lblPhotocardPrice);
	
		//create a new panel 
		JPanel panelPaymentMethod = new JPanel();
		panelPaymentMethod.setBackground(Color.BLACK);//Setting background Color
		panelPaymentMethod.setBorder(new TitledBorder(null, "PAYMENT METHOD  ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(239,141,174)));
		panelPaymentMethod.setBounds(10, 221, 312, 216);//Setting the size and location of the label
		panel.add(panelPaymentMethod);
		panelPaymentMethod.setLayout(null);
		
		//create new RadioButton for (CASH)
		JRadioButton rdbtnCash = new JRadioButton("CASH");
		buttonGroup.add(rdbtnCash);
		rdbtnCash.setFont(new Font("Tahoma", Font.BOLD, 20));//Setting font properties
		rdbtnCash.setBackground(new Color(239,141,174));//Setting background Color
		rdbtnCash.setBounds(6, 40, 258, 45);//Setting the size and location of the label
		panelPaymentMethod.add(rdbtnCash);
		
		//create new RadioButton for (CREDIT/DEBIT)
		JRadioButton rdbtnCard = new JRadioButton("CREDIT/DEBIT");
		buttonGroup.add(rdbtnCard);
		rdbtnCard.setFont(new Font("Tahoma", Font.BOLD, 20));//Setting font properties
		rdbtnCard.setBackground(new Color(239,141,174));//Setting background Color
		rdbtnCard.setBounds(6, 87, 258, 45);//Setting the size and location of the label
		panelPaymentMethod.add(rdbtnCard);
		
		//create new RadioButton for (QRPAY)
		JRadioButton rdbtnQR = new JRadioButton("QRPAY");
		buttonGroup.add(rdbtnQR);
		rdbtnQR.setFont(new Font("Tahoma", Font.BOLD, 20));//Setting font properties
		rdbtnQR.setBackground(new Color(239,141,174));//Setting background Color
		rdbtnQR.setBounds(6, 134, 258, 45);//Setting the size and location of the label
		panelPaymentMethod.add(rdbtnQR);
		
		//create new TextField 
		textAmountPayed = new JTextField();
		textAmountPayed.setBounds(366, 304, 255, 24);//Setting the size and location of the label
		panel.add(textAmountPayed);
		textAmountPayed.setColumns(10);
		
		//create new Button (TOTAL)
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total = 0.0;
				
				total = price + LSprice + PCprice;
				
				if(rdbtnQR.isSelected()) {
					textAmountPayed.setText("" + formatter.format(total));
				}
				if(rdbtnCard.isSelected()) {
					textAmountPayed.setText("" + formatter.format(total));
				}
				if(rdbtnCash.isSelected()) {
					textAmountPayed.setText("");
				}
				
				lblTotalDis.setText("RM" + formatter.format(total));
				
				
			}
		});
		btnTotal.setBackground(new Color(239,141,174));//Setting background Color
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 20));//Setting font properties
		btnTotal.setBounds(385, 22, 267, 170);//Setting the size and location of the label
		panel.add(btnTotal);
		
		//create new Button (PAY)
		JButton btnPay = new JButton("PAY");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double total = 0.0;
				double balance = 0.0;
				double amountPayed = Double.parseDouble(textAmountPayed.getText());
				String paymentMethod = "";
				
				total = price + LSprice + PCprice;
				balance = amountPayed - total;
				
				if(rdbtnQR.isSelected()) {
					paymentMethod = "QRPAY";
				}
				if(rdbtnCard.isSelected()) {
					paymentMethod = "CREDIT/DEBIT CARD";
				}
				if(rdbtnCash.isSelected()) {
					paymentMethod = "CASH";
				}
				
				if(amountPayed < total) {
					JOptionPane.showMessageDialog(null, "AMOUNT PAID IS NOT ENOUGH", "ERROR", JOptionPane.ERROR_MESSAGE);
					
				}
				else {
				Receipt d = new Receipt(price, name, IC, LSprice, PCprice, seat ,total, balance, amountPayed, paymentMethod , PCmember);
				d.show();
				dispose();
				}
			}
		});
		btnPay.setFont(new Font("Tahoma", Font.BOLD, 30));//Setting font properties
		btnPay.setForeground(Color.BLACK);//Setting foreground Color
		btnPay.setBackground(new Color(239,141,174));//Setting background Color
		btnPay.setBounds(332, 381, 320, 56);//Setting the size and location of the label
		panel.add(btnPay);
		
		//Create new label for (AMOUNT TO BE PAYED)
		JLabel lblAmountToBe = new JLabel("AMOUNT TO BE PAYED : ");
		lblAmountToBe.setForeground(new Color(239, 141, 174));//Setting foreground Color
		lblAmountToBe.setFont(new Font("Tahoma", Font.BOLD, 14));//Setting font properties
		lblAmountToBe.setBounds(332, 281, 204, 24);//Setting the size and location of the label
		panel.add(lblAmountToBe);
		
		//Create new label for (RM)
		JLabel lblRm = new JLabel("RM");
		lblRm.setForeground(new Color(239, 141, 174));//Setting foreground Color
		lblRm.setFont(new Font("Tahoma", Font.BOLD, 14));//Setting font properties
		lblRm.setBounds(342, 304, 28, 24);//Setting the size and location of the label
		panel.add(lblRm);
		
		
	}
}
