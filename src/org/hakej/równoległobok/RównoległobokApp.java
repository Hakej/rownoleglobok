package org.hakej.równoległobok;

public class RównoległobokApp {
    public static void main(String[] args)
    {
        int width = 4;
        int height = 8;
        int kick = -2;

        Rownoleglobok rownoleglobok = new Rownoleglobok(width, height, kick);
        RownoleglobokPrinter rp = new RownoleglobokPrinter(rownoleglobok);
        rp.printOut();

        System.exit(0);
    }
}
