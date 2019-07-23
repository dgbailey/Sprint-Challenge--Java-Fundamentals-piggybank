package piggybank;

public class Dollar extends AbstractMoney
{

    double value = 1;
    String name = "Dollar";

    public Dollar(int quantity)
    {
        this.quantity = quantity;
        this.value = value;
        this.name = name;
    }

    public Dollar()
    {
        this.quantity = 1;
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString()

    {
        return "$" + quantity + "\n";
    }

    public double totalValue()
    {
        return this.value * this.quantity;
    }

    public void withdraw( int amount)
    {

        quantity = quantity - amount;
    }

    public String getName (){
        return this.name;
    }
}
