package Sweets;

public class Fruits extends Sweets {
    public double calories;

    public Fruits(String title, double weight, double price,double calories) {
        super(title, weight, price);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString()+ ", энергетическая ценность - " + calories + " кКал";
    }
}
