import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.text.DecimalFormat;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

//create class for Receipt
public class Receipt extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public Receipt (double price, String name, String IC, double LSprice, double PCprice ,String seat, double total, double balance, double amountPayed, String paymentMethod, String PCmember)  {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		setTitle("RECEIPT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 423);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        //Create new label
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(this.getClass().getResource("/blackPink.jpg")));
		lblNewLabel.setBounds(101, 10, 187, 81); 
		contentPane.add(lblNewLabel);
		
		//create new label
		JLabel lblDesign = new JLabel("====================================================");
		lblDesign.setForeground(new Color(239,141,174));
		lblDesign.setBounds(10, 90, 386, 13);
		contentPane.add(lblDesign);
		
		//create new label for (NAME)
		JLabel lblName = new JLabel("NAME : " + name);
		lblName.setForeground(new Color(239,141,174));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblName.setBounds(10, 101, 175, 13);
		contentPane.add(lblName);
		
		//create new label
		JLabel lblDesign_1 = new JLabel("====================================================");
		lblDesign_1.setForeground(new Color(239,141,174));
		lblDesign_1.setBounds(10, 365, 386, 13); 
		contentPane.add(lblDesign_1);
		
		//create new label for (IC)
		JLabel lblIC = new JLabel("IC : " + IC);
		lblIC.setForeground(new Color(239,141,174));
		lblIC.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblIC.setBounds(28, 124, 157, 13); 
		contentPane.add(lblIC);
		
		//create new label for (SEAT)
		JLabel lblSeat = new JLabel("SEAT : " + seat);
		lblSeat.setForeground(new Color(239,141,174));
		lblSeat.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSeat.setBounds(267, 101, 106, 13); 
		contentPane.add(lblSeat);
		
		//create new label
		JLabel lblDesign_1_1 = new JLabel("====================================================");
		lblDesign_1_1.setForeground(new Color(239,141,174));
		lblDesign_1_1.setBounds(10, 147, 386, 13); 
		contentPane.add(lblDesign_1_1);
		
		//create new label for (ITEMS)
		JLabel lblItems = new JLabel("ITEMS");
		lblItems.setForeground(new Color(239,141,174)); 
		lblItems.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblItems.setBounds(10, 157, 42, 13); 
		contentPane.add(lblItems);
		
		//create new label for (PRICE)
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setForeground(new Color(239,141,174)); 
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblPrice.setBounds(308, 157, 42, 13); 
		contentPane.add(lblPrice);
		
		//create new label
		JLabel lblDesign_1_1_1 = new JLabel("-------------------------------------------------------------------------------------------");
		lblDesign_1_1_1.setForeground(new Color(239,141,174)); 
		lblDesign_1_1_1.setBounds(10, 180, 366, 13); 
		contentPane.add(lblDesign_1_1_1);
		
		//create new label for (TICKET)
		JLabel lblTicket = new JLabel("TICKET (" + (seat) + ") : ");
		lblTicket.setForeground(new Color(239,141,174)); 
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblTicket.setBounds(10, 192, 168, 13); 
		contentPane.add(lblTicket);
		
		//create new label for (LIGHTSTICK)
		JLabel lblLSprice = new JLabel("LIGHTSTICK : ");
		lblLSprice.setForeground(new Color(239,141,174)); 
		lblLSprice.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblLSprice.setBounds(10, 215, 175, 13); 
		contentPane.add(lblLSprice);
		
		//create new label for (PHOTOCARD)
		JLabel lblPCprice = new JLabel("PHOTOCARD (" + PCmember + ") : ");
		lblPCprice.setForeground(new Color(239,141,174)); 
		lblPCprice.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblPCprice.setBounds(10, 238, 175, 13); 
		contentPane.add(lblPCprice);
		
		//create new label for(RM)
		JLabel lblTicketPrice = new JLabel("RM" + formatter.format(price));
		lblTicketPrice.setForeground(new Color(239,141,174)); 
		lblTicketPrice.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblTicketPrice.setBounds(308, 192, 68, 13); 
		contentPane.add(lblTicketPrice);
		
		//create new label for (RM)
		JLabel lblLightStickPrice = new JLabel("RM" + formatter.format(LSprice));
		lblLightStickPrice.setForeground(new Color(239,141,174)); 
		lblLightStickPrice.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblLightStickPrice.setBounds(308, 215, 68, 13); 
		contentPane.add(lblLightStickPrice);
		
		//create new label for(RM)
		JLabel lblPhotocardPrice = new JLabel("RM" + formatter.format(PCprice));
		lblPhotocardPrice.setForeground(new Color(239,141,174)); 
		lblPhotocardPrice.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblPhotocardPrice.setBounds(308, 238, 68, 13); 
		contentPane.add(lblPhotocardPrice);
		
		//create new label for (TOTAL)
		JLabel lblTotal = new JLabel("TOTAL : ");
		lblTotal.setForeground(new Color(239,141,174)); 
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblTotal.setBounds(10, 273, 168, 13); 
		contentPane.add(lblTotal);
		
		//create new label for (RM)
		JLabel lblTotalPrice = new JLabel("RM" + formatter.format(total));
		lblTotalPrice.setForeground(new Color(239,141,174)); 
		lblTotalPrice.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblTotalPrice.setBounds(308, 273, 68, 13); 
		contentPane.add(lblTotalPrice);
		
		//create new label
		JLabel lblDesign_1_1_1_1 = new JLabel("-------------------------------------------------------------------------------------------");
		lblDesign_1_1_1_1.setForeground(new Color(239,141,174)); 
		lblDesign_1_1_1_1.setBounds(10, 261, 366, 13); 
		contentPane.add(lblDesign_1_1_1_1);
		
		//create new label for (PAYMENT METHOD)
		JLabel lblPaymentMethod = new JLabel("PAYMENT METHOD : ");
		lblPaymentMethod.setForeground(new Color(239, 141, 174)); 
		lblPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblPaymentMethod.setBounds(10, 296, 168, 13); 
		contentPane.add(lblPaymentMethod);
		
		//create new label
		JLabel lblPayMethod = new JLabel("" + paymentMethod);
		lblPayMethod.setForeground(new Color(239, 141, 174)); 
		lblPayMethod.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblPayMethod.setBounds(270, 296, 106, 13); 
		contentPane.add(lblPayMethod);
		
		//create new label for (AMOUNT PAYED)
		JLabel lblAmountPayed = new JLabel("AMOUNT PAYED : ");
		lblAmountPayed.setForeground(new Color(239, 141, 174)); 
		lblAmountPayed.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblAmountPayed.setBounds(10, 319, 168, 13); 
		contentPane.add(lblAmountPayed);
		
		//create new label for (RM)
		JLabel lblPayedAmount = new JLabel("RM" + formatter.format(amountPayed));
		lblPayedAmount.setForeground(new Color(239, 141, 174)); 
		lblPayedAmount.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblPayedAmount.setBounds(308, 319, 68, 13); 
		contentPane.add(lblPayedAmount);
		
		//create new label for (BALANCE)
		JLabel lblBalance = new JLabel("BALANCE : ");
		lblBalance.setForeground(new Color(239, 141, 174)); 
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblBalance.setBounds(10, 342, 168, 13); 
		contentPane.add(lblBalance);
		
		//create new label for (RM)
		JLabel lblcustBal = new JLabel("RM" + formatter.format(balance));
		lblcustBal.setForeground(new Color(239, 141, 174)); 
		lblcustBal.setFont(new Font("Tahoma", Font.BOLD, 10)); 
		lblcustBal.setBounds(308, 346, 68, 13); 
		contentPane.add(lblcustBal);
		
		
	}
}
