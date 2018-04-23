package ventanas;
import java.awt.*;
import javax.swing.*;

public class Botones extends JFrame{
    public Botones() {
        //super("Titulo de ventana");
        //setSize(800, 600);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Container cp = getContentPane();
        //FlowLayout fl = new FlowLayout();
        //fl.setHgap(5); 
        //fl.setVgap(5);
        //cp.setLayout(fl);
        
        //JLabel etiqueta = new JLabel("Nombre: ");
        //JTextField texto = new JTextField(50);
        //JButton boton = new JButton("Saludar");
        //cp.add(etiqueta);
        //cp.add(texto);
        //cp.add(boton);
        
        //super("Border Layout prueba");
        //setSize(1920, 1080);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //Container pane = getContentPane();
  
        //JButton button = new JButton("Button 1 (PAGE_START)");
        //button.setPreferredSize(new Dimension(200, 100));
        //pane.add(button, BorderLayout.PAGE_START);
        //button = new JButton("Button 2 (CENTER)");
        //button.setPreferredSize(new Dimension(400, 300));
        //pane.add(button, BorderLayout.CENTER);
        //button = new JButton("Button 3 (LINE_START)");
        //button.setPreferredSize(new Dimension(400, 300));
        //pane.add(button, BorderLayout.LINE_START);
        //button = new JButton("Long-Named Button 4 (PAGE_END)");
        //button.setPreferredSize(new Dimension(200, 100));
        //pane.add(button, BorderLayout.PAGE_END);
        //button = new JButton("5 (LINE_END)");
        //button.setPreferredSize(new Dimension(400, 300));
        //pane.add(button, BorderLayout.LINE_END);
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(new JButton("Aceptar"));
        panelBotones.add(new JButton("Cancelar"));
    }  
}
