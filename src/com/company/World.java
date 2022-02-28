package com.company;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class World
{
    List<Country> world;
    File f = new File("/home/jayden/Documents/country-data.txt");

    public World()
    {
        world = new ArrayList<Country>();
    }

    public void add(Country country)
    {
        world.add(country);
    }

    public int size()
    {
        return world.size();
    }

    public Country get(int i)
    {
        return world.get(i);
    }

    public Country getByNameSeq(String name) throws IOException
    {
        FileReader fr = new FileReader(f);
        LineNumberReader lr = new LineNumberReader(fr);
        int lines = 0;
        while (lr.readLine()!=null)
        {
            lines++;
        }
        for (int i = 0; i < lines - 1; i ++)
        {
           if((world.get(i).getName()).equals(name))
            {
                return world.get(i);
            }
        }
        return world.get(0);
    }

    public Country getByPopulationBin(int population)
    {
        int left = 0;
        int right = world.size()-1;
        while (left <= right)
        {
            int middle = (left + right) / 2;
            if (population > world.get(middle).getPopulation())
            {
                right = middle - 1;
            } else if (population < world.get(middle).getPopulation())
            {
                left = middle + 1;
            } else
            {
                return world.get(middle);
            }
        }
        return null;
    }
}