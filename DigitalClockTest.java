import java.util.Date;

public class DigitalClockTest extends Thread{
     DigitalClock dc;
     String time;
    
 public DigitalClockTest(DigitalClock dc){
        this.dc = dc;
        start();
    }
    
 public void run (){
        while(true){
            time = ""+ new Date();
            dc.jlabClock.setText(time);
        }
    }
}

