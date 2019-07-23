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

    public static void withdraw(ArrayList<AbstractMoney> bank,int quantity,String denomination)
    {
        int initialWithdraw = quantity;
        int runningWithdraw = quantity;


        while(runningWithdraw > 0) {

            for (AbstractMoney m : bank) {
                System.out.println(m.getName());
                System.out.println(m.quantity);
                if (m.getName() == denomination && m.quantity >= quantity) {

                    m.withdraw(quantity);


                    runningWithdraw = runningWithdraw - quantity;
                   //inner running setting to zero for some reason
                    System.out.println("Denomination match!");
                    System.out.println("After withdrawel: "+m.quantity);



                }
                else if (m.getName() == denomination && m.quantity < quantity && m.quantity >0){

                    m.withdraw(m.quantity);
                    System.out.println("Denomination match!");
                    System.out.println("After withdrawel: "+m.quantity);

                }

                else if (m.getName() != denomination){
                    System.out.println("Denomination did not match");
                }

                else {
                    System.out.println("Cannot withdraw not enough funds");
                    runningWithdraw = 0;

                }
                System.out.println("Updated bank statement "+"\n"+bank.toString());
                printPiggyBankTotal(bank);

            }
        }


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

        withdraw(piggyBank,3, "Dollar");



    }



}
