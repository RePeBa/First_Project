package com.company;

    public class Butelka {

        private double pojemnoscMax;
        String nazwa;

        Butelka(double pojemnoscMax, String nazwa)
        {
            this.pojemnoscMax = pojemnoscMax;
            this.nazwa = nazwa;
        }

        double getIleZostalo()
            {
             return pojemnoscMax;
            }

//         void sytuacjaBiezaca()
//        {
//            System.out.println( "Butelka: " + butelka[i].nazwa +  " \t \t : " + butelka[i].pojemnoscMax + "  =  pojemność całkowita.     "
//                    +  (butelka[i].pojemnoscMax - butelka[i].getIleZostalo()) + "  = bieżąca zawartość płynu"); }


        void wlej(double ilosc)
            {
            if (ilosc < this.pojemnoscMax)
                this.pojemnoscMax -= ilosc;
            else
                 System.out.println("Za mało miejsca w butelce. Próbę wlania anulowano");
            }

        void wylej(double ilosc)
        {
            if (ilosc < pojemnoscMax )
                this.pojemnoscMax += ilosc;
            else
                System.out.println("Nie ma tyle płynu w butelce.");
        }

    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[8]; /* dlaczego tu ma być 8??? przy 6 powinno być ok */

        int i = 1;
        double[] ltr = {1, 2, 3, 4, 5, 12, 15}; /* tu mam 7 wartości */
        String[] nazwa = {"One", "Two", "Three", "Four", "Five", "Twelve", "Fifteen"};/* tu też mam 7 wartości */
//        for (i = 1; i < 8; i++) {
//            butelka[i] = new Butelka(ltr[i - 1], nazwa[i - 1]);

            for (i = 1; i < 8; i++) {
                butelka[i] = new Butelka(ltr[i - 1], nazwa[i - 1]);/* a tu mam 7 wartości, ale  przy przesuniętym w lewo indeksie o 1 */

                System.out.println( "Butelka: " + butelka[i].nazwa +  " \t \t : " + butelka[i].pojemnoscMax + "  =  pojemność całkowita.     "
                                  +  (butelka[i].pojemnoscMax - butelka[i].getIleZostalo()) + "  = początkowa zawartość płynu");

                System.out.println("-----------------------------------------------------------------------------------------------------");


            }
            butelka[1].wlej(0.4);
            System.out.println(" W butelce  " + butelka[1].nazwa + " jest płyn w ilości " + (ltr[0] - butelka[1].getIleZostalo())
                               + " litrów. Zostało " + butelka[1].getIleZostalo() + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[4].wlej(3);
            System.out.println(" W butelce " + butelka[4].nazwa + " jest płyn w ilości " + (ltr[3] - butelka[4].getIleZostalo())
                    + " litrów. Zostało " + butelka[4].getIleZostalo() + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[7].wlej(13.0);
            System.out.println(" W butekce  " + butelka[7].nazwa + " jest płyn w ilości " + (ltr[6] - butelka[7].getIleZostalo())
                    + " litrów. Zostało " + butelka[7].getIleZostalo() + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[4].wylej(3); /* można wylać za duzo - trzeba ograniczyć*/

            System.out.println(" W butelce " + butelka[4].nazwa + " jest płyn w ilości " + (ltr[3]  - butelka[4].getIleZostalo())
                    + " litrów. Zostało " + butelka[4].getIleZostalo() + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[7].wylej(3.0);
            System.out.println("  W butelce " + butelka[7].nazwa + " jest płyn w ilości " + (ltr[6] - butelka[7].getIleZostalo())
                    +" litrów. Zostało " + butelka[7].getIleZostalo() + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");


        }
    }


