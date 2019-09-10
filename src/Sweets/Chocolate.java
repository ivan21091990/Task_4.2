package Sweets;

public class Chocolate extends Sweets {
    public  String view;

    public Chocolate(String title, double weight, double price, String view) {
        super(title, weight, price);
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Шоколад " + super.toString() + ", вид - " + view;
    }
}

