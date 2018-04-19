package ventanas;
import java.awt.*;
import javax.swing.*;

public class Contenedor extends JFrame {
    
    public Contenedor(){
        Container pane = getContentPane();
        JButton button = new JButton("Button 1 (PAGE_START)");
        pane.add(button, BorderLayout.PAGE_START);
        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(400, 300));
        pane.add(button, BorderLayout.CENTER);
        button = new JButton("Button 3 (LINE_START)");
        pane.add(button, BorderLayout.LINE_START);
        button = new JButton("Long-Named Button 4 (PAGE_END)");
        pane.add(button, BorderLayout.PAGE_END);
        button = new JButton("5 (LINE_END)");
        pane.add(button, BorderLayout.LINE_END);
    }
}