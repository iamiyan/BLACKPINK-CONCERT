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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(239,141,174));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "PAYMENT INFORMATION    ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 153, 204)));
		panel.setBounds(10, 10, 662, 447);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTotal = new JLabel("TOTAL : ");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTotal.setForeground(new Color(239,141,174));
		lblTotal.setBounds(332, 221, 133, 50);
		panel.add(lblTotal);
		
		JLabel lblTotalDis = new JLabel("");
		lblTotalDis.setForeground(new Color(239,141,174));
		lblTotalDis.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTotalDis.setBounds(459, 221, 193, 50);
		panel.add(lblTotalDis);
		
		JLabel lblTicket = new JLabel("TICKET PRICE : ");
		lblTicket.setForeground(new Color(239,141,174));
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicket.setBounds(10, 22, 159, 50);
		panel.add(lblTicket);
		
		lblTicketPrice = new JLabel("RM" + formatter.format(price));
		lblTicketPrice.setForeground(new Color(239,141,174));
		lblTicketPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicketPrice.setBounds(179, 22, 159, 50);
		panel.add(lblTicketPrice);
		
		JLabel lblLightstick = new JLabel("LIGHTSTICK PRICE : ");
		lblLightstick.setForeground(new Color(239,141,174));
		lblLightstick.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLightstick.setBounds(10, 82, 217, 50);
		panel.add(lblLightstick);
		
		JLabel lblPhotocard = new JLabel("PHOTOCARD PRICE : ");
		lblPhotocard.setForeground(new Color(239,141,174));
		lblPhotocard.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhotocard.setBounds(10, 142, 217, 50);
		panel.add(lblPhotocard);
		
		JLabel lblLightstickPrice = new JLabel("RM" + formatter.format(LSprice));
		lblLightstickPrice.setForeground(new Color(239,141,174));
		lblLightstickPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLightstickPrice.setBounds(237, 82, 159, 50);
		panel.add(lblLightstickPrice);
		
		JLabel lblPhotocardPrice = new JLabel("RM" + formatter.format(PCprice));
		lblPhotocardPrice.setForeground(new Color(239,141,174));
		lblPhotocardPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhotocardPrice.setBounds(237, 142, 159, 50);
		panel.add(lblPhotocardPrice);
		
		JPanel panelPaymentMethod = new JPanel();
		panelPaymentMethod.setBackground(Color.BLACK);
		panelPaymentMethod.setBorder(new TitledBorder(null, "PAYMENT METHOD  ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(239,141,174)));
		panelPaymentMethod.setBounds(10, 221, 312, 216);
		panel.add(panelPaymentMethod);
		panelPaymentMethod.setLayout(null);
		
		JRadioButton rdbtnCash = new JRadioButton("CASH");
		buttonGroup.add(rdbtnCash);
		rdbtnCash.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnCash.setBackground(new Color(239,141,174));
		rdbtnCash.setBounds(6, 40, 258, 45);
		panelPaymentMethod.add(rdbtnCash);
		
		JRadioButton rdbtnCard = new JRadioButton("CREDIT/DEBIT");
		buttonGroup.add(rdbtnCard);
		rdbtnCard.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnCard.setBackground(new Color(239,141,174));
		rdbtnCard.setBounds(6, 87, 258, 45);
		panelPaymentMethod.add(rdbtnCard);
		
		JRadioButton rdbtnQR = new JRadioButton("QRPAY");
		buttonGroup.add(rdbtnQR);
		rdbtnQR.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnQR.setBackground(new Color(239,141,174));
		rdbtnQR.setBounds(6, 134, 258, 45);
		panelPaymentMethod.add(rdbtnQR);
		
		textAmountPayed = new JTextField();
		textAmountPayed.setBounds(366, 304, 255, 24);
		panel.add(textAmountPayed);
		textAmountPayed.setColumns(10);
		
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
		btnTotal.setBackground(new Color(239,141,174));
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTotal.setBounds(385, 22, 267, 170);
		panel.add(btnTotal);
		
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
		btnPay.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPay.setForeground(Color.BLACK);
		btnPay.setBackground(new Color(239,141,174));
		btnPay.setBounds(332, 381, 320, 56);
		panel.add(btnPay);
		
		JLabel lblAmountToBe = new JLabel("AMOUNT TO BE PAYED : ");
		lblAmountToBe.setForeground(new Color(239, 141, 174));
		lblAmountToBe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAmountToBe.setBounds(332, 281, 204, 24);
		panel.add(lblAmountToBe);
		
		JLabel lblRm = new JLabel("RM");
		lblRm.setForeground(new Color(239, 141, 174));
		lblRm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRm.setBounds(342, 304, 28, 24);
		panel.add(lblRm);
		
		
	}
}
