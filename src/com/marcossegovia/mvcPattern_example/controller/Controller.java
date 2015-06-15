package com.marcossegovia.mvcPattern_example.controller;

import com.marcossegovia.mvcPattern_example.model.Model;
import com.marcossegovia.mvcPattern_example.view.View;
import com.marcossegovia.mvcPattern_example.view.ButtonListener;

/**
 * Created by Marcos on 15/6/15.
 */
public class Controller implements ButtonListener
{
    private View view;
    private Model model;

    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
    }

    @Override
    public String recieveInformation()
    {
        System.out.println("Button has been pushed ! - Controller 2015");

        return this.model.getRandomData();
    }
}
