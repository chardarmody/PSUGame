
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


class GameOver extends JPanel implements ActionListener 
{
      JLabel BGP, title;
      JButton MG;
      
      public GameOver(JButton GB5)
      {
        super();
        setBackground(Color.BLACK);
        setLayout(null);
        setVisible(true);
        
        title = new javax.swing.JLabel();
        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Helvetica", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("GAME OVER");
        add(title);
        title.setBounds(300, 180, 690, 100);
        
        MG = GB5;
        add(MG);

        BGP = new javax.swing.JLabel();
        BGP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/be0db3defec5f8054f3c7efb150187bf.jpg"))); // NOI18N
        BGP.setBounds(-60, -360, 1600, 1170);
        add(BGP);
      }
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
       
    } 
}
