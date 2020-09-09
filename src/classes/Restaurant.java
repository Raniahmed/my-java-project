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

    String name = "Star";
    double guestCapacity;
    double guestCount;

    // Constructor
    public Restaurant(){

    }
    // getter and setter

    public double getSeats(double guestCapacity,double guestCount){
        return guestCapacity - guestCount;
    }
    public double getGuestCapacity(double guestCapacity){
        return guestCapacity;
    }
    public void setGuestCapacity(double guestCapacity){
        this.guestCapacity = guestCapacity;
    }
    public double getGuestCount(double guestCount){
        return guestCount;
    }
    public void setGuestCount(double guestCount){
        this.guestCount = guestCount;
    }

    }


