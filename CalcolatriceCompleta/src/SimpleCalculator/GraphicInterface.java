package SimpleCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicInterface
{
    private static JLabel ris = new JLabel("0", JLabel.RIGHT);
    private static boolean state = false;
    public static void Start()
    {
        System.out.println("Initializing interface");
        JFrame f = new JFrame("Calculator");
        Container container = f.getContentPane();
        f.setSize(400,600);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel p0 = new Panel(new BorderLayout());
        Panel p1 = new Panel(new GridLayout(4, 4));
        f.add(p0);
        p0.add(ris, BorderLayout.NORTH);
        Font font = new Font("Arial", Font.PLAIN, 40);
        ris.setFont(font);
        p0.add(p1, BorderLayout.CENTER);
        for(int i = 9; i >= 0; i--)
        {
            if(i == 0)
            {
                JButton b = new JButton(".");
                p1.add(b);
                b.setFont(font);
                b.setActionCommand(".");
                b.addActionListener(new ButtonListener());
            }
            JButton b = new JButton("" + i);
            p1.add(b);
            b.setFont(font);
            b.setActionCommand(""+i);
            b.addActionListener(new ButtonListener());
        }
        JButton b = new JButton("+");
        p1.add(b);
        b.setFont(font);
        b.setActionCommand("+");
        b.addActionListener(new ButtonListener());
        
        JButton b2 = new JButton("-");
        p1.add(b2);
        b2.setFont(font);
        b2.setActionCommand("-");
        b2.addActionListener(new ButtonListener());
        
        JButton b3 = new JButton("x");
        p1.add(b3);
        b3.setFont(font);
        b3.setActionCommand("x");
        b3.addActionListener(new ButtonListener());
        
        JButton b4 = new JButton("/");
        p1.add(b4);
        b4.setFont(font);
        b4.setActionCommand("/");
        b4.addActionListener(new ButtonListener());
        
        JButton b1 = new JButton("=");
        p1.add(b1);
        b1.setFont(font);
        b1.addActionListener(new ResultListener());
        System.out.println("Finished");
    }
    
    public static void setText(String t)
    {
        ris.setText(t);
    }
    
    public static String getText()
    {
        return ris.getText();
    }

    public static void setState(boolean a)
    {
        state = a;
    }
    
    public static boolean getState()
    {
        return state;
    }
    
}
