package piggybank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main
{
    public static void printPiggyBankTotal(ArrayList<AbstractMoney> contents)
    {
        double total = 0.00;
        for (AbstractMoney m : contents)
        {


            total = total + m.totalValue();


        }
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        System.out.println(fp.format(total));
    }

    public static void main(String[] args)
    {




        ArrayList<AbstractMoney> piggyBank = new ArrayList<AbstractMoney>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));


        System.out.println(piggyBank.toString());
        printPiggyBankTotal(piggyBank);





    }



}
