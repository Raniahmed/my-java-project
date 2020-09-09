package classes;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        //set Value
        restaurant.setGuestCapacity(500);
        restaurant.setGuestCount(450);

        System.out.println("Restaurant Name : " + restaurant.name);
        System.out.println("Restaurant Guest Capacity : " + restaurant.getGuestCapacity(500));
        System.out.println("Restaurant guest Count : " + restaurant.getGuestCount(450));
        System.out.println("Available seats are : " + restaurant.getSeats(500,450));

    }
}


