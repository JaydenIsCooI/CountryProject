package com.company;

    public class Country
    {
        String name;
        int population;
        int change;
        int area;

        public Country(String name, int population, int change, int area) {
            this.name = name;
            this.population = population;
            this.change = change;
            this.area = area;
        }

        public Country(String line) {
            int i = 0;
            int j = line.indexOf(" ");
            String name = line.substring(i,j);
            i = j + 1;
            j = line.indexOf(" ", i);
            int population = Integer.parseInt(line.substring(i,j));
            i = j + 1;
            j = line.indexOf(" ", i);
            int change = Integer.parseInt(line.substring(i,j));
            i = j + 1;
            int area = Integer.parseInt(line.substring(i));
            this.name = name;
            this.population = population;
            this.change = change;
            this.area = area;
        }

        public String getName() {
            return name;
        }
        public int getPopulation() {
            return population;
        }
        public int getChange() {
            return change;
        }
        public int getArea() {
            return area;
        }

        public String toString() {
            String result = "";
            result += "{ " + name + " ";
            result += population + " " + change + " ";
            result += area + " }";
            return result;
        }
    }