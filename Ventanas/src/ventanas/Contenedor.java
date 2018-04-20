package ventanas;
import java.awt.*;
import javax.swing.*;

public class Contenedor extends JFrame {
    
    public Contenedor(){
        super("Border Layout prueba");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Container pane = getContentPane();
        //setSize(1080, 720);
        JButton button = new JButton("Button 1 (PAGE_START)");
        button.setPreferredSize(new Dimension(200, 100));
        pane.add(button, BorderLayout.PAGE_START);
        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(400, 300));
        pane.add(button, BorderLayout.CENTER);
        button = new JButton("Button 3 (LINE_START)");
        button.setPreferredSize(new Dimension(400, 300));
        pane.add(button, BorderLayout.LINE_START);
        button = new JButton("Long-Named Button 4 (PAGE_END)");
        button.setPreferredSize(new Dimension(200, 100));
        pane.add(button, BorderLayout.PAGE_END);
        button = new JButton("5 (LINE_END)");
        button.setPreferredSize(new Dimension(400, 300));
        pane.add(button, BorderLayout.LINE_END);
    }
}