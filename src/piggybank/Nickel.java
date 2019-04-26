package piggybank;

public class Nickel extends AbstractMoney
{

    double value = .05;
    String name = "Nickel";

    public Nickel(int quantity)
    {
        this.quantity = quantity;
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return quantity + "  " + name+"\n";
    }

    public double totalValue()
    {
        return this.value * this.quantity;
    }
}
