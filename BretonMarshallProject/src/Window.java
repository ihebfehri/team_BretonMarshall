import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{

    private JPanel pan = new JPanel();
    private JButton printAL = new JButton("Print ArrayList");
    private JButton printHT = new JButton("Print HashTable");
    private JButton printHS = new JButton("Print HashSet");
    private JButton printUC = new JButton("Print UniversalCollector");
    private JLabel label = new JLabel("JLabel");
    public Window()
    {
        this.setTitle("Team Breton Marshall");
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        pan.add(printAL);
        pan.add(printHT);
        pan.add(printHS);
        pan.add(printUC);
        
        this.setContentPane(pan);
    }
}
