import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {

        JTextField newItem = new JTextField();

        JFrame frame = new JFrame();

        frame.setSize(300,300);
        frame.setVisible(true);
        frame.add(new HelloComponent());
      
        frame.add(newItem);
    
    }
}

class HelloComponent extends JComponent{
    public void paintComponent(Graphics g) {
        g.drawString("YO!", 125,95);
    }
}
