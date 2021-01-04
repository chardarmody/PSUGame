
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CampusPanel extends JPanel implements ActionListener
{
    
        JButton BV1, ER1, WC1, MA1, SC1, SH1, GBCP, CH1, GB4;
        JLabel title, selected, BVM, bk;
        Timer tim;
        int j, TT = 0, delay = 100;
        JProgressBar PB;
        GamePanel BVP;
        GamePanel1 ERP;
        GamePanel2 WCP;
        Schuylkill1 SCP;
        Shenango1 SHP;
        MontAlto1 MAP;
        myJPanel MJP;
        GameOver GO;
        
       
        
    public CampusPanel(JButton GB, JButton GB5)
    {
        super();
        setBackground(Color.blue);
        setLayout(null);
        //Gameover = new GameOver ();
        
        title = new javax.swing.JLabel();
        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Helvetica", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("CAMPUS MAP");
        add(title);
        title.setBounds(270, 15, 690, 100);
        
        
    // Create JButtons

        BV1 = new javax.swing.JButton();
        BV1.setForeground(Color.white);
        BV1.setOpaque(false);
        BV1.setBorderPainted(false);
        BV1.setContentAreaFilled(false);
        BV1.setFont(new java.awt.Font("Helvetica", 1, 15)); // NOI18N
        BV1.setText("Beaver");
        BV1.setSize(100,140);
        BV1.setLocation(330, 160);
        //BV1.setBounds(340, 260, 120, 30);
        BV1.addActionListener(this);
        add(BV1);
        
                
        ER1 = new javax.swing.JButton();
        ER1.setForeground(Color.white);
        ER1.setOpaque(false);
        ER1.setBorderPainted(false);
        ER1.setContentAreaFilled(false);
        ER1.setFont(new java.awt.Font("Helvetica", 1, 15)); // NOI18N
        ER1.setText("Erie");
        ER1.setSize(100,140);
        ER1.setLocation(375, 80);
        //ER1.setBounds(340, 260, 120, 30);
        ER1.addActionListener(this);
        add(ER1);
        
        
        WC1 = new javax.swing.JButton();
        WC1.setForeground(Color.white);
        WC1.setOpaque(false);
        WC1.setBorderPainted(false);
        WC1.setContentAreaFilled(false);
        WC1.setFont(new java.awt.Font("Helvetica", 1, 15)); // NOI18N
        WC1.setText("World Campus");
        WC1.setSize(200,240);
        WC1.setLocation(490, 79);
        //WC1.setBounds(340, 260, 120, 30);
        WC1.addActionListener(this);
        add(WC1);
        
        SC1 = new javax.swing.JButton();
        SC1.setForeground(Color.white);
        SC1.setOpaque(false);
        SC1.setBorderPainted(false);
        SC1.setContentAreaFilled(false);
        SC1.setFont(new java.awt.Font("Helvetica", 1, 15)); // NOI18N
        SC1.setText("Schuylkill");
        SC1.setSize(200,240);
        SC1.setLocation(570, 260);
       // SC1.setBounds(340, 260, 120, 30);
        SC1.addActionListener(this);
        add(SC1);
        

        SH1 = new javax.swing.JButton();
        SH1.setForeground(Color.white);
        SH1.setOpaque(false);
        SH1.setBorderPainted(false);
        SH1.setContentAreaFilled(false);
        SH1.setFont(new java.awt.Font("Helvetica", 1, 15)); // NOI18N
        SH1.setText("Shenango");
        SH1.setSize(200,210);
        SH1.setLocation(430, 165);
        //SH1.setBounds(340, 260, 120, 30);
        SH1.addActionListener(this);
        add(SH1);
        
        
        MA1 = new javax.swing.JButton();
        MA1.setForeground(Color.white);
        MA1.setOpaque(false);
        MA1.setBorderPainted(false);
        MA1.setContentAreaFilled(false);
        MA1.setFont(new java.awt.Font("Helvetica", 1, 15)); // NOI18N
        MA1.setText("Mont Alto");
        MA1.setSize(200,240);
        MA1.setLocation(590, 120);
       // MA1.setBounds(340, 260, 120, 30);
        MA1.addActionListener(this);
        add(MA1);
        
        
    //selected character **************************************************************************************************************

        selected = new javax.swing.JLabel();
        selected.setBackground(new java.awt.Color(255, 255, 255));
        selected.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        selected.setForeground(new java.awt.Color(255, 255, 255));
        selected.setText("Character");
        add(selected);
        selected.setSize(100,140);
        selected.setLocation(65, 110);
    
        CH1 = new javax.swing.JButton();
        CH1.setForeground(Color.white);
        CH1.setOpaque(false);
        CH1.setBorderPainted(false);
        CH1.setContentAreaFilled(false);
        CH1.setFont(new java.awt.Font("Helvetica", 1, 15)); // NOI18N
        CH1.setText("Character");
        CH1.setSize(100,140);
        CH1.setLocation(65, 100);
        CH1.addActionListener(this);
        add(CH1);
        
        
    // **************************************************************************************************************

        GBCP = GB;
        BVP = new GamePanel(GB4);
        ERP = new GamePanel1();
        WCP = new GamePanel2();
        SCP = new Schuylkill1();
        SHP = new Shenango1();
        MAP = new MontAlto1();
        GO = new GameOver(GB5);
        

        add(GBCP);

   
    //Add Image **************************************************************************************************************
        ImageIcon img2 = new ImageIcon("src/images/lion2.png");
        BVM = new JLabel(img2);
        BVM.setSize(800, 400);
        BVM.setLocation(90, 7);
        add(BVM);

      
    //Background *********************************************************************************************************************************************************************
        bk = new javax.swing.JLabel();
        bk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpg"))); // NOI18N
        bk.setBounds(-60, -360, 1600, 1100);
        add(bk);
        

    //Timer **************************************************************************************************************
        tim = new Timer (delay, this);
        j = 60;
        setLayout(new BorderLayout());
        JPanel JP = new JPanel ();
        add(JP, "South");
        JP.setLayout(new BorderLayout());
        JP.setBackground(Color.black);
        JP.setFont(new java.awt.Font("Helvetica", 0, 13));
        PB = new JProgressBar (JProgressBar.HORIZONTAL, 0, 60);
        PB.setStringPainted(true);
        JP.add(PB, "West");
        j = 60;
        PB.setValue(j);

    }
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        int score = 0;
        g.setColor(Color.white);
        g.drawString("Total Time: "+ TT, 10, 490);
        g.drawString("score = " + score, 10, 510);
        g.drawString("Click on the character to start", 10, 530);
    }
    
    
    //ActionListener Events *********************************************************************************************************************************************************************
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        
      Object obj = e.getSource();
        if(obj == BV1)
        {
            removeAll();
            repaint();
            add(BVP, "Center");
            repaint();
            validate();
            
        }
        if(obj == ER1)
        {
            removeAll();
            repaint();
            add(ERP);
            repaint();
            validate();
        }
        if(obj == WC1)
        {
            removeAll();
            repaint();
            add(WCP);
            repaint();
            validate();
        }
        if(obj == SC1)
        {
            removeAll();
            repaint();
            add(SCP);
            repaint();
            validate();
        }
        if(obj == SH1)
        {
            removeAll();
            repaint();
            add(SHP);
            repaint();
            validate();
            
        }
        if(obj == MA1)
        {
            removeAll();
            repaint();
            add(MAP);
            repaint();
            validate();
        }
        if (obj == CH1)
        {
            tim.start();
        }
        if (obj == tim)
        {
          j = j - 1;
          PB.setValue(j);
          PB.setString(""+j);
          TT = TT + 1;
          repaint();
          if (j == 0)
          {
            tim.stop();
            removeAll();
            repaint();
            add(GO);
            repaint();
            validate();
          }
        }

    }
}
