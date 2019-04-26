package piggybank;

public class Penny extends AbstractMoney
{

    double value = .01;
    String name = "Penny";
    String namePlural = "Pennies";

    public Penny(int quantity)
    {
        this.quantity = quantity;
        this.value = value;
        this.name = name;
    }

    public Penny()
    {
        this.quantity = 1;
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString()
    {
        if(this.quantity > 1){
        return quantity + " "+ namePlural+"\n";
    }
        return quantity + " " + name+"\n";
    }

    public double totalValue()
    {
        return this.value * this.quantity;
    }
}
