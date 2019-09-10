package Sweets;

public class Present {

    public static void main(String[] args) {

        Fruits fruits = new Fruits("Апельсины",2.5,100,36.7);
        Biscuit biscuit = new Biscuit("Юбилейное",1.5,70,"Песочное");
        Chocolate chocolate = new Chocolate("Mars", 0.3,50, "Батончик");


        Sweets [] newYearPresent = {fruits,biscuit,chocolate};
        System.out.println("Новогодний подарок содержит:");
        for (Sweets someSweets : newYearPresent){
            System.out.println(someSweets.toString());
        }
        System.out.println();

    }
}
