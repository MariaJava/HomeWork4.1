package com.company;

public class Twotask {

    public static void main (String [] args) {
        Twotask t = new Twotask ();
        t.twoforMethod();




    }

    public void twoforMethod() {

        for (String i = "*"; i.length() <= 4; i+="*")  {
            System.out.println(i);
        }

    }
}











