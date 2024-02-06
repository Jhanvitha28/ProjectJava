package streams;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Double{
    public static ArrayList<Integer> doubleOddNumbers(ArrayList<Integer> al){
        ArrayList<Integer> doubledNumbers = al.stream()
                .filter(a -> a % 2 != 0)
                .map(a -> a * 2)  // Double each remaining number
                .collect(Collectors.toCollection(ArrayList::new));

        return doubledNumbers;
    }
}