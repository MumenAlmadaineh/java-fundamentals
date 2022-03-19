package inheritance;

public class Restaurant {

    // Properties of restaurant class.
    String restaurantName;
    int restaurantStars;
    int restaurantNumberOfDollarSigns;

    // constructor of restaurant class.
    public Restaurant(String restaurantName, int restaurantStars, int restaurantNumberOfDollarSigns) {
        this.restaurantName = restaurantName;
        this.restaurantStars = restaurantStars;
        this.restaurantNumberOfDollarSigns = restaurantNumberOfDollarSigns;


    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getRestaurantStars() {
        return restaurantStars;
    }

    public void setRestaurantStars(int restaurantStars) {
        this.restaurantStars = restaurantStars;
    }

    public int getRestaurantNumberOfDollarSigns() {
        return restaurantNumberOfDollarSigns;
    }

    public void setRestaurantNumberOfDollarSigns(int restaurantNumberOfDollarSigns) {
        this.restaurantNumberOfDollarSigns = restaurantNumberOfDollarSigns;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                '}';
    }

    public static void addReview(){
        
    }
}


