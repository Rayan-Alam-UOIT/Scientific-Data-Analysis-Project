/**
 * This program creates and displays an order of burritos and  
 * their total cost. It demonstrates the use of objects, constructors,
 * getters, setters, and methods in Java.
 *
 * @author Rayan Alam
 *
 */

public class BurritoOrder {
    public static void main(String[] args) {
        Burrito burritoOrderOne = new Burrito();
        burritoOrderOne.setSize("small");
        burritoOrderOne.setProtein("chicken");
        burritoOrderOne.setRice("brown");
        burritoOrderOne.setBeans("no");
        burritoOrderOne.setToppings("cheese, tomatoes");
        burritoOrderOne.setGuac(true);

        Burrito burritoOrderTwo = new Burrito("large", "sofritas");
        burritoOrderTwo.setRice("white");
        burritoOrderTwo.setBeans("kidney");
        burritoOrderTwo.setToppings("salsa, onions, cheese");
        burritoOrderTwo.setGuac(false);

        Burrito burritoOrderThree = new Burrito("large", "steak", "white", "black", "pickles, sour cream", false);

        Burrito burritoOrderFour = new Burrito("small", "carnitas", "no", "brown", "lettuce, cheese, spinach", true);
        Burrito burritoOrderFive = new Burrito("large", "chicken", "white", "green", "olives, salsa", true);
        Burrito burritoOrderSix = new Burrito("small", "sofritas", "brown", "no", "cheese, pickles", false);
        
        System.out.println("Burrito 1: " + burritoOrderOne);
        System.out.println("Burrito 2: " + burritoOrderTwo);
        System.out.println("Burrito 3: " + burritoOrderThree);

        System.out.println("Burrito 4: " + burritoOrderFour);
        System.out.println("Burrito 5: " + burritoOrderFive);
        System.out.println("Burrito 6: " + burritoOrderSix);
        
    }
}