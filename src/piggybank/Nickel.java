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

    public Nickel()
    {
        this.quantity = 1;
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString()
    {
        if(this.quantity > 1){
            return quantity + " "+ name+"s"+"\n";
        }

        return quantity + " "+ name+"\n";

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
