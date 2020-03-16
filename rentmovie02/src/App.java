import com.work.movie.Customer;
import com.work.movie.Movie;
import com.work.movie.Rental;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer("a");
        Movie movie = new Movie("The World", 100);
        Rental rental = new Rental(movie, 7);
        customer.addRental(rental);
        String state = customer.statement();
        System.out.println(state);
    }
}