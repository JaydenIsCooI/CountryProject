package com.company;
import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException
    {
        File f = new File("/home/jayden/Documents/country-data.txt");
        Scanner s = new Scanner(f);
        World w = new World();
        Country c;
        // skip header line in data file
        String line = s.nextLine();
        // process other lines in data file
        while(s.hasNextLine()) {
            line = s.nextLine();
            c = new Country(line);
            w.add(c);
        }
        // Complete these methods in the World class
        // The data is sorted by population
        // A binary search on population will work


        // Returns the country with the given name
        // Using a sequential search
        System.out.println(w.getByNameSeq("Samoa"));
        // Returns the country with the given population
        // Using a binary search
        System.out.println(w.getByPopulationBin(5518087));
        s.close();
    }
}
