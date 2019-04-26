package piggybank;



import java.util.Date;

public  abstract class AbstractMoney
{

    int value;
    int quantity;


    public AbstractMoney(){




        this.value = value;
        this.quantity = quantity;

    }

//    public abstract String value();
//    public abstract String totalValue();


    public int value()
    {
        return this.value;
    }

    public double totalValue()
    {
        return this.value * this.quantity;
    }

}


