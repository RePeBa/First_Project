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

        void wlej(double ilosc)
            {
            if (ilosc <= this.pojemnoscMax - this.ileLitrow)
                this.ileLitrow += ilosc;
            else
                 System.out.println(" Za mało miejsca w butelce." + ilosc + " litrow to zbyt dużo. Próbę wlania anulowano");
            }

        void wylej(double ilosc)
        {
            if (ilosc < (this.ileLitrow))
                this.ileLitrow -= ilosc;
            else
                System.out.println(" Próba wylania "+ ilosc + " litrów nie powiodła się. Nie ma tyle płynu w butelce. Operacja została anulowana.");
        }
        void przelej(double ilosc, Butelka doKtorajButelki)
        {
            if (ilosc < (this.ileLitrow) && ilosc <= (this.pojemnoscMax - this.ileLitrow))
                {
                doKtorajButelki.wlej(ilosc);
                this.wylej(ilosc);
                }
            else
                System.out.println(" Nie ma wystarczająco dużo miejsca w butelce '"+ doKtorajButelki.nazwa + "'. Próba przelania "+ ilosc + " litrów nie powiodła się. Operacja została anulowana.");
        }

    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[8];

        int i = 1;
        double[] ltr = {1, 2, 3, 4, 5, 12, 15};
        String[] nazwa = {"One", "Two", "Three", "Four", "Five", "Twelve", "Fifteen"};
        double[] ltrPoczatkowe = {0, 0, 0, 0, 0, 0, 0};

            for (i = 1; i < 8; i++) {
                butelka[i] = new Butelka(ltr[i - 1], ltrPoczatkowe[i-1], nazwa[i - 1]);

//               Tu są zawarte informacje początkowe - sprawdzające prawidłowość konstrukcji butelek :

//                System.out.println( "Butelka: '" + butelka[i].nazwa +  "' \t \t : " + butelka[i].pojemnoscMax + "  =  pojemność całkowita.     "
//                                  +  (butelka[i].ileLitrow) + "  = początkowa zawartość płynu");
//
//                System.out.println("***************************************************************************************************");


            }
//            Tu jest próba wlania zmiennoprzecinkowej ilości :
//            butelka[1].wlej(0.4);
//            System.out.println(" W butelce '" + butelka[1].nazwa + "' jest płyn w ilości " + (butelka[1].ileLitrow)
//                               + " litrów. Zostało " + (butelka[1].pojemnoscMax - butelka[1].ileLitrow) + " litrów miejsca.");
//            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[4].wlej(3);

            System.out.println(" W butelce '" + butelka[4].nazwa + "' jest płyn w ilości " + (butelka[4].ileLitrow)
                    + " litrów. Zostało " + (butelka[4].pojemnoscMax - butelka[4].ileLitrow) + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[7].wlej(13.0);

            System.out.println(" W butekce '" + butelka[7].nazwa + "' jest płyn w ilości " + (butelka[7].ileLitrow)
                    + " litrów. Zostało " + (butelka[7].pojemnoscMax - butelka[7].ileLitrow) + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[4].wylej(1); /* można wylać za duzo - trzeba ograniczyć*/

            System.out.println(" W butelce '" + butelka[4].nazwa + "' jest płyn w ilości " + (butelka[4].ileLitrow)
                    + " litrów. Zostało " + (butelka[4].pojemnoscMax - butelka[4].ileLitrow) + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[7].wylej(17.0);

            System.out.println("  W butelce '" + butelka[7].nazwa + "' jest płyn w ilości " + (butelka[7].ileLitrow)
                    +" litrów. Zostało " + (butelka[7].pojemnoscMax - butelka[7].ileLitrow) + " litrów miejsca.");
            System.out.println("-------------------------------------------------------------------------------------------------");

            butelka[7].przelej( 1, butelka[4]);

            System.out.println(" W butelce '" + butelka[4].nazwa + "' jest płyn w ilości " + (butelka[4].ileLitrow)
                + " litrów. Zostało " + (butelka[4].pojemnoscMax - butelka[4].ileLitrow) + " litrów miejsca.");
            System.out.println(" W butelce '" + butelka[7].nazwa + "' jest płyn w ilości " + (butelka[7].ileLitrow)
                +" litrów. Zostało " + (butelka[7].pojemnoscMax - butelka[7].ileLitrow) + " litrów miejsca.");

//            Tu jest sprawdzian, co w tej chwili dzieje się w butlkach:
            for (i = 1; i<8; i++) {
                System.out.println("Butelka: " + butelka[i].nazwa + " \t \t : " + butelka[i].pojemnoscMax + "  =  pojemność całkowita.     "
                        + butelka[i].getIleZostalo() + "  = bieżąca zawartość płynu");
            }

    }
}


