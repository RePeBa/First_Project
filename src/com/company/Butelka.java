package com.company;

    public class Butelka {

        private double pojemnoscMax;
        private double ileLitrow;
        String nazwa;

        Butelka(double pojemnoscMax, double ileLitrow, String nazwa)
        {
            this.pojemnoscMax = pojemnoscMax;
            this.ileLitrow = ileLitrow;
            this.nazwa = nazwa;
        }

        double getIleZostalo()
            {
             return ileLitrow;
            }

//         void sytuacjaBiezaca()
//        {
//            System.out.println( "Butelka: " + butelka[i].nazwa +  " \t \t : " + butelka[i].pojemnoscMax + "  =  pojemność całkowita.     "
//                    +  (butelka[i].pojemnoscMax - butelka[i].getIleZostalo()) + "  = bieżąca zawartość płynu"); }


        void wlej(double ilosc)
            {
            if (ilosc <= this.pojemnoscMax - this.ileLitrow)
                this.ileLitrow += ilosc;
            else
                 System.out.println("Za mało miejsca w butelce. Próbę wlania anulowano");
            }

        void wylej(double ilosc)
        {
            if (ilosc < (this.ileLitrow))
                this.ileLitrow -= ilosc;
            else
                System.out.println("Nie ma tyle płynu w butelce.");
        }

    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[8]; /* dlaczego tu ma być 8??? przy 6 powinno być ok */

        int i = 1;
        double[] ltr = {1, 2, 3, 4, 5, 12, 15}; /* tu mam 7 wartości */
        String[] nazwa = {"One", "Two", "Three", "Four", "Five", "Twelve", "Fifteen"};/* tu też mam 7 wartości */
        double[] ltrPoczatkowe = {0, 0, 0, 0, 0, 0, 0};

            for (i = 1; i < 8; i++) {
                butelka[i] = new Butelka(ltr[i - 1], ltrPoczatkowe[i-1], nazwa[i - 1]);/* a tu mam 7 wartości, ale  przy przesuniętym w lewo indeksie o 1 */

                System.out.println( "Butelka: " + butelka[i].nazwa +  " \t \t : " + butelka[i].pojemnoscMax + "  =  pojemność całkowita.     "
                                  +  (butelka[i].ileLitrow) + "  = początkowa zawartość płynu");

                System.out.println("***************************************************************************************************");


            }
            butelka[1].wlej(0.4);
            System.out.println(" W butelce '" + butelka[1].nazwa + "' jest płyn w ilości " + (butelka[1].ileLitrow)
                               + " litrów. Zostało " + (butelka[1].pojemnoscMax - butelka[1].ileLitrow) + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[4].wlej(3);
            System.out.println(" W butelce '" + butelka[4].nazwa + "' jest płyn w ilości " + (butelka[4].ileLitrow)
                    + " litrów. Zostało " + (butelka[4].pojemnoscMax - butelka[4].ileLitrow) + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[7].wlej(13.0);
            System.out.println(" W butekce '" + butelka[7].nazwa + "' jest płyn w ilości " + (butelka[7].ileLitrow)
                    + " litrów. Zostało " + (butelka[7].pojemnoscMax - butelka[7].ileLitrow) + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[4].wylej(1); /* można wylać za duzo - trzeba ograniczyć*/
            System.out.println(" W butelce " + butelka[4].nazwa + " jest płyn w ilości " + (butelka[4].ileLitrow)
                    + " litrów. Zostało " + (butelka[4].pojemnoscMax - butelka[4].ileLitrow) + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[7].wylej(17.0);
            System.out.println("  W butelce " + butelka[7].nazwa + " jest płyn w ilości " + (butelka[7].ileLitrow)
                    +" litrów. Zostało " + (butelka[7].pojemnoscMax - butelka[7].ileLitrow) + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

        }
    }


