package JavaWindow;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener {

    private JButton myButton_1;
    private JButton myButton_2;

    private String buttonName_1;
    private String buttonName_2;

    public Frame() {

        setTitle("My Window");

        Container C = getContentPane(); // Access content pane

        C.setLayout(new FlowLayout()); // Set content pane layout

        buttonName_1 = "Button 1";
        myButton_1 = new JButton(buttonName_1); // Add button 1 to the layout
        myButton_1.addActionListener(this); // Sends event to this object
        C.add(myButton_1);

        buttonName_2 = "Button 2";
        myButton_2 = new JButton(buttonName_2); // Add button 2 to the layout
        myButton_2.addActionListener(this); // Sends event to this object
        C.add(myButton_2);

    }

    public void actionPerformed(ActionEvent e){ // Performs an event when a button is pressed
        
        if(e.getActionCommand().equals(buttonName_1)){
            System.out.println("Button 1 pressed");
        }
        else if(e.getActionCommand().equals(buttonName_2)){
            System.out.println("Button 2 pressed");
        }


    }


}