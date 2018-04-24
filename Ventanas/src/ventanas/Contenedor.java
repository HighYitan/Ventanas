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
        //Contenedor de las tabs
        JPanel tabs = new JPanel();
        GridBagLayout gridBagTabs = new GridBagLayout();
        GridBagConstraints restriccionTabs = new GridBagConstraints();
        tabs.setLayout(gridBagTabs);
        contenedor.add(tabs, BorderLayout.CENTER);
        //Creación de la plantilla para las tabulaciones
        JTabbedPane tabulaciones = new JTabbedPane();
        restriccionTabs.ipady = 0;
        restriccionTabs.insets = new Insets(0,10,40,10);
        restriccionTabs.fill = GridBagConstraints.BOTH;
        restriccionTabs.gridwidth = 1;
        restriccionTabs.weightx = 0.5;
        restriccionTabs.weighty = 0.5;
        restriccionTabs.gridx = 0;
        restriccionTabs.gridy = 0;
        restriccionTabs.anchor = GridBagConstraints.CENTER;
        tabulaciones.setTabPlacement(JTabbedPane.TOP);
        tabs.add(tabulaciones, restriccionTabs);
        tab1(tabulaciones);
        tab2(tabulaciones);
        tab3(tabulaciones);
    }
    public void botones(Container contenedor){
        JPanel botones = new JPanel();
        botones.setLayout(new FlowLayout());
        JLabel titulo = new JLabel("<html><body><b><i>URL to<br>download:</i></b></body></html>");
        botones.add(titulo);
        JTextField texto = new JTextField(50);
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
        JPanel tab1 = new JPanel();
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints restriccion = new GridBagConstraints();
        tab1.setLayout(gridbag);
        
        JLabel label1 = new JLabel("<html><body><b>You can change the options for each URL"
                + " you add to the top textbox. If you have added all"
                + "<br>that you want to the job list, start the grabbing."
                + "</b></body></html>");
        restriccion.ipady = 40;
        restriccion.insets = new Insets(10,10,10,10);
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        restriccion.gridwidth = 4;
        restriccion.weightx = 0.5;
        restriccion.weighty = 0.5;
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.anchor = GridBagConstraints.PAGE_START;
        tab1.add(label1, restriccion);
        
        JButton boton1 = new JButton("<html><body><b>Empty the job list before"
                + "adding new<br><center>URLs</center></b></body></html>");
        restriccion.insets = new Insets(10,30,10,10);
        restriccion.gridwidth = 2;
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        tab1.add(boton1, restriccion);
        
        JLabel label2 = new JLabel("<html><body><b>Behaviour<br>" + 
                "&nbsp Do you want wget to be<br>&nbsp polite or aggresive?"
                + "</b></body></html>");
        restriccion.insets = new Insets(10,50,10,10);
        restriccion.gridwidth = 1;
        restriccion.gridx = 2;
        restriccion.gridy = 1;
        tab1.add(label2, restriccion);
        
        String polite = "polite";
        JRadioButton radio1 = new JRadioButton(polite);
        radio1.setSelected(true);
        restriccion.insets = new Insets(10,10,10,10);
        restriccion.gridx = 3;
        restriccion.gridy = 1;
        tab1.add(radio1, restriccion);
        
        String aggresive = "aggresive";
        JRadioButton radio2 = new JRadioButton(aggresive);
        restriccion.gridx = 4;
        restriccion.gridy = 1;
        tab1.add(radio2, restriccion);
        
        JLabel label3 = new JLabel("<html><body><b>Amount of the Download<br>" + 
                "When you enter a page<br>as starting URL, what do<br>you want"
                + " to download?</b></body></html>");
        restriccion.insets = new Insets(10,30,10,10);
        restriccion.gridx = 0;
        restriccion.gridy = 2;
        tab1.add(label3, restriccion);
        
        String single = "<html><body><b>single<br>page only</b></body></html>";
        JRadioButton radio3 = new JRadioButton(single);
        restriccion.gridx = 1;
        restriccion.gridy = 2;
        tab1.add(radio3, restriccion);
        
        String singleImages = "<html><body><b>single page with<br>images"
                + " and stuff</b></body></html>";
        JRadioButton radio4 = new JRadioButton(singleImages);
        radio4.setSelected(true);
        restriccion.gridx = 2;
        restriccion.gridy = 2;
        tab1.add(radio4, restriccion);
        
        String allPageStart = "<html><body><b>All pages on that server, if"
                + "<br>they are underneath the<br>start page</b></body></html>";
        JRadioButton radio5 = new JRadioButton(allPageStart);
        restriccion.insets = new Insets(10,0,10,10);
        restriccion.gridx = 3;
        restriccion.gridy = 2;
        tab1.add(radio5, restriccion);
        
        String allPages = "<html><body><b>All pages on<br>that server" + 
                "</b></body></html>";
        JRadioButton radio6 = new JRadioButton(allPages);
        restriccion.gridx = 4;
        restriccion.gridy = 2;
        tab1.add(radio6, restriccion);
        
        JLabel label4 = new JLabel("<html><body><b>Saving Location</b>"
                + "</body></html>");
        String thisDirectory = "<html><body><b>This directory</b></body></html>";
        JRadioButton radio7 = new JRadioButton(thisDirectory);
        restriccion.ipady = 0;
        restriccion.gridx = 0;
        restriccion.gridy = 3;
        restriccion.insets = new Insets(10,30,10,10);
        tab1.add(label4, restriccion);
        restriccion.insets = new Insets(30,30,10,10);
        tab1.add(radio7, restriccion);
        
        String likeServer = "<html><body><b>Named like the server</b>"
                + "</body></html>";
        JRadioButton radio8 = new JRadioButton(likeServer);
        restriccion.insets = new Insets(30,10,10,10);
        radio8.setSelected(true);
        restriccion.gridx = 1;
        restriccion.gridy = 3;
        tab1.add(radio8, restriccion);
        
        String custom = "<html><body><b>Custom Directory:</b>"
                + "</body></html>";
        JRadioButton radio9 = new JRadioButton(custom);
        restriccion.gridx = 2;
        restriccion.gridy = 3;
        restriccion.insets = new Insets(30,10,10,5);
        tab1.add(radio9, restriccion);
        
        JTextField directory = new JTextField();
        restriccion.gridx = 3;
        restriccion.gridy = 3;
        restriccion.gridwidth = 2;
        restriccion.insets = new Insets(30,0,10,30);
        tab1.add(directory, restriccion);
        
        JLabel label5 = new JLabel("<html><body><b>What to download?</b>"
                + "</body></html>");
        String youngFiles = "<html><body><b>only younger files"
                + "<br>than on my disk</b></body></html>";
        JRadioButton radio10 = new JRadioButton(youngFiles);
        restriccion.gridx = 0;
        restriccion.gridy = 4;
        restriccion.gridwidth = 1;
        restriccion.insets = new Insets(10,30,10,10);
        tab1.add(label5, restriccion);
        restriccion.insets = new Insets(30,30,10,10);
        tab1.add(radio10, restriccion);
        
        String filesNames = "<html><body><b>only files with names<br>"
                + "not yet in disk</b></body></html>";
        JRadioButton radio11 = new JRadioButton(filesNames);
        restriccion.insets = new Insets(30,10,10,10);
        radio11.setSelected(true);
        restriccion.gridx = 1;
        restriccion.gridy = 4;
        tab1.add(radio11, restriccion);
        
        String downloading = "<html><body><b>When downloading...<br>"
                + "...a single file: rename earlier file<br>"
                + "...many files: overwrite earlier files</b></body></html>";
        JRadioButton radio12 = new JRadioButton(downloading);
        restriccion.gridwidth = 3;
        restriccion.gridx = 2;
        restriccion.gridy = 4;
        tab1.add(radio12, restriccion);
        
        JLabel label6 = new JLabel("<html><body><b>Afterwards<br>After the"
                + "download, should wget<br>convert the links and filenames<br>"
                + "to make offline browsing easier?</b></body></html>");
        restriccion.insets = new Insets(10,30,10,10);
        restriccion.gridwidth = 1;
        restriccion.gridx = 0;
        restriccion.gridy = 5;
        tab1.add(label6, restriccion);
        
        String convert = "<html><body><b>convert</b></body></html>";
        JRadioButton radio13 = new JRadioButton(convert);
        radio13.setSelected(true);
        restriccion.insets = new Insets(10,10,10,10);
        restriccion.gridx = 1;
        restriccion.gridy = 5;
        tab1.add(radio13, restriccion);
        
        String convertBackup = "<html><body><b>convert but backup<br>"
                + "the original files</b></body></html>";
        JRadioButton radio14 = new JRadioButton(convertBackup);
        restriccion.gridx = 2;
        restriccion.gridy = 5;
        tab1.add(radio14, restriccion);
        
        String noConvert = "<html><body><b>Don't convert</b></body></html>";
        JRadioButton radio15 = new JRadioButton(noConvert);
        restriccion.gridwidth = 2;
        restriccion.gridx = 3;
        restriccion.gridy = 5;
        tab1.add(radio15, restriccion);
        
        JButton boton2 = new JButton("Add the URL with these options"
                + "to the job list");
        restriccion.ipady = 40;
        restriccion.gridwidth = 3;
        restriccion.gridx = 0;
        restriccion.gridy = 6;
        restriccion.insets = new Insets(10,70,10,70);
        tab1.add(boton2, restriccion);
        
        JButton boton3 = new JButton("Start the Grabbing!");
        restriccion.gridwidth = 2;
        restriccion.gridx = 3;
        restriccion.gridy = 6;
        tab1.add(boton3, restriccion);
        tabulaciones.addTab("Simple", tab1);
    }
    public void tab2(JTabbedPane tabulaciones){
        JPanel tab2 = new JPanel();
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints restriccion = new GridBagConstraints();
        tab2.setLayout(gridbag);
        //Creación de cajas
        JPanel box1 = new JPanel();
        box1.setLayout(new BoxLayout(box1, BoxLayout.PAGE_AXIS));
        box1.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        //GridBagLayout interno de la primera caja "box1"
        JPanel gridCaja1 = new JPanel();
        GridBagLayout gridbag1 = new GridBagLayout();
        GridBagConstraints restriccion1 = new GridBagConstraints();
        gridCaja1.setLayout(gridbag1);
        box1.add(gridCaja1, restriccion1);
      
        restriccion.ipady = 100;
        restriccion.insets = new Insets(10,10,10,10);
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        restriccion.gridwidth = 3;
        restriccion.weightx = 0.5;
        restriccion.weighty = 0.5;
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.anchor = GridBagConstraints.PAGE_START;
        //Añadimos un BoxLayout dentro de mi gridLayout contenedor principal
        tab2.add(box1, restriccion);
        
        JPanel box2 = new JPanel();
        box2.setLayout(new BoxLayout(box2, BoxLayout.PAGE_AXIS));
        box2.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        
        JPanel gridCaja2 = new JPanel();
        GridBagLayout gridbag2 = new GridBagLayout();
        GridBagConstraints restriccion2 = new GridBagConstraints();
        gridCaja2.setLayout(gridbag2);
        box2.add(gridCaja2, restriccion2);
        
        restriccion.gridwidth = 1;
        restriccion.gridheight = 2;
        restriccion.gridx = 3;
        restriccion.gridy = 0;
        restriccion.fill = GridBagConstraints.BOTH;
        
        tab2.add(box2, restriccion);
        
        JPanel box3 = new JPanel();
        box3.setLayout(new BoxLayout(box3, BoxLayout.PAGE_AXIS));
        box3.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        
        JPanel gridCaja3 = new JPanel();
        GridBagLayout gridbag3 = new GridBagLayout();
        GridBagConstraints restriccion3 = new GridBagConstraints();
        gridCaja3.setLayout(gridbag3);
        box3.add(gridCaja3, restriccion3);
      
        restriccion.insets = new Insets(10,10,10,10);
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        restriccion.weightx = 0.5;
        restriccion.weighty = 10.0;
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        restriccion.anchor = GridBagConstraints.PAGE_START;
        
        tab2.add(box3, restriccion);
        
        JPanel box4 = new JPanel();
        box4.setLayout(new BoxLayout(box4, BoxLayout.PAGE_AXIS));
        box4.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        
        JPanel gridCaja4 = new JPanel();
        GridBagLayout gridbag4 = new GridBagLayout();
        GridBagConstraints restriccion4 = new GridBagConstraints();
        gridCaja4.setLayout(gridbag4);
        box4.add(gridCaja4, restriccion4);
        
        restriccion.gridx = 1;
        restriccion.gridy = 1;
        
        tab2.add(box4, restriccion);
        
        JPanel box5 = new JPanel();
        box5.setLayout(new BoxLayout(box5, BoxLayout.PAGE_AXIS));
        box5.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        
        JPanel gridCaja5 = new JPanel();
        GridBagLayout gridbag5 = new GridBagLayout();
        GridBagConstraints restriccion5 = new GridBagConstraints();
        gridCaja5.setLayout(gridbag5);
        box5.add(gridCaja5, restriccion5);
        //restriccion.weighty = 0.5;
        restriccion.gridx = 2;
        restriccion.gridy = 1;
        
        tab2.add(box5, restriccion);
        
        //Creación de elementos de la primera caja
        JLabel label1 = new JLabel("Hosts");
        String span = "Span All";
        JCheckBox check1 = new JCheckBox(span);
        restriccion1.fill = GridBagConstraints.HORIZONTAL;
        restriccion1.gridx = 0;
        restriccion1.gridy = 0;
        restriccion1.gridwidth = 1;
        restriccion1.weightx = 0.1;
        restriccion1.weighty = 0.5;
        restriccion1.anchor = GridBagConstraints.PAGE_START;
        restriccion1.insets = new Insets(10,10,10,10);
        gridCaja1.add(label1, restriccion1);
        restriccion1.insets = new Insets(30,10,10,10);
        gridCaja1.add(check1, restriccion1);
        String allow = "<html></body><b>Allow<br>List -></b></body></html>";
        JCheckBox check2 = new JCheckBox(allow);
        restriccion1.insets = new Insets(50,20,10,10);
        gridCaja1.add(check2, restriccion1);
        
        String reject = "<html></body><b>Reject<br>List -></b></body></html>";
        JCheckBox check3 = new JCheckBox(reject);
        restriccion1.gridx = 0;
        restriccion1.gridy = 1;
        restriccion1.insets = new Insets(10,10,10,10);
        gridCaja1.add(check3, restriccion1);
        
        JTextArea textoArea1 = new JTextArea();
        restriccion1.fill = GridBagConstraints.BOTH;
        restriccion1.insets = new Insets(10,0,10,10);
        restriccion1.gridx = 1;
        restriccion1.gridy = 0; 
        gridCaja1.add(textoArea1, restriccion1);
        
        JScrollPane rueda1 = new JScrollPane(textoArea1);
        rueda1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        rueda1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        gridCaja1.add(rueda1, restriccion1);
        
        JTextArea textoArea2 = new JTextArea();
        restriccion1.gridx = 1;
        restriccion1.gridy = 1; 
        restriccion1.fill = GridBagConstraints.BOTH;
        gridCaja1.add(textoArea2, restriccion1);
        
        JScrollPane rueda2 = new JScrollPane(textoArea2);
        rueda2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        rueda2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        gridCaja1.add(rueda2, restriccion1);
        
        JButton boton1 = new JButton("Clear");
        restriccion1.ipady = 40;
        restriccion1.insets = new Insets(50,20,10,20);
        restriccion1.fill = GridBagConstraints.HORIZONTAL;
        restriccion1.gridwidth = 1;
        restriccion1.weightx = 0.0;
        restriccion1.weighty = 0.5;
        restriccion1.gridx = 2;
        restriccion1.gridy = 0;
        restriccion1.anchor = GridBagConstraints.PAGE_START;
        gridCaja1.add(boton1, restriccion1);
        
        JButton boton2 = new JButton("Clear");

        restriccion1.insets = new Insets(50,20,10,20);
        restriccion1.fill = GridBagConstraints.HORIZONTAL;
        restriccion1.gridwidth = 1;
        restriccion1.weightx = 0.0;
        restriccion1.weighty = 0.5;
        restriccion1.gridx = 2;
        restriccion1.gridy = 1;
        restriccion1.anchor = GridBagConstraints.PAGE_START;
        gridCaja1.add(boton2, restriccion1);
        
        
        
        
        tab2.setBackground(Color.gray);
        tabulaciones.addTab("Standard", tab2);
        
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
        restriccion.insets = new Insets(10,10,0,10);
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
        restriccion.insets = new Insets(0,10,10,10);
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
        tab3.setBackground(Color.gray);
        tabulaciones.addTab("direct .bat access", tab3);
    }
}