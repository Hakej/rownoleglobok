package org.hakej.rownoleglobok.RownoleglobokApp;

import org.hakej.rownoleglobok.InvalidParallelogramValues.InvalidParallelogramValues;
import org.hakej.rownoleglobok.Rownoleglobok.Rownoleglobok;
import org.hakej.rownoleglobok.RownoleglobokPrinter.RownoleglobokPrinter;

public class RownoleglobokApp {
    public static void main(String[] args)
    {
        Integer width = 4;
        Integer height = 8;
        Integer kick = -2;
        try {
            Rownoleglobok rownoleglobok = new Rownoleglobok(width, height, kick);
            RownoleglobokPrinter rp = new RownoleglobokPrinter(rownoleglobok);
            rp.printOut();
        } catch(NullPointerException e){
            // ERROR NullPointerException
        } catch(InvalidParallelogramValues e){
            // ERROR InvalidParallelogramValues
        }

        System.exit(0);
    }
}
