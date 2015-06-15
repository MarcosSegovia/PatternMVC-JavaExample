package com.marcossegovia.mvcPattern_example;

import javax.swing.*;

import com.marcossegovia.mvcPattern_example.controller.Controller;
import com.marcossegovia.mvcPattern_example.model.Model;
import com.marcossegovia.mvcPattern_example.view.View;
/**
 * Created by Marcos on 15/6/15.
 */
public class App
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run()
            {
                createMVC();
            }
        });
    }

    public static void createMVC()
    {
        Model model = new Model();
        View view = new View(model);

        Controller controller = new Controller(model, view);

        //Set the listeners

        view.setButtonListener(controller);
    }
}
