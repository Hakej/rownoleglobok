package org.hakej.rownoleglobok.RownoleglobokPrinter;

import org.hakej.rownoleglobok.Rownoleglobok.Rownoleglobok;

public class RownoleglobokPrinter {
    private Rownoleglobok rownoleglobokToPrint;
    public RownoleglobokPrinter(Rownoleglobok rownoleglobok) throws NullPointerException {
        this.rownoleglobokToPrint = rownoleglobok;
    }

    public void printOut()
    {
        Integer kickLineValue = 0;
        for(Integer i = 0; i < rownoleglobokToPrint.getHeight(); i++)
        {
            kickLineValue = printKick(kickLineValue);
            for(Integer j = 0; j< rownoleglobokToPrint.getWidth(); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private Integer printKick(Integer kickLineValue)
    {
        if(rownoleglobokToPrint.getKick() > 0)
        {
            for(Integer k = 0; k < kickLineValue; ++k)
            {
                System.out.print(" ");
            }
            return kickLineValue + rownoleglobokToPrint.getKick();
        }
        else if(rownoleglobokToPrint.getKick() < 0)
        {
            for(Integer k = (rownoleglobokToPrint.getHeight() - 1) * rownoleglobokToPrint.getKick() + kickLineValue; k < 0; ++k)
            {
                System.out.print(" ");
            }
            return kickLineValue - rownoleglobokToPrint.getKick();
        }
        return 0;
    }
}