
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyEditorManager;
import javax.swing.*;

public class myJFrame extends JFrame
{
    myJPanel introScreen;
    JLabel charSelection;
  

    public myJFrame()
    {
        // Define Frame *******************************************************
        BorderLayout border = new BorderLayout();
        setLayout(border);
        setTitle("Penn State Lost in Space Adventure");
        
        
        
        
        // Create Panels/add Vars *********************************************
        introScreen = new myJPanel();
  
        
        // Add Panels *********************************************************
        add(introScreen);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(940, 600);
        setResizable(false);
        
        setVisible(true);
    } 
}