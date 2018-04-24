package ventanas;
import java.awt.*;
import javax.swing.*;

public class Contenedor extends JFrame {
    public Contenedor(){
        super("wGetGUI v1.20 | You are using GNU Wget 1.9 beta - 1.7 "
                + "is minimum.");
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
      
        //restriccion.ipady = 100;
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
        restriccion.gridheight = 3;
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
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.gridheight = 2;
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
        
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.weightx = 0.9;
        restriccion.gridx = 1;
        restriccion.gridy = 1;
        restriccion.gridheight = 1;
        
        tab2.add(box4, restriccion);
        
        JPanel box5 = new JPanel();
        box5.setLayout(new BoxLayout(box5, BoxLayout.PAGE_AXIS));
        box5.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        
        JPanel gridCaja5 = new JPanel();
        GridBagLayout gridbag5 = new GridBagLayout();
        GridBagConstraints restriccion5 = new GridBagConstraints();
        gridCaja5.setLayout(gridbag5);
        box5.add(gridCaja5, restriccion5);
        restriccion.weightx = 0.5;
        restriccion.gridx = 2;
        restriccion.gridy = 1;
        
        tab2.add(box5, restriccion);
        
        JPanel box6 = new JPanel();
        box6.setLayout(new BoxLayout(box6, BoxLayout.PAGE_AXIS));
        box6.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        
        JPanel gridCaja6 = new JPanel();
        GridBagLayout gridbag6 = new GridBagLayout();
        GridBagConstraints restriccion6 = new GridBagConstraints();
        gridCaja6.setLayout(gridbag6);
        box6.add(gridCaja6, restriccion6);
        //restriccion.weighty = 0.5;
        restriccion.gridx = 1;
        restriccion.gridy = 2;
        restriccion.gridwidth = 2;
        
        gridCaja6.setBackground(Color.gray);
        tab2.add(box6, restriccion);
        
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
        restriccion1.insets = new Insets(0,10,10,10);
        gridCaja1.add(label1, restriccion1);
        restriccion1.insets = new Insets(20,10,10,10);
        gridCaja1.add(check1, restriccion1);
        String allow = "<html></body><b>Allow<br>List -></b></body></html>";
        JCheckBox check2 = new JCheckBox(allow);
        restriccion1.insets = new Insets(40,20,10,10);
        gridCaja1.add(check2, restriccion1);
        
        String reject = "<html></body><b>Reject<br>List -></b></body></html>";
        JCheckBox check3 = new JCheckBox(reject);
        restriccion1.gridx = 0;
        restriccion1.gridy = 1;
        restriccion1.insets = new Insets(0,20,45,10);
        gridCaja1.add(check3, restriccion1);
        
        JTextArea textoArea1 = new JTextArea();
        restriccion1.fill = GridBagConstraints.BOTH;
        restriccion1.insets = new Insets(5,0,5,10);
        restriccion1.weighty = 0.0;
        restriccion1.weightx = 0.5;
        restriccion1.gridx = 1;
        restriccion1.gridy = 0; 
        gridCaja1.add(textoArea1, restriccion1);
        
        JScrollPane rueda1 = new JScrollPane(textoArea1);
        rueda1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        rueda1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        gridCaja1.add(rueda1, restriccion1);
        
        JTextArea textoArea2 = new JTextArea();
        restriccion1.weighty = 3.5;
        restriccion1.weightx = 0.5;
        restriccion1.gridx = 1;
        restriccion1.gridy = 1; 
        gridCaja1.add(textoArea2, restriccion1);
        
        JScrollPane rueda2 = new JScrollPane(textoArea2);
        rueda2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        rueda2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        gridCaja1.add(rueda2, restriccion1);
        
        JButton boton1 = new JButton("Clear");
        restriccion1.ipady = 20;
        restriccion1.insets = new Insets(20,20,10,20);
        restriccion1.fill = GridBagConstraints.HORIZONTAL;
        restriccion1.gridwidth = 1;
        restriccion1.weightx = 0.0;
        restriccion1.weighty = 0.5;
        restriccion1.gridx = 2;
        restriccion1.gridy = 0;
        restriccion1.anchor = GridBagConstraints.PAGE_START;
        gridCaja1.add(boton1, restriccion1);
        
        JButton boton2 = new JButton("Clear");

        restriccion1.insets = new Insets(20,20,10,20);
        restriccion1.fill = GridBagConstraints.HORIZONTAL;
        restriccion1.gridwidth = 1;
        restriccion1.weightx = 0.0;
        restriccion1.weighty = 0.5;
        restriccion1.gridx = 2;
        restriccion1.gridy = 1;
        restriccion1.anchor = GridBagConstraints.PAGE_START;
        gridCaja1.add(boton2, restriccion1);
        
        //Creación de elementos de la segunda caja
        JLabel label2 = new JLabel("Retrieval Options");
        String deeper = "Only go deeper (-np)";
        JCheckBox check4 = new JCheckBox(deeper);
        check4.setSelected(true);
        restriccion2.fill = GridBagConstraints.HORIZONTAL;
        restriccion2.gridx = 0;
        restriccion2.gridy = 0;
        restriccion2.gridwidth = 1;
        restriccion2.weightx = 0.5;
        restriccion2.weighty = 0.5;
        restriccion2.anchor = GridBagConstraints.PAGE_START;
        restriccion2.insets = new Insets(10,10,10,10);
        gridCaja2.add(label2, restriccion2);
        restriccion2.insets = new Insets(30,10,10,10);
        gridCaja2.add(check4, restriccion2);
        
        String noClobber = "No clobber (-nc)";
        JCheckBox check5 = new JCheckBox(noClobber);
        check5.setSelected(true);
        restriccion2.gridx = 0;
        restriccion2.gridy = 1;
        restriccion2.insets = new Insets(0,10,10,10);
        gridCaja2.add(check5, restriccion2);
        
        String time = "Timestamping (-N)";
        JCheckBox check6 = new JCheckBox(time);
        restriccion2.gridx = 0;
        restriccion2.gridy = 2;
        gridCaja2.add(check6, restriccion2);
        
        JLabel label3 = new JLabel("Quota (-Q):");
        restriccion2.gridx = 0;
        restriccion2.gridy = 3;
        gridCaja2.add(label3, restriccion2);
        
        JTextField kilobytes = new JTextField("0");
        restriccion2.gridx = 1;
        restriccion2.gridy = 3;
        gridCaja2.add(kilobytes, restriccion2);
        
        JLabel label4 = new JLabel("(kB)");
        restriccion2.gridx = 2;
        restriccion2.gridy = 3;
        gridCaja2.add(label4, restriccion2);
        
        String continueFile = "Continue file download (-c)";
        JCheckBox check7 = new JCheckBox(continueFile);
        restriccion2.gridx = 0;
        restriccion2.gridy = 4;
        gridCaja2.add(check7, restriccion2);
        
        String html = "add HTML suffix (-E)";
        JCheckBox check8 = new JCheckBox(html);
        check8.setSelected(true);
        restriccion2.gridx = 0;
        restriccion2.gridy = 5;
        gridCaja2.add(check8, restriccion2);
        
        String noDirectories = "No directories (-nd)";
        JCheckBox check9 = new JCheckBox(noDirectories);
        restriccion2.gridx = 0;
        restriccion2.gridy = 6;
        gridCaja2.add(check9, restriccion2);
        
        String forceDirectories = "Force directories (-x)";
        JCheckBox check10 = new JCheckBox(forceDirectories);
        check10.setSelected(true);
        restriccion2.gridx = 0;
        restriccion2.gridy = 7;
        gridCaja2.add(check10, restriccion2);
        
        String customDir = "Save to custom dir (-P):";
        JCheckBox check11 = new JCheckBox(customDir);
        restriccion2.gridx = 0;
        restriccion2.gridy = 8;
        gridCaja2.add(check11, restriccion2);
        JTextField dir = new JTextField();
        restriccion2.insets = new Insets(30,10,10,10);
        gridCaja2.add(dir, restriccion2);
        
        String recursive = "<html><body><b>Recursive (-r)<br>with Depth (-l)"
                + "</b></body></html>";
        JCheckBox check12 = new JCheckBox(recursive);
        check12.setSelected(true);
        restriccion2.insets = new Insets(0,10,10,10);
        restriccion2.gridx = 0;
        restriccion2.gridy = 9;
        gridCaja2.add(check12, restriccion2);
        
        JTextField depth = new JTextField("0");
        restriccion2.insets = new Insets(10,10,10,10);
        restriccion2.gridx = 1;
        restriccion2.gridy = 9;
        gridCaja2.add(depth, restriccion2);
        
        String inline = "<html><body><b>Download with inline<br>objects (-p)"
                + "</b></body></html>";
        JCheckBox check13 = new JCheckBox(inline);
        check13.setSelected(true);
        restriccion2.insets = new Insets(0,10,10,10);
        restriccion2.gridx = 0;
        restriccion2.gridy = 10;
        gridCaja2.add(check13, restriccion2);
        
        String convert = "Convert links (-k)";
        JCheckBox check14 = new JCheckBox(convert);
        check14.setSelected(true);
        restriccion2.gridx = 0;
        restriccion2.gridy = 11;
        gridCaja2.add(check14, restriccion2);
        
        String mirror = "Mirror site (-m)";
        JCheckBox check15 = new JCheckBox(mirror);
        restriccion2.gridx = 0;
        restriccion2.gridy = 12;
        gridCaja2.add(check15, restriccion2);
        
        String clear = "Clear Server Cache";
        JCheckBox check16 = new JCheckBox(clear);
        restriccion2.gridx = 0;
        restriccion2.gridy = 13;
        gridCaja2.add(check16, restriccion2);
        
        String checkFiles = "Check for files(--spider)";
        JCheckBox check17 = new JCheckBox(checkFiles);
        restriccion2.gridx = 0;
        restriccion2.gridy = 14;
        gridCaja2.add(check17, restriccion2);
        
        //Creación de elementos de la tercera caja
        JLabel label5 = new JLabel("Accept/Reject");
        restriccion3.gridx = 0;
        restriccion3.gridy = 0;
        restriccion3.fill = GridBagConstraints.HORIZONTAL;
        restriccion3.gridwidth = 1;
        restriccion3.weightx = 0.5;
        restriccion3.weighty = 0.5;
        restriccion3.anchor = GridBagConstraints.PAGE_START;
        restriccion3.insets = new Insets(0,10,0,10);
        gridCaja3.add(label5, restriccion3);
        
        String accept = "Accept:";
        JRadioButton radio1 = new JRadioButton(accept);
        radio1.setSelected(true);
        restriccion3.gridx = 0;
        restriccion3.gridy = 1;
        gridCaja3.add(radio1, restriccion3);
        
        String rejected = "Reject:";
        JRadioButton radio2 = new JRadioButton(rejected);
        restriccion3.gridx = 1;
        restriccion3.gridy = 1;
        gridCaja3.add(radio2, restriccion3);
        
        String htm = "htm(l)";
        JCheckBox check18 = new JCheckBox(htm);
        check18.setSelected(true);
        check18.setEnabled(false);
        restriccion3.gridx = 0;
        restriccion3.gridy = 2;
        gridCaja3.add(check18, restriccion3);
        
        String gif = "gif";
        JCheckBox check19 = new JCheckBox(gif);
        check19.setSelected(true);
        check19.setEnabled(false);
        restriccion3.gridx = 1;
        restriccion3.gridy = 2;
        gridCaja3.add(check19, restriccion3);
        
        String jpg = "jpg";
        JCheckBox check20 = new JCheckBox(jpg);
        check20.setSelected(true);
        check20.setEnabled(false);
        restriccion3.gridx = 0;
        restriccion3.gridy = 3;
        gridCaja3.add(check20, restriccion3);
        
        String txt = "txt";
        JCheckBox check21 = new JCheckBox(txt);
        check21.setSelected(true);
        check21.setEnabled(false);
        restriccion3.gridx = 1;
        restriccion3.gridy = 3;
        gridCaja3.add(check21, restriccion3);
        
        String zip = "zip";
        JCheckBox check22 = new JCheckBox(zip);
        check22.setSelected(true);
        check22.setEnabled(false);
        restriccion3.gridx = 0;
        restriccion3.gridy = 4;
        gridCaja3.add(check22, restriccion3);
        
        String exe = "exe";
        JCheckBox check23 = new JCheckBox(exe);
        check23.setSelected(true);
        check23.setEnabled(false);
        restriccion3.gridx = 1;
        restriccion3.gridy = 4;
        gridCaja3.add(check23, restriccion3);
        
        String doc = "doc";
        JCheckBox check24 = new JCheckBox(doc);
        check24.setSelected(true);
        check24.setEnabled(false);
        restriccion3.gridx = 0;
        restriccion3.gridy = 5;
        gridCaja3.add(check24, restriccion3);
        
        String all = "All";
        JCheckBox check25 = new JCheckBox(all);
        check25.setSelected(true);
        restriccion3.gridx = 1;
        restriccion3.gridy = 5;
        gridCaja3.add(check25, restriccion3);
        
        JTextArea textoArea3 = new JTextArea();
        restriccion3.fill = GridBagConstraints.BOTH;
        restriccion3.insets = new Insets(0,10,10,10);
        restriccion3.gridx = 0;
        restriccion3.gridy = 6; 
        restriccion3.weighty = 1.5;
        restriccion3.gridheight = 2;
        gridCaja3.add(textoArea3, restriccion3);
        
        JScrollPane rueda3 = new JScrollPane(textoArea3);
        rueda3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        gridCaja3.add(rueda3, restriccion3);
        
        JLabel label6 = new JLabel("<html><body><b>Custom<br>List"
                + "</b></body></html>");
        restriccion3.gridx = 1;
        restriccion3.gridy = 6;
        restriccion3.gridheight = 1;
        restriccion3.fill = GridBagConstraints.HORIZONTAL;
        restriccion3.weighty = 0.5;
        gridCaja3.add(label6, restriccion3);
        
        JButton boton3 = new JButton("Clear");

        restriccion3.gridx = 1;
        restriccion3.gridy = 7;
        gridCaja3.add(boton3, restriccion3);
        
        //Creación de elementos de la cuarta caja
        JLabel label7 = new JLabel("Accept/Reject");
        restriccion4.gridx = 0;
        restriccion4.gridy = 0;
        restriccion4.fill = GridBagConstraints.HORIZONTAL;
        restriccion4.gridwidth = 1;
        restriccion4.weightx = 0.5;
        restriccion4.weighty = 0.5;
        restriccion4.anchor = GridBagConstraints.PAGE_START;
        restriccion4.insets = new Insets(0,10,0,10);
        gridCaja4.add(label7, restriccion4);
        
        JLabel label8 = new JLabel("Additional Parameters:");
        restriccion4.gridx = 0;
        restriccion4.gridy = 1;
        gridCaja4.add(label8, restriccion4);
        
        JTextField parametres = new JTextField();
        restriccion4.gridx = 0;
        restriccion4.gridy = 2;
        gridCaja4.add(parametres, restriccion4);
        
        String likeBrowser = "Act like a browser";
        JCheckBox check26 = new JCheckBox(likeBrowser);
        restriccion4.gridx = 0;
        restriccion4.gridy = 3;
        gridCaja4.add(check26, restriccion4);
        
        String robots = "Ignore robots.txt";
        JCheckBox check27 = new JCheckBox(robots);
        restriccion4.gridx = 0;
        restriccion4.gridy = 4;
        gridCaja4.add(check27, restriccion4);
        
        JLabel label9 = new JLabel("Retries:");
        restriccion4.gridx = 0;
        restriccion4.gridy = 5;
        gridCaja4.add(label9, restriccion4);
        
        JTextField retries = new JTextField("10");
        restriccion4.gridx = 1;
        restriccion4.gridy = 5;
        restriccion4.weightx = 3.0;
        gridCaja4.add(retries, restriccion4);
        
        JButton boton4 = new JButton("Configure Proxy");
        restriccion4.gridx = 0;
        restriccion4.gridy = 6;
        restriccion4.gridwidth = 2;
        gridCaja4.add(boton4, restriccion4);
        
        //Creación de elementos de la quinta caja
        JLabel label10 = new JLabel("Running & Logging");
        restriccion5.gridx = 0;
        restriccion5.gridy = 0;
        restriccion5.fill = GridBagConstraints.HORIZONTAL;
        restriccion5.gridwidth = 1;
        restriccion5.weightx = 0.5;
        restriccion5.weighty = 0.5;
        restriccion5.anchor = GridBagConstraints.PAGE_START;
        restriccion5.insets = new Insets(0,10,0,10);
        gridCaja5.add(label10, restriccion5);
        
        String background = "Go to background (-b)";
        JCheckBox check28 = new JCheckBox(background);
        restriccion5.gridx = 0;
        restriccion5.gridy = 1;
        gridCaja5.add(check28, restriccion5);
        
        String noInfo = "No info (-q)";
        JCheckBox check29 = new JCheckBox(noInfo);
        restriccion5.gridx = 0;
        restriccion5.gridy = 2;
        gridCaja5.add(check29, restriccion5);
        
        String allInfo = "All info (-v)";
        JCheckBox check30 = new JCheckBox(allInfo);
        restriccion5.gridx = 0;
        restriccion5.gridy = 3;
        gridCaja5.add(check30, restriccion5);
        
        String someInfo = "Some info (-nv)";
        JCheckBox check31 = new JCheckBox(someInfo);
        check31.setSelected(true);
        restriccion5.gridx = 0;
        restriccion5.gridy = 4;
        gridCaja5.add(check31, restriccion5);
        
        String append = "Append to logfile (-a)";
        JCheckBox check32 = new JCheckBox(append);
        restriccion5.gridx = 0;
        restriccion5.gridy = 5;
        gridCaja5.add(check32, restriccion5);
        
        String overwrite = "Overwrite Logfile (-o)";
        JCheckBox check33 = new JCheckBox(overwrite);
        restriccion5.gridx = 0;
        restriccion5.gridy = 6;
        gridCaja5.add(check33, restriccion5);
        
        JLabel label11 = new JLabel("Logfile:");
        restriccion5.gridx = 0;
        restriccion5.gridy = 7;
        gridCaja5.add(label11, restriccion5);
        
        JTextField logfile = new JTextField("default.log");
        restriccion5.gridx = 1;
        restriccion5.gridy = 7;
        gridCaja5.add(logfile, restriccion5);
        
        //Creación de elementos de la sexta(Última) caja (Caja invisible)
        JButton boton5 = new JButton("Add to wGetStart.bat");
        restriccion6.ipady = 20;
        restriccion6.gridx = 0;
        restriccion6.gridy = 0;
        restriccion6.fill = GridBagConstraints.HORIZONTAL;
        restriccion6.anchor = GridBagConstraints.PAGE_START;
        restriccion6.insets = new Insets(3,10,3,10);
        restriccion6.gridwidth = 1;
        restriccion6.weightx = 0.5;
        restriccion6.weighty = 0.5;
        gridCaja6.add(boton5, restriccion6);
        
        JButton boton6 = new JButton("Empty wGetStart.bat");
        restriccion6.gridx = 1;
        restriccion6.gridy = 0;
        gridCaja6.add(boton6, restriccion6);
        
        JButton boton7 = new JButton("Save settings");
        restriccion6.gridx = 0;
        restriccion6.gridy = 1;
        gridCaja6.add(boton7, restriccion6);
        
        JButton boton8 = new JButton("Load settings");
        restriccion6.gridx = 1;
        restriccion6.gridy = 1;
        gridCaja6.add(boton8, restriccion6);
        
        

        
        
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