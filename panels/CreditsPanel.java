import java.awt.*;
import javax.swing.*;



class CreditsPanel extends JPanel{
    
    JButton GBCP;
    JLabel title, text, bk, gName, mName1, mName2, mName3, mName4;
    JTextField about;
    
    public CreditsPanel(JButton GB3){ 
        
        super();
        setBackground(Color.black);
        setLayout(null);
        setVisible(true);
        GBCP = GB3;
        
        
        title = new javax.swing.JLabel();
        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Helvetica", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("CREDITS & ABOUT");
        add(title);
        title.setBounds(230, 30, 690, 100);
        
        text = new javax.swing.JLabel();
        text.setBackground(new java.awt.Color(255, 255, 255));
        text.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setText("Join the famous Penn State Astronauts, space travel and rocket ships as we venture through astro-campuses to phone home back to earth.");
        add(text);
        text.setBounds(40, 80, 990, 100);
        
        // Create Member and Group ********************************************

        gName = new javax.swing.JLabel();
        gName.setBackground(new java.awt.Color(255, 255, 255));
        gName.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        gName.setForeground(new java.awt.Color(255, 255, 255));
        gName.setText("Team One Members:");
        add(gName);

        
        mName1 = new javax.swing.JLabel();
        mName1.setBackground(new java.awt.Color(255, 255, 255));
        mName1.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        mName1.setForeground(new java.awt.Color(255, 255, 255));
        mName1.setText("Charlotte Darmody");
        add(mName1);
        
   
        mName2  = new javax.swing.JLabel();
        mName2.setBackground(new java.awt.Color(255, 255, 255));
        mName2.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        mName2.setForeground(new java.awt.Color(255, 255, 255));
        mName2.setText("Ronald Long Jr.");
        add(mName2);

        
        mName3  = new javax.swing.JLabel();
        mName3.setBackground(new java.awt.Color(255, 255, 255));
        mName3.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        mName3.setForeground(new java.awt.Color(255, 255, 255));
        mName3.setText("Andrew Adams");
        add(mName3);
        
        
        mName4  = new javax.swing.JLabel();
        mName4.setBackground(new java.awt.Color(255, 255, 255));
        mName4.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        mName4.setForeground(new java.awt.Color(255, 255, 255));
        mName4.setText("Joshua Glenn");
        add(mName4);
                
        
        // Set Dimensions *****************************************************
        gName.setSize(200,50);
        mName1.setSize(200,50);
        mName2.setSize(200,50);
        mName3.setSize(200,50);
        mName4.setSize(200,50);
        gName.setLocation(391,180);
        mName1.setLocation(393,220);
        mName2.setLocation(394,260);
        mName3.setLocation(394,300);
        mName4.setLocation(396,340);

        
        // Add Components *****************************************************
        add(GBCP);
        add(gName);
        add(mName1);
        add(mName2);
        add(mName3);
        add(mName4);
        
        //Background *********************************************************************************************************************************************************************
       
        bk = new javax.swing.JLabel();
        bk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpg"))); // NOI18N
        bk.setBounds(-60, -360, 1600, 1100);
        add(bk);
        
    }

}
