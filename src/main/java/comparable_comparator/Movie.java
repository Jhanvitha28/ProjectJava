package comparable_comparator;
import java.util.Comparator;

public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    // Constructor
    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    // Getter methods (you can also add setters if needed)
    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    // Comparator for sorting by rating and profit
    public static class RatingProfitComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            // First, compare by rating
            int ratingComparison = Double.compare(movie2.getRating(), movie1.getRating());

            // If rating is the same, compare by profit (collectionAmount - budget)
            if (ratingComparison == 0) {
                double profit1 = movie1.getCollectionAmount() - movie1.getBudget();
                double profit2 = movie2.getCollectionAmount() - movie2.getBudget();
                return Double.compare(profit2, profit1);
            }

            return ratingComparison;
        }
    }

    // Comparator for sorting by yearReleased and rating
    public static class YearRatingComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            // First, compare by yearReleased
            int yearComparison = Integer.compare(movie1.getYearReleased(), movie2.getYearReleased());

            // If years are the same, compare by rating
            if (yearComparison == 0) {
                return Double.compare(movie2.getRating(), movie1.getRating());
            }

            return yearComparison;
        }
    }

    // Example usage:
    public static void main(String[] args) {
        // Creating Movie objects
        Movie movie1 = new Movie(2020, 8.5, 100000000, 250000000);
        Movie movie2 = new Movie(2018, 9.0, 80000000, 180000000);

        // Sorting by rating and profit
        RatingProfitComparator ratingProfitComparator = new RatingProfitComparator();
        int result1 = ratingProfitComparator.compare(movie1, movie2);
        System.out.println("Sorting by rating and profit: " + result1);

        // Sorting by yearReleased and rating
        YearRatingComparator yearRatingComparator = new YearRatingComparator();
        int result2 = yearRatingComparator.compare(movie1, movie2);
        System.out.println("Sorting by yearReleased and rating: " + result2);
    }
}

