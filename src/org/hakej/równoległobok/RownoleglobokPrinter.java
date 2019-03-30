package org.hakej.równoległobok;

class RownoleglobokPrinter {
    private Rownoleglobok rownoleglobokToPrint;
    RownoleglobokPrinter(Rownoleglobok równoleglobok) {
        this.rownoleglobokToPrint = równoleglobok;
    }

    public void printOut()
    {
        int kickLineValue = 0;
        for(int i = 0; i < rownoleglobokToPrint.getHeight(); i++)
        {
            kickLineValue = printKick(kickLineValue);
            for(int j = 0; j< rownoleglobokToPrint.getWidth(); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private int printKick(int kickLineValue)
    {
        if(rownoleglobokToPrint.getKick() > 0)
        {
            for(int k = 0; k < kickLineValue; ++k)
            {
                System.out.print(" ");
            }
            return kickLineValue + rownoleglobokToPrint.getKick();
        }
        else if(rownoleglobokToPrint.getKick() < 0)
        {
            for(int k = (rownoleglobokToPrint.getHeight() - 1) * rownoleglobokToPrint.getKick() + kickLineValue; k < 0; ++k)
            {
                System.out.print(" ");
            }
            return kickLineValue - rownoleglobokToPrint.getKick();
        }
        return 0;
    }
}