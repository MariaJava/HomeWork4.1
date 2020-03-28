package com.company;

public class Main {

    public static void main(String[] args) {
        dowhileMethod();
         ifMethod();
        numbersMethod();



        Twotask t = new Twotask ();






    }

    public static void ifMethod() {
        for (int x = 3; x <= 69; x = x + 6) {
            if (x % 3 == 0) {
                System.out.print(x); //  если поставить  println - тогда будет с новой строки
                System.out.println(",");
            }
        }
    }

        public static void dowhileMethod () {
            int x = 3;
            do {
                System.out.println("Значение x:" + x);
                x = x + 6;
                System.out.println(",");
            } while (x <= 69);

        }

       public  static void numbersMethod () {
            int [] numbers = {3,9,15,21,27,33,39,45,51,57,63,69};
            for (int i : numbers)
            {
                System.out.println(i);
                System.out.println(",");
            }

        }



    }


