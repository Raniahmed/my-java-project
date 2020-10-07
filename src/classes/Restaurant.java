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
    //method seatsAvailable
    public boolean seatsAvailable(int guestCount){
        int availableSeats = this.guestCapacity-this.guestCount;
        return availableSeats >= guestCount;
    }
    // method seatsParty
    public void seatsParty(int guestCount){
        if(seatsAvailable(guestCount)){
            this.guestCount += guestCount;
        }
    }
    // method removeParty
    public void removeParty(int guestCount){
        if (this.guestCount >= guestCount){
            this.guestCount -= guestCount;

        }
    }
    // method open for service by passing Restaurant
    // (name/guest capacity)

    public void openForService(String name,int guestCapacity){
        this.name = name;
        this.guestCapacity = guestCapacity;
    }
    // Restaurant Print Summary
    public void printSummary(){
        System.out.println("Restaurant name :" + name);
        System.out.println("Restaurant Guest Capacity :" + guestCapacity);
        System.out.println("Number of guest"+ guestCount);

    }

    }






