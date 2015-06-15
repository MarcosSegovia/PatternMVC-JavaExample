package com.marcossegovia.mvcPattern_example.view;

import com.marcossegovia.mvcPattern_example.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Marcos on 15/6/15.
 */
public class View extends JFrame implements ActionListener
{
    private Model model;
    private ButtonListener buttonListener;


    public View(Model model) throws HeadlessException
    {
        super();
        this.model = model;

        BoxLayout box = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);

        //Button
        JButton button = new JButton("I am a funny button");
        add(button);

        //Event handler for the model
        button.addActionListener(this);

        this.setLayout(box);
        setTitle("I'm the GUI !");
        setSize(600,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(buttonListener != null)
        {
            String data = buttonListener.recieveInformation();
            System.out.println(data);
        }
    }

    public void setButtonListener(ButtonListener buttonListener)
    {
        this.buttonListener = buttonListener;
    }
}
