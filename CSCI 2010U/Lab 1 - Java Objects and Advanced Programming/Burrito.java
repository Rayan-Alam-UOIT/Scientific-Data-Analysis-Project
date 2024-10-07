/**
 * This program creates and displays an order of burritos and  
 * their total cost. It demonstrates the use of objects, constructors,
 * getters, setters, and methods in Java.
 *
 * @author Rayan Alam
 *
 */

public class Burrito {
    private String size;
    private String protein;
    private String rice;
    private String beans;
    private String toppings;
    private boolean guac;

    public Burrito() {
        this.size = "small";
        this.protein = "no protein";
        this.rice = "no rice";
        this.beans = "no beans";
        this.toppings = "no toppings";
        this.guac = false;
    }

    public Burrito(String size, String protein) {
        this.size = size;
        this.protein = protein;
        this.rice = "no rice";
        this.beans = "no beans";
        this.toppings = "no toppings";
        this.guac = false;
    }

    public Burrito(String size, String protein, String rice, String beans, String toppings, boolean guac) {
        this.size = size;
        this.protein = protein;
        this.rice = rice;
        this.beans = beans;
        this.toppings = toppings;
        this.guac = guac;
    }

    public String getSize() {
        return size;
    }

    public String getProtein() {
        return protein;
    }

    public String getRice() {
        return rice;
    }

    public String getBeans() {
        return beans;
    }

    public String getToppings() {
        return toppings;
    }

    public boolean getGuac() { 
        return guac; 
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setGuac(boolean guac) {
        this.guac = guac;
    }

    public double getCost() {
        double cost = 0.0;

        if (size.equals("small")) {
            cost += 5.00;
        }
        else {
            cost += 7.50;
        }

        if (protein == "chicken" || protein == "steak") {
            cost += 2.00;
        }
        else if (protein == "carnitas" || protein == "sofritas") {
            cost += 3.00;
        }

        if (rice != ("no")) {
            cost += 1.00;
        }

        if (beans != ("no")) {
            cost += 1.00;
        }

        if (guac == true) {
            cost += 2.00;
        }
        return cost;
    }

    @Override
    public String toString() {
        String guacamole;
        if (guac == true) {
            guacamole = "guacamole.";
        }
        else {
            guacamole = "no guacamole.";
        }
        return size + " " + protein + " Burrito with " + rice + " rice, " + beans + " beans, " + toppings + ", and " + guacamole +  "\nTotal Cost: " + "$" + getCost(); 
    }
}
