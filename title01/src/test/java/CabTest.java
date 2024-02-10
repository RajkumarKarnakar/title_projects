import org.example.Cab;
import java.time.LocalDate;

public class CabTest {
    public static void main(String[] args) {
        Cab cab1= new Cab(new StringBuilder("driver1"),("passenger1"), LocalDate.parse("2020-10-10"),25,"pune","pimpri");
        Cab cab2= new Cab(new StringBuilder("driver1"),("passenger1"), LocalDate.parse("2020-10-10"),25,"pune","pimpri");
        System.out.println(cab1.toString());
        System.out.println(cab2.toString());
        System.out.println(Double.compare(10.15,10.25));

    }
}
