package piggybank;

public class Quarter extends AbstractMoney
{

    double value = .25;
    String name = "Quarter";

    public Quarter(int quantity)
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
