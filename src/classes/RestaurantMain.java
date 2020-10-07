package classes;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.seatsAvailable(45);
        restaurant.seatsParty(50);
        restaurant.removeParty(45);
        restaurant.openForService("star",70);
        restaurant.printSummary();





    }
}