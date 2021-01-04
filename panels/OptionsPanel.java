import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class OptionsPanel extends JPanel implements ActionListener{
        JButton CH1, CH2, CH3, GBOP;
        JLabel bk, charChoice, charChoice1, charChoice2, Options;
        JTextField selector;


    
    public OptionsPanel(JButton GB1){
        
        super();
        setBackground(Color.black);
        setLayout(null);
        setVisible(true);
        GBOP = GB1;
        
        //Create Buttons ******************************************************
        CH1 = new JButton();
        CH2 = new JButton();
        CH3 = new JButton();
        selector = new JTextField("    Select a Character");
        
        // Set Button Dimensions **********************************************
        CH1.setSize(250, 400);
        CH2.setSize(250, 400);
        CH3.setSize(250, 400);
        selector.setSize(250,50);
        CH1.setLocation(50, 50);
        CH2.setLocation(325, 50);
        CH3.setLocation(600, 50);
        selector.setLocation(330, 0);
        
        // Make Buttons Clear *************************************************
        CH1.setOpaque(true);
        CH1.setBorderPainted(false);
        CH1.setContentAreaFilled(false);
        CH2.setOpaque(true);
        CH2.setBorderPainted(false);
        CH2.setContentAreaFilled(false);
        CH3.setOpaque(true);
        CH3.setBorderPainted(false);
        CH3.setContentAreaFilled(false);
                
        
        // Add Image
        ImageIcon img1 = new ImageIcon("src/images/alien.png");
        charChoice = new JLabel(img1);
        charChoice.setSize(250, 400);
        charChoice.setLocation(600, 50);
        
        ImageIcon img2 = new ImageIcon("src/images/guin.png");
        charChoice1 = new JLabel(img2);
        charChoice1.setSize(250, 400);
        charChoice1.setLocation(325, 50);
        
        ImageIcon img3 = new ImageIcon("src/images/pennlion.png");
        charChoice2 = new JLabel(img3);
        charChoice2.setSize(250, 400);
        charChoice2.setLocation(50, 50);


        
// Add Buttons ********************************************************
        add(GBOP);
        add(CH1);
        add(CH2);
        add(CH3);
        add(charChoice);
        add(charChoice1);
        add(charChoice2);
        add(selector);
        
        // ActionListeners
        CH1.addActionListener(this);
        CH2.addActionListener(this);
        CH3.addActionListener(this);
        
//Background *********************************************************************************************************************************************************************
       
        bk = new javax.swing.JLabel();
        bk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpg"))); // NOI18N
        bk.setBounds(-60, -360, 1600, 1100);
        add(bk);
    
}

    @Override
    public void actionPerformed(ActionEvent a) {
    Object obj = a.getSource();
    
        if (obj == CH1)
        {
            selector.setText("    You've Chosen The Nittany Lion");

        }
                if (obj == CH2)
        {
            selector.setText("    You've Chosen Guion Bluford");
        }
                if (obj == CH3)
        {
            selector.setText("    You've Chosen The Dabbing Alien");
        }
    
    }
    
}
