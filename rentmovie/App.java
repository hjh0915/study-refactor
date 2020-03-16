import com.work.movie.Customer;
import com.work.movie.Movie;
import com.work.movie.Rental;

public class App {
    public static void main(String[] args) {
        //第一个客人
        Customer customer1 = new Customer("a");
        Movie movie1 = new Movie("The World", 0);
        Rental rental1 = new Rental(movie1, 7);
        customer1.addRental(rental1);
        //第二个客人
        Customer customer2 = new Customer("b");
        Movie movie2 = new Movie("A Dog's Life", 1);
        Rental rental2 = new Rental(movie2, 5);
        customer2.addRental(rental2);

        String state1 = customer1.statement();
        String state2 = customer2.statement();
        System.out.println(state1);
        System.out.println(state2);
    }
}