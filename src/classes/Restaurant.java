package classes;

/*Create a restaurant class with attribute name, guestCapacity, guestCount
 * 1. Create a method that tells user if the seats are available
 * 2. Create a method that seatsParty
 ** 3. Create a method that removesParty
 * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
 * 5. Create a method that printsRestaurantSummary
 */

public class Restaurant {

    // Instance Variable

    private String name;
    private int guestCapacity;
    private int guestCount;

    // Constructor
    public Restaurant(){

    }
    // getter and setter

    public boolean seatsAvailable(int guestCount){
        int availableSeats = this.guestCapacity-this.guestCount;
        return availableSeats >= guestCount;
    }

    public void seatsParty(int guestCount){
        if(seatsAvailable(guestCount)){
            this.guestCount += guestCount;

        }


        }

    }





