package org.hakej.równoległobok;

public class RównoległobokApp {
    public static void main(String[] args)
    {
        int width = 4;
        int height = 8;
        int kick = -2;

        Równoległobok równoległobok = new Równoległobok(width, height, kick);
        RównoległobokPrinter rp = new RównoległobokPrinter(równoległobok);
        rp.printOut();

        System.exit(0);
    }
}
