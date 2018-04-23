package ventanas;
import java.awt.*;
import javax.swing.*;

public class Contenedor extends JFrame {
    public Contenedor(){
        super("Contenedor de basura");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Container contenedor = getContentPane();
        botones(contenedor);
        //Creación de la plantilla para las tabulaciones
        JTabbedPane tabulaciones = new JTabbedPane();
        tab1(tabulaciones);
        tab2(tabulaciones);
        tab3(tabulaciones);
        contenedor.add(tabulaciones, BorderLayout.CENTER);
    }
    public void botones(Container contenedor){
        JPanel botones = new JPanel();
        botones.setLayout(new FlowLayout());
        JLabel titulo = new JLabel("<html><body><b><i>URL to<br>download:</i></b></body></html>");
        botones.add(titulo);
        JTextField texto = new JTextField(100);
        botones.add(texto);
        JButton botonguion = new JButton("-");
        botones.add(botonguion);
        JButton botonagarrar = new JButton("Start the grabbing!");
        botones.add(botonagarrar);
        JButton botonayuda = new JButton("?");
        botones.add(botonayuda);
        contenedor.add(botones, BorderLayout.NORTH);
    }
    public void tab1(JTabbedPane tabulaciones){
        tabulaciones.addTab("Simple", new JPanel());
    }
    public void tab2(JTabbedPane tabulaciones){
        tabulaciones.addTab("Standard", new JPanel());
    }
    public void tab3(JTabbedPane tabulaciones){
        //tabulaciones.setPreferredSize(new Dimension(1000, 200));
        //Creación de la tercera pestaña
        JPanel tab3 = new JPanel();
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints restriccion = new GridBagConstraints();
        tab3.setLayout(gridbag);
        
        //Los 6 botones con sus restricciones que van actualizandose
        JButton boton1 = new JButton("Add File");
        restriccion.ipady = 40;
        restriccion.insets = new Insets(10,10,10,10);
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        restriccion.gridwidth = 1;
        restriccion.weightx = 0.5;
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.anchor = GridBagConstraints.PAGE_START;
        tab3.add(boton1, restriccion);
        
        JButton boton2 = new JButton("Empty Textbox");
        restriccion.gridx = 1;
        restriccion.gridy = 0;
        tab3.add(boton2, restriccion);
        
        JButton boton3 = new JButton("wGetStart.bat = textbox");
        restriccion.gridx = 2;
        restriccion.gridy = 0;
        tab3.add(boton3, restriccion);
        
        JButton boton4 = new JButton("Add wGetStart.bat");
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        tab3.add(boton4, restriccion);
        
        JButton boton5 = new JButton("Empty wGetStart.bat");
        restriccion.gridx = 1;
        restriccion.gridy = 1; 
        tab3.add(boton5, restriccion);
        
        JButton boton6 = new JButton("wGetStart.bat = wGetStart.bat + textbox");
        
        restriccion.weighty = 0.5;
       
        restriccion.gridx = 2;
        restriccion.gridy = 1; 
        tab3.add(boton6, restriccion);
        
        //textArea del final
        JTextArea texto = new JTextArea();
        restriccion.anchor = GridBagConstraints.PAGE_START;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.gridwidth = 3;
        restriccion.insets = new Insets(10,10,50,10);
        restriccion.weightx = 1.0;
        restriccion.weighty = 10.0;
        restriccion.gridx = 0;
        restriccion.gridy = 2; 
        tab3.add(texto, restriccion);
        
        //Rueda para el textArea que hace scroll
        JScrollPane rueda = new JScrollPane(texto);
        rueda.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        rueda.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tab3.add(rueda, restriccion);
   
        //Creación de la tab3
        tabulaciones.addTab("direct .bat access", tab3);
    }
}