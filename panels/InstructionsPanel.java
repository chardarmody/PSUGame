import java.awt.*;
import javax.swing.*;

class InstructionsPanel extends JPanel{
    
    JButton GBIP;
    JTextField in1, in2, in3;
    JLabel title, top1, bk;
    
    public InstructionsPanel(JButton GB2){
        
        super();
        setBackground(Color.black);
        setLayout(null);
        setVisible(true);
        GBIP = GB2;
        
        title = new javax.swing.JLabel();
        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Helvetica", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("INSTRUCTIONS");
        add(title);
        title.setBounds(270, 30, 690, 100);
        
        // Create Innstructions ***********************************************
        
       
        in1 = new JTextField("Rule One: Pick a Character from the Options Screen");
        in2 = new JTextField("Rule Two: Choose Campus/Game from the Campus Map");
        in3 = new JTextField("Rule Three: Have FUN!");

        // Set Text Dimensions and Locations **********************************
        
        
        in1.setSize(400, 100);
        in2.setSize(400, 100);
        in3.setSize(400, 100);
        in1.setLocation(250, 100);
        in2.setLocation(250, 200);
        in3.setLocation(250, 300);
        
        
        //Add Components ******************************************************
       
        add(GBIP);
        add(in1);
        add(in2);
        add(in3);
        
        //Background *********************************************************************************************************************************************************************
       
        bk = new javax.swing.JLabel();
        bk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpg"))); // NOI18N
        bk.setBounds(-60, -360, 1600, 1100);
        add(bk);
        
        
    }
    
    
}
