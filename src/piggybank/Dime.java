package piggybank;

public class Dime extends AbstractMoney
{

    double value = .1;
    String name = "Dime";

    public Dime(int quantity)
    {
        this.quantity = quantity;
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return quantity + " " + name+"\n";
    }

    public double totalValue()
    {
        return this.value * this.quantity;
    }
}

