package piggybank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main
{
    public static void printPiggyBankTotal(ArrayList<AbstractMoney> contents)
    {
        double total = 0.0;
        for (AbstractMoney m : contents)
        {


            total = total + m.totalValue();


        }
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        System.out.println(fp.format(total));
    }

    public static void main(String[] args)
    {


        Quarter quarters = new Quarter(4);
        Penny pennies = new Penny(10);
        Nickel nickles = new Nickel(20);
        Dollar dollars = new Dollar(1);
        Dime dimes = new Dime(10);

        ArrayList<AbstractMoney> piggyBank = new ArrayList<AbstractMoney>();
        piggyBank.add(quarters);
        piggyBank.add(dimes);
        piggyBank.add(nickles);
        piggyBank.add(dollars);
        piggyBank.add(pennies);


        System.out.println(piggyBank.toString());
        printPiggyBankTotal(piggyBank);





    }



}
