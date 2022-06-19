
import javax.swing.*;
import java.awt.*;
 
public class LoadingScreen extends JFrame{
    JFrame frame;
    JLabel image = new JLabel(new ImageIcon(this.getClass().getResource("/poster.png")));
    JLabel text=new JLabel("WELCOME");
    JProgressBar progressBar = new JProgressBar();
    JLabel message=new JLabel();//Creating a JLabel for displaying the message
    
    LoadingScreen()
    {
        createGUI();
        addImage();
        addText();
        addProgressBar();
        addMessage();
        runningPBar();
    }
    public void createGUI(){
        frame=new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setVisible(true);
 
    }
    public void addImage(){
        image.setLocation(152, 27);
        image.setSize(272,214);
        frame.getContentPane().add(image);
    }
    public void addText()
    {
        text.setBackground(new Color(255, 105, 180));
        text.setFont(new Font("Rockwell", Font.BOLD, 30));
        text.setBounds(203,233,187,40);
        text.setForeground(new Color(239,141,174));
        frame.getContentPane().add(text);
    }
    public void addMessage()
    {
        message.setBounds(10,306,200,40);//Setting the size and location of the label
        message.setForeground(new Color(239,141,174));//Setting foreground Color
        message.setFont(new Font("arial",Font.BOLD,15));//Setting font properties
        frame.getContentPane().add(message);//adding label to the frame
    }
    public void addProgressBar(){
        progressBar.setBounds(10,356,580,16);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(new Color(239,141,174));
        frame.getContentPane().add(progressBar);
    }
    public void runningPBar(){
        int i=0;//Creating an integer variable and intializing it to 0
 
        while( i<=100)
        {
            try{
                Thread.sleep(20);//Pausing execution for 50 milliseconds
                progressBar.setValue(i);//Setting value of Progress Bar
                message.setText("LOADING " + ".....");//Setting text of the message JLabel
                i++;
                if(i==100)
                    frame.dispose();
            }catch(Exception e){
                e.printStackTrace();
            }
 
 
 
        }
    }
}