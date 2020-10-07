package classes;

/*
* Create a class named GiftCard
* Create instance variables (balance, isActivated, validThrough)
* Create constructors
* Getters and setters
* Other methods:
*   - loadCard(), min and maximum value
*   - isExpired(), valid date
*   - purchase(), maximum value
*   -
*
*
* */

public class GiftCard {
    // Instance Variable
    private double balance;
    private boolean activated;
    private double minimum = 10.0;
    private double maximum = 500.0;

    //Constructor
    public GiftCard(boolean activate) {
        this.activated = activate;
    }

    // getter and setter
    public boolean isActivated(){
        return this.activated;
    }

    public double getBalance() {
        return this.balance;
    }

    public void loadCard(double amount){
        if (this.balance == maximum){
            System.out.println("Can't load more than 500!");
            return;
        }
        if(amount < minimum || amount > maximum){
            System.out.println("Card can't not be loaded!");
        }
        else{
            this.balance += amount;
        }
    }

    public void purchase(double total){
        if(this.balance < total){
            System.out.println("Not enough balance!");
            return;
        }
        this.balance -= total;
    }


}





