
import java.awt.FlowLayout; 
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame{
    
    JLabel jlabClock;
    
    public DigitalClock(){
       jlabClock = new JLabel("");
       setLayout(new FlowLayout());
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       add(jlabClock);
       setSize(1200,120);
       setLocationRelativeTo(null);
       setVisible(true);
    }
    
    public static void main(String arr[]){
        new DigitalClock();
    }
}
