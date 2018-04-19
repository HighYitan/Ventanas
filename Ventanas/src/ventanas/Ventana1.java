package ventanas;
import java.awt.*;
import javax.swing.*;

public class Ventana1 extends JFrame{
    public Ventana1() {
        super("Titulo de ventana");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        FlowLayout fl = new FlowLayout();
        fl.setHgap(5); 
        fl.setVgap(5);
        cp.setLayout(fl);
        
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(50);
        JButton boton = new JButton("Saludar");
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }  
}
