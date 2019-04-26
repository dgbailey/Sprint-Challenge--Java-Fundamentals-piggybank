package piggybank;

public class Penny extends AbstractMoney
{

    double value = .1;
    String name = "Penny";

    public Penny(int quantity)
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
