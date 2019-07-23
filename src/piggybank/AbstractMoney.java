package piggybank;



import java.util.Date;

public  abstract class AbstractMoney
{

    int value;
    int quantity;
    String name;


    public AbstractMoney(){




        this.value = value;
        this.quantity = quantity;
        this.name = name;

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

    public void withdraw( int amount)
    {
        this.quantity = this.quantity - amount;
    }

    public String getName (){
        return this.name;
    }

}


