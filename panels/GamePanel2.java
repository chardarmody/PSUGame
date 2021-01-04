// WORLD CAMPUS PANEL -- needs data/questions
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

class GamePanel2 extends JPanel implements ActionListener{
    
    JButton CH1, GB, GB4, Q1, Q2, Q3, Q1A, Q1B, Q1C, Q1D, Q2A, Q2B, Q2C, Q2D, Q3A, Q3B, Q3C, Q3D, Q4A, Q4B, Q4C, Q4D;
    Timer tim;
    int j, TT = 0, delay = 100;
    JProgressBar PB;
    CampusPanel CP;
    GamePanel gamePanel;
    myJPanel myJPanel;
    JLabel welcome, bk, Q1L, Q2L, Q3L, Q4L;
   

    public GamePanel2()
    {
        super();
        setVisible(true);
        setBackground(Color.blue);



//add campus image ***********************************************************************************************************************************************************************************************************************
                             
        ImageIcon img3 = new ImageIcon("src/images/Beaver2.PNG");
        welcome = new JLabel(img3);
        welcome.setSize(999,100);
        welcome.setLocation(0, 0);
        add(welcome);
        

//question one attributes ***********************************************************************************************************************************************************************************************************************
       
        Q1L = new javax.swing.JLabel();
        Q1L.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        Q1L.setForeground(new java.awt.Color(255, 255, 255));
        Q1L.setText("The Milky Way has approximately how many stars?");
        add(Q1L);
        Q1L.setBounds(40, 140, 400, 30);
        
        Q1A = new javax.swing.JButton();
        Q1A.setForeground(Color.black);
        Q1A.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q1A.setText("100 Million");
        add(Q1A);
        Q1A.setBounds(50, 170, 120, 30);
        Q1A.addActionListener(this);
        
        Q1B = new javax.swing.JButton();
        Q1B.setForeground(Color.black);
        Q1B.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q1B.setText("2 Million");
        add(Q1B);
        Q1B.setBounds(170, 170, 120, 30);
        Q1B.addActionListener(this);
        
        Q1C = new javax.swing.JButton();
        Q1C.setForeground(Color.black);
        Q1C.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q1C.setText("200 Billion");
        add(Q1C);
        Q1C.setBounds(290, 170, 120, 30);
        Q1C.addActionListener(this);
        
        Q1D = new javax.swing.JButton();
        Q1D.setForeground(Color.black);
        Q1D.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q1D.setText("400 Million");
        add(Q1D);
        Q1D.setBounds(410, 170, 120, 30);
        Q1D.addActionListener(this);

        
        
//question two attributes **************************************************************************************************************************

        Q2L = new javax.swing.JLabel();
        Q2L.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        Q2L.setForeground(new java.awt.Color(255, 255, 255));
        Q2L.setText("A pulsar is actually a:");
        add(Q2L);
        Q2L.setBounds(40, 230, 400, 30);
        
        Q2A = new javax.swing.JButton();
        Q2A.setForeground(Color.black);
        Q2A.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q2A.setText("Black Hole");
        add(Q2A);
        Q2A.setBounds(50, 260, 120, 30);
        Q2A.addActionListener(this);
        
        Q2B = new javax.swing.JButton();
        Q2B.setForeground(Color.black);
        Q2B.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q2B.setText("Red Giant");
        add(Q2B);
        Q2B.setBounds(170, 260, 120, 30);
        Q2B.addActionListener(this);
        
        Q2C = new javax.swing.JButton();
        Q2C.setForeground(Color.black);
        Q2C.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q2C.setText("White Dwarf");
        add(Q2C);
        Q2C.setBounds(290, 260, 120, 30);
        Q2C.addActionListener(this);
        
        Q2D = new javax.swing.JButton();
        Q2D.setForeground(Color.black);
        Q2D.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q2D.setText("Neutron Star");
        add(Q2D);
        Q2D.setBounds(410, 260, 120, 30);
        Q2D.addActionListener(this);

           
   
        
//question three attributes ***********************************************************************************************************************************************************************************************************************
      
        Q3L = new javax.swing.JLabel();
        Q3L.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        Q3L.setForeground(new java.awt.Color(255, 255, 255));
        Q3L.setText("A line through the three stars in Orion's belt points toward which one of the following?");
        add(Q3L);
        Q3L.setBounds(40, 320, 600, 30);
        
        Q3A = new javax.swing.JButton();
        Q3A.setForeground(Color.black);
        Q3A.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q3A.setText("Mizor");
        add(Q3A);
        Q3A.setBounds(50, 350, 120, 30);
        Q3A.addActionListener(this);
        
        Q3B = new javax.swing.JButton();
        Q3B.setForeground(Color.black);
        Q3B.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q3B.setText("Polaris");
        add(Q3B);
        Q3B.setBounds(170, 350, 120, 30);
        Q3B.addActionListener(this);
        
        Q3C = new javax.swing.JButton();
        Q3C.setForeground(Color.black);
        Q3C.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q3C.setText("Sirius");
        add(Q3C);
        Q3C.setBounds(290, 350, 120, 30);
        Q3C.addActionListener(this);
        
        Q3D = new javax.swing.JButton();
        Q3D.setForeground(Color.black);
        Q3D.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        Q3D.setText("Rigel");
        add(Q3D);
        Q3D.setBounds(410, 350, 120, 30);
        Q3D.addActionListener(this);

        
//phone home button attributes ***********************************************************************************************************************************************************************************************************************
        
        GB4 = new javax.swing.JButton();
        GB4.setFont(new java.awt.Font("Helvetica", 0, 13));
        GB4.setText("Phone Home");
        GB4.setSize(120,30);
        GB4.addActionListener(this);
        GB4.setLocation(425,500);
        add(GB4);
        

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

   
        
// background image **************************************************************************************************************************

        bk = new javax.swing.JLabel();
        bk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpg"))); // NOI18N
        bk.setBounds(-60, -360, 1600, 1100);
        add(bk);


//begin horizontal group layout design ***********************************************************************************************************************************************************************************************
  
// <editor-fold defaultstate="collapsed" desc="Generated Code">   
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(Q1L) 
                                .addComponent(Q2L)
                                .addComponent(Q3L)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(Q1A)
                                        .addComponent(Q1B)
                                        .addComponent(Q1C)
                                        .addComponent(Q1D))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(Q2A)
                                        .addComponent(Q2B)
                                        .addComponent(Q2C)
                                        .addComponent(Q2D))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(Q3A)
                                        .addComponent(Q3B)
                                        .addComponent(Q3C)
                                        .addComponent(Q3D))

                        )
        );
        
        
//end horizontal group layout design ***********************************************************************************************************************************************************************************************

        
//begin vertical group layout design ***********************************************************************************************************************************************************************************************

layout.setVerticalGroup(

 layout.createSequentialGroup()
         .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                 .addComponent(Q1L)
         
         .addGroup(layout.createSequentialGroup()
                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addComponent(Q1A)
                         .addGroup(layout.createSequentialGroup()
                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                         .addComponent(Q1B)
                                         .addGroup(layout.createSequentialGroup()
                                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                         .addComponent(Q1C)
                                                         .addGroup(layout.createSequentialGroup()
                                                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                         .addComponent(Q1D)
                                                                 ))))))))     
         
         .addGroup(layout.createSequentialGroup()
                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addComponent(Q2L)
                 .addGroup(layout.createSequentialGroup()
                         .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                 .addComponent(Q2A)
                                 .addGroup(layout.createSequentialGroup()
                                         .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                 .addComponent(Q2B)
                                                 .addGroup(layout.createSequentialGroup()
                                                         .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                         .addComponent(Q2C)
                                                                 .addGroup(layout.createSequentialGroup()
                                                                         .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                 .addComponent(Q2D)
                                                                         )))))))))

                                                    .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                            .addComponent(Q3L)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                            .addComponent(Q3A)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                            .addComponent(Q3B)
                                                                                            .addGroup(layout.createSequentialGroup()
                                                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                            .addComponent(Q2C)
                                                                                                            .addGroup(layout.createSequentialGroup()
                                                                                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                                            .addComponent(Q3D)
                                                                                                                    )))))))))
         

                 )))

        );
    }
    

   // </editor-fold>   
    
//end vertical group layout design ******************************************************************************************************************************************************************************************************************************

// <editor-fold defaultstate="collapsed" desc="Generated Code">   


// begin actionlistener events ****************************************************************************************************************************************************************************************************************************** 

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {    
        
        Object obj = e.getSource();
      
// question one actionlistener events ****************************************************************************************************************************************************************************************************************************** 

          if (obj == Q1A)
          {
              repaint();
              Q1A.setBackground(Color.RED);
              Q1A.setForeground(Color.RED);
              Q1A.setText("WRONG");
              validate();
              repaint();
              //add(Q1A);
          }
          
          if(obj == Q1B)
          {
              repaint();
              Q1B.setBackground(Color.GREEN);
              Q1B.setForeground(Color.GREEN);
              Q1B.setText("CORRECT");
              validate();
              repaint(); 
          }
          
          if (obj == Q1C)
          {
              repaint();
              Q1C.setBackground(Color.RED);
              Q1C.setForeground(Color.RED);
              Q1C.setText("WRONG");
              validate();
              repaint();
          }
          
          if (obj == Q1D)
          {
              repaint();
              Q1D.setBackground(Color.RED);
              Q1D.setForeground(Color.RED);
              Q1D.setText("WRONG");
              validate();
              repaint();
          }
          
// question two actionlistener events ****************************************************************************************************************************************************************************************************************************** 

          if (obj == Q2A)
          {
              repaint();
              Q2A.setBackground(Color.RED);
              Q2A.setForeground(Color.RED);
              Q2A.setText("WRONG");
              validate();
              repaint();
          }
         
          if (obj == Q2B)
          {
              repaint();
              Q2B.setBackground(Color.RED);
              Q2B.setForeground(Color.RED);
              Q2B.setText("WRONG");
              validate();
              repaint();
          }
          
          if (obj == Q2C)
          {
              repaint();
              Q2C.setBackground(Color.RED);
              Q2C.setForeground(Color.RED);
              Q2C.setText("WRONG");
              validate();
              repaint();
          }          
          
          if(obj == Q2D)
          {
              repaint();
              Q2D.setBackground(Color.GREEN);
              Q2D.setForeground(Color.GREEN);
              Q2D.setText("CORRECT");
              validate();
              repaint(); 
          }
          
// question three actionlistener events ****************************************************************************************************************************************************************************************************************************** 

          if (obj == Q3A)
          {
              repaint();
              Q3A.setBackground(Color.RED);
              Q3A.setForeground(Color.RED);
              Q3A.setText("WRONG");
              validate();
              repaint();
          }
         
          if (obj == Q3B)
          {
              repaint();
              Q3B.setBackground(Color.RED);
              Q3B.setForeground(Color.RED);
              Q3B.setText("WRONG");
              validate();
              repaint();
          }
          
          if(obj == Q3C)
          {
              repaint();
              Q3C.setBackground(Color.GREEN);
              Q3C.setForeground(Color.GREEN);
              Q3C.setText("CORRECT");
              validate();
              repaint(); 
          }
          
          if (obj == Q3D)
          {
              repaint();
              Q3D.setBackground(Color.RED);
              Q3D.setForeground(Color.RED);
              Q3D.setText("WRONG");
              validate();
              repaint();

          }          
          
          
//timer action listener ****************************************************************************************************************************************************************************************************************************** 
          
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
          }
        }
          
//phone home action listener ****************************************************************************************************************************************************************************************************************************** 
                 //KEEP THE ORDER 
          if(obj == GB4)
          {
              removeAll();
              repaint();
              add(CP);
              validate();
             // repaint();
          }
                   
// </editor-fold>   

// ***************************************************************************************************************************************************************************************************************************** 

     }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int score = 0;
        g.setColor(Color.white);
        g.drawString("Total Time: "+ TT, 10, 490);
        g.drawString("score = " + score, 10, 510);
        g.drawString("Click on the character to start", 10, 530);
    }
}
    


