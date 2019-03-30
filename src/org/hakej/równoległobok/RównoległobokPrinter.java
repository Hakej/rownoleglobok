package org.hakej.równoległobok;

class RównoległobokPrinter {
    private Równoległobok równoległobokToPrint;
    RównoległobokPrinter(Równoległobok równoleglobok) {
        this.równoległobokToPrint = równoleglobok;
    }

    public void printOut()
    {
        int kickLineValue = 0;
        for(int i = 0; i < równoległobokToPrint.height; i++)
        {
            kickLineValue = printKick(kickLineValue);
            for(int j = 0; j< równoległobokToPrint.width; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private int printKick(int kickLineValue)
    {
        if(równoległobokToPrint.kick > 0)
        {
            for(int k = 0; k < kickLineValue; ++k)
            {
                System.out.print(" ");
            }
            return kickLineValue + równoległobokToPrint.kick;
        }
        else if(równoległobokToPrint.kick < 0)
        {
            for(int k = (równoległobokToPrint.height - 1) * równoległobokToPrint.kick + kickLineValue; k < 0; ++k)
            {
                System.out.print(" ");
            }
            return kickLineValue - równoległobokToPrint.kick;
        }
        return 0;
    }
}