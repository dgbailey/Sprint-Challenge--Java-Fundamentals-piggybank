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

    public Quarter()
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
        return quantity + " " + name+"\n";
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
