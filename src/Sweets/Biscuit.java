package Sweets;

public class Biscuit extends Sweets {
    public String type;

    public Biscuit(String title, double weight, double price,String type) {
        super(title, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Печенье " + super.toString() + " , тип - " + type;
    }
}

