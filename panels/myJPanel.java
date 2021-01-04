
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


 
class myJPanel extends JPanel implements ActionListener
{
    JButton CM, OP, IN, CA, GB, GB1, GB2, GB3, GB4, GB5, cMap, instr, opt, cra;
    JLabel BGP, title;
    CampusPanel campusScreen;
    OptionsPanel optionPanel;
    InstructionsPanel instructionPanel;
    CreditsPanel creditPanel;
    GamePanel gamePanel;
    GamePanel1 gamePanel1;
    
    public myJPanel()
    {

        BuildintroScreen();
    }
        
        public void BuildintroScreen() 
        {
                
        //setBackground(Color.white);
        setLayout(null);
   

         // J - Creation *******************************************************
        CM = new JButton("Campus Map");
        OP = new JButton("Options");
        IN = new JButton("Instructions");
        CA = new JButton("Credits & About");
        GB = new javax.swing.JButton();
        GB.setForeground(Color.black);
        GB.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        GB.setText("Phone Home");
        add(GB);
        GB.setBounds(230, 260, 120, 30);
        GB.addActionListener(this);

        
        GB1 = new JButton("Phone Home");
        GB2 = new JButton("Phone Home");   
        GB3 = new JButton("Phone Home");
        GB4 = new JButton("Phone Home");
        GB5 = new JButton("Phone Home");
        campusScreen = new CampusPanel(GB, GB5);
        optionPanel = new OptionsPanel(GB1);
        instructionPanel = new InstructionsPanel(GB2);
        creditPanel = new CreditsPanel(GB3);
        gamePanel = new GamePanel(GB4);
      
        
        instr = new javax.swing.JButton();
        instr.setForeground(Color.black);
        instr.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        instr.setText("Instructions");
        add(instr);
        instr.setBounds(230, 260, 120, 30);
        instr.addActionListener(this);

        cMap = new javax.swing.JButton();
        cMap.setForeground(Color.black);
        cMap.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        cMap.setText("Campus Map");
        add(cMap);
        cMap.setBounds(340, 260, 120, 30);
        cMap.addActionListener(this);
        
        opt = new javax.swing.JButton();
        opt.setForeground(Color.black);
        opt.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        opt.setText("Options");
        add(opt);
        opt.setBounds(450, 260, 120, 30);
        opt.addActionListener(this);
        
        cra = new javax.swing.JButton();
        cra.setForeground(Color.black);
        cra.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        cra.setText("Credits & About");
        add(cra);
        cra.setBounds(570, 260, 130, 30);
        cra.addActionListener(this);

        

        title = new javax.swing.JLabel();
        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Helvetica", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("LOST IN SPACE ADVENTURE");
        add(title);
        title.setBounds(120, 180, 690, 100);
        
         // Add Parameters *****************************************************
        CM.setSize(120, 30);
        CM.setLocation(100, 500);
        GB.setSize(120, 30);
        GB1.setSize(120, 30);
        GB2.setSize(120, 30);
        GB3.setSize(120, 30);
        GB4.setSize(120, 30);
        GB5.setSize(120, 30);
        CM.addActionListener(this);
        OP.addActionListener(this);
        IN.addActionListener(this);
        CA.addActionListener(this);
        GB.addActionListener(this);
        GB1.addActionListener(this);
        GB2.addActionListener(this);
        GB3.addActionListener(this);
        GB4.addActionListener(this);
        GB5.addActionListener(this);
        OP.setSize(100,40);
        IN.setSize(125,40);
        CA.setSize(120, 40);
        OP.setLocation(360, 500);
        IN.setLocation(360, 500);
        CA.setLocation(360, 500);
        GB.setLocation(360,500);
        GB1.setLocation(360,500);
        GB2.setLocation(360,500);
        GB3.setLocation(360,500);
        GB4.setLocation(360,500);
        GB5.setLocation(360,500);
        campusScreen.setSize(1000, 600);
        optionPanel.setSize(1000, 600);
        instructionPanel.setSize(1000, 600);
        creditPanel.setSize(1000, 600);
        gamePanel.setSize(1000, 600);
        
        
        // Add Image
        BGP = new javax.swing.JLabel();
        BGP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/be0db3defec5f8054f3c7efb150187bf.jpg"))); // NOI18N
        BGP.setBounds(-60, -360, 1600, 1170);
        add(BGP);

        
        // Add Elements
        //**********************************************************************
        add(CM);
        add(OP);
        add(IN);
        add(CA);
        
    } 

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        
      Object obj = e.getSource();
        if(obj == cMap)
        {
            removeAll();
            add(campusScreen, "Center");
            validate();
            repaint();
           
        }
        if(obj == opt)
        {
            removeAll();
            repaint();
            add(optionPanel);
            repaint();
            validate();
        }
        if(obj == instr)
        {
            removeAll();
            repaint();
            add(instructionPanel);
            repaint();
            validate();
        }
        if(obj == cra)
        {
            removeAll();
            repaint();
            add(creditPanel);
            repaint();
            validate();
        }
        if(obj == GB)
        {
            remove(campusScreen);
            BuildintroScreen();
            repaint();
            validate();
            
        }
        if(obj == GB1)
        {
            remove(optionPanel);
            repaint();
            BuildintroScreen();
            repaint();
            validate();
            
        }
        if(obj == GB2)
        {
            remove(instructionPanel);
            repaint();
            BuildintroScreen(); 
            repaint();
            validate();
        }
             if(obj == GB3)
        {
            remove(creditPanel);
            repaint();
            BuildintroScreen();
            repaint();
            validate();
        }
             if(obj == GB4)
             {
            remove(gamePanel);
            repaint();
            BuildintroScreen();
            repaint();
            validate();
        }
              if(obj == GB5)
             {
            removeAll();
            repaint();
            BuildintroScreen();
            repaint();
            validate();
        }
    }         
}
    
