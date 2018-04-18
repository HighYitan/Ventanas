package ventanas;
import java.awt.*;
import javax.swing.*;

public class Ventana1 extends JFrame implements ActionListener{
    int alineacion = FlowLayout.CENTER;
    int separacion;
    public Ventana1() {
        super("Titulo de ventana");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(50);
        JButton boton = new JButton("Saludar");
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
        
        /*Partida partida = new Partida(jugador1, jugador2);
        jugador1.setPartida(partida);
        jugador2.setPartida(partida)*/
    }  
    public interface ActionListener {
      public void actionPerformed(ActionEvent e)
    }
    public void actionPerformed(ActionEvent e){
        
    }
    public void addActionListener(ActionListener l){
        
    }
    public void setAlignment(int alineacion){
        this.alineacion = alineacion;
    }
    public void setHgap(int separacion){
        
    }
    public void setVgap(int separacion){
        
    }
}
