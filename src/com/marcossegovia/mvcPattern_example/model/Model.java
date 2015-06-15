package com.marcossegovia.mvcPattern_example.model;

/**
 * Created by Marcos on 15/6/15.
 */
public class Model
{
    private String randomData;

    public Model()
    {
        this.randomData = new String("String generated in the Model");
    }

    public String getRandomData()
    {
      return this.randomData;
    }
}
